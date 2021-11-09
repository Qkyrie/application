package io.defitrack.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3jConfig {

    @Bean
    public Web3j provideWeb3j(@Value("${io.defitrack.ropsten.endpoint.url}") String endpointUrl) {
        return Web3j.build(new HttpService(endpointUrl));
    }
}
