package io.defitrack.contract;

import org.springframework.stereotype.Component;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthCall;

import java.util.Collections;
import java.util.List;

@Component
public class ContractAccessor {

    private Web3j web3j;

    public ContractAccessor(Web3j web3j) {
        this.web3j = web3j;
    }

    public List<? extends Type> executeCall(String address, Function function) {
        try {
            final String encodedFunction = FunctionEncoder.encode(function);
            final EthCall ethCall = web3j.ethCall(
                    Transaction.createEthCallTransaction(
                            "0x0000000000000000000000000000000000000000",
                            address,
                            encodedFunction
                    ), DefaultBlockParameterName.LATEST
            ).send();
            return FunctionReturnDecoder.decode(ethCall.getValue(), function.getOutputParameters());
        } catch (Exception exception) {
            exception.printStackTrace();
            return Collections.emptyList();
        }
    }
}
