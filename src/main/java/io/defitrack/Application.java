package io.defitrack;

import io.defitrack.token.TokenExchangedFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    @Autowired
    private TokenExchangedFinder tokenExchangedFinder;

    @PostConstruct
    public void init() {
        tokenExchangedFinder.getTokenExchangedEvents(9150365L).forEach(x -> {
            System.out.println(x.get());
        });
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
