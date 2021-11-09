package io.defitrack.token;

import org.web3j.protocol.Web3j;

public class ERC20Contract {
    private Web3j web3j;
    private String abi;
    private String address;

    public ERC20Contract(Web3j web3j, String abi, String address) {
        this.web3j = web3j;
        this.abi = abi;
        this.address = address;
    }
}
