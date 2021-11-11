package io.defitrack;

import io.defitrack.token.ERC20Service;
import io.defitrack.token.domain.Token;
import io.defitrack.token.domain.TokenExchange;
import io.defitrack.token.event.TokenExchangedExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Optional;

@SpringBootApplication
public class Application {

    @Autowired
    private TokenExchangedExtractor tokenExchangedFinder;
    @Autowired
    private ERC20Service erc20Service;

    @PostConstruct
    public void init() {
        System.out.println("getting events");
        tokenExchangedFinder.getTokenExchangedEvents(9150365L).stream().map(event -> {
                    System.out.println(event);
                    return event.map(e -> {
                        System.out.println(e);
                        return new TokenExchange(
                                e.getWallet(),
                                getTokenInformation(e.getSrcToken()).orElse(null),
                                getTokenInformation(e.getDestToken()).orElse(null),
                                e.getSrcAmount(),
                                e.getDestAmount()
                        );
                    });
                }).filter(Optional::isPresent)
                .forEach(x -> System.out.println(x.get()));
    }

    private Optional<Token> getTokenInformation(String address) {
        return erc20Service.getTokenInformation(address);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
