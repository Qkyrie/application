package io.defitrack.token.event;

import org.springframework.stereotype.Component;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.EventValues;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterNumber;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.EthBlock;
import org.web3j.protocol.core.methods.response.EthLog;
import org.web3j.protocol.core.methods.response.Log;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TokenExchangedExtractor {

    public static final String EVENT_EMITTER_ADDRESS = "0x77b7da519f9f856d9f6455e60ddccd208ab1a916";
    private final Web3j web3j;

    private static final Event EXCHANGED_EVENT = new Event("TokenExchanged",
            Arrays.asList(
                    new TypeReference<Address>(true) {
                    },
                    new TypeReference<Address>(false) {
                    },
                    new TypeReference<Uint256>() {
                    },
                    new TypeReference<Address>(false) {
                    },
                    new TypeReference<Uint256>() {
                    })
    );

    public TokenExchangedExtractor(Web3j web3j) {
        this.web3j = web3j;
    }

    public List<Optional<ContractExchangeEvent>> getTokenExchangedEvents(Long blockNumber) {
        try {
            final EthBlock.Block block = web3j.ethGetBlockByNumber(new DefaultBlockParameterNumber(blockNumber), true).send().getBlock();
            EthFilter ethFilter = new EthFilter(block.getHash(), EVENT_EMITTER_ADDRESS);
            ethFilter.addOptionalTopics(EventEncoder.encode(EXCHANGED_EVENT));
            return web3j.ethGetLogs(ethFilter).send().getLogs().stream().map(log -> getEventParameters(EXCHANGED_EVENT, ((EthLog.LogObject) log.get()).get())).collect(Collectors.toList());
        } catch (Exception exception) {
            exception.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Optional<ContractExchangeEvent> getEventParameters(
            Event event, Log log) {
        final List<String> topics = log.getTopics();
        final String encodedEventSignature = EventEncoder.encode(event);
        if (!topics.get(0).equals(encodedEventSignature)) {
            return Optional.empty();
        }

        final List<Type> indexedValues = new ArrayList<>();
        final List<Type> nonIndexedValues = FunctionReturnDecoder.decode(
                log.getData(), event.getNonIndexedParameters());

        final List<TypeReference<Type>> indexedParameters = event.getIndexedParameters();
        for (int i = 0; i < indexedParameters.size(); i++) {
            Type value = FunctionReturnDecoder.decodeIndexedValue(
                    topics.get(i + 1), indexedParameters.get(i));
            indexedValues.add(value);
        }


        final EventValues eventValues = new EventValues(indexedValues, nonIndexedValues);
        return Optional.of(new ContractExchangeEvent(
                (String) eventValues.getIndexedValues().get(0).getValue(),
                (String) eventValues.getNonIndexedValues().get(0).getValue(),
                (BigInteger) eventValues.getNonIndexedValues().get(1).getValue(),
                (String) eventValues.getNonIndexedValues().get(2).getValue(),
                (BigInteger) eventValues.getNonIndexedValues().get(3).getValue()
        ));
    }
}
