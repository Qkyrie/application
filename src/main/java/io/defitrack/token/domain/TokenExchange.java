package io.defitrack.token.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TokenExchange {
    private String wallet;
    private Token from;
    private Token to;
    private BigInteger fromAmount;
    private BigInteger toAmount;

    public TokenExchange(String wallet, Token from, Token to, BigInteger fromAmount, BigInteger toAmount) {
        this.wallet = wallet;
        this.from = from;
        this.to = to;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
    }

    private double decimalFromAmount() {
        return new BigDecimal(fromAmount).divide(BigDecimal.valueOf(10).pow(from.getDecimals()), 6, RoundingMode.HALF_UP).doubleValue();
    }

    private double decimalToAmount() {
        return new BigDecimal(toAmount).divide(BigDecimal.valueOf(10).pow(to.getDecimals()), 6, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        return "TokenExchange{" +
                "wallet='" + wallet + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", fromAmount=" + fromAmount +
                ", toAmount=" + toAmount +
                '}';
    }
}
