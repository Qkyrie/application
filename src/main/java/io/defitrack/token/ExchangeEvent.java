package io.defitrack.token;

import java.math.BigInteger;

public class ExchangeEvent {

    public ExchangeEvent(String wallet, String srcToken, BigInteger srcAmount,
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
}
