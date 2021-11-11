package io.defitrack.token.domain;

public class Token {
    private String address;
    private String name;
    private String symbol;
    private int decimals = 18;

    public Token(String address, String name, String symbol, int decimals) {
        this.address = address;
        this.name = name;
        this.symbol = symbol;
        this.decimals = decimals;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }
}
