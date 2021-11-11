package io.defitrack.token.event;

import java.math.BigInteger;
import java.util.Objects;

public class ContractExchangeEvent {

    public ContractExchangeEvent(String wallet, String srcToken, BigInteger srcAmount,
                                 String destToken, BigInteger destAmount) {
        this.wallet = wallet;
        this.srcToken = srcToken;
        this.srcAmount = srcAmount;
        this.destToken = destToken;
        this.destAmount = destAmount;
    }

    private String wallet;
    private String srcToken;
    private BigInteger srcAmount;
    private String destToken;
    private BigInteger destAmount;

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getSrcToken() {
        return srcToken;
    }

    public void setSrcToken(String srcToken) {
        this.srcToken = srcToken;
    }

    public BigInteger getSrcAmount() {
        return srcAmount;
    }

    public void setSrcAmount(BigInteger srcAmount) {
        this.srcAmount = srcAmount;
    }

    public String getDestToken() {
        return destToken;
    }

    public void setDestToken(String destToken) {
        this.destToken = destToken;
    }

    public BigInteger getDestAmount() {
        return destAmount;
    }

    public void setDestAmount(BigInteger destAmount) {
        this.destAmount = destAmount;
    }

    @Override
    public String toString() {
        return "ExchangeEvent{" +
                "wallet='" + wallet + '\'' +
                ", srcToken='" + srcToken + '\'' +
                ", srcAmount=" + srcAmount +
                ", destToken='" + destToken + '\'' +
                ", destAmount=" + destAmount +
                '}';
    }
}
