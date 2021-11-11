package io.defitrack.token;

import io.defitrack.token.domain.Token;
import org.springframework.stereotype.Component;
import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.protocol.Web3j;
import org.web3j.tx.ReadonlyTransactionManager;
import org.web3j.tx.TransactionManager;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ERC20Service {

    private Web3j web3j;


    public ERC20Service(Web3j web3j) {
        this.web3j = web3j;
    }

    private static final String NATIVE_ADDRESS = "0xeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
    private final Map<String, Token> tokenBuffer = new ConcurrentHashMap<>();

    private ERC20 loadERC20(String address) {
        System.out.println("loading " + address);
        return ERC20.load(address, web3j, new ReadonlyTransactionManager(web3j, "0x83A524af3cf8eB146132A2459664f7680A5515bE"), null);
    }

    public Optional<Token> getTokenInformation(String address) {
        return Optional.ofNullable(tokenBuffer.computeIfAbsent(address, (a) -> {
                    if (NATIVE_ADDRESS.equals(address)) {
                        return new Token(
                                address, "Ether", "ETH", 18
                        );
                    } else {
                        try {
                            final ERC20 erc20 = loadERC20(address);
                            System.out.println(erc20);
                            return new Token(
                                    address, erc20.name().send(), erc20.symbol().send(), erc20.decimals().send().intValue()
                            );
                        } catch (Exception exception) {
                            exception.printStackTrace();
                            return null;
                        }
                    }
                })
        );
    }
}
