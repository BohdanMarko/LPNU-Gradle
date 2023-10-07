package com.bohdanmarko;

public class CurrencyConverter {

    private static final double USD_COEFFICIENT = 27.0;
    private static final double EUR_COEFFICIENT = 32.0;

    public static double convertUAHtoUSD(double uah) {
        return uah / USD_COEFFICIENT;
    }

    public static double convertUSDtoUAH(double usd) {
        return usd * USD_COEFFICIENT;
    }

    public static double convertUAHtoEUR(double uah) {
        return uah / EUR_COEFFICIENT;
    }

    public static double convertEURtoUAH(double eur) {
        return eur * EUR_COEFFICIENT;
    }
}