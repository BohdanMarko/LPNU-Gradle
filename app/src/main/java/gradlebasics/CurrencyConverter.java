package gradlebasics;

public class CurrencyConverter {

    private static final double USD_COEFFICIENT = 36.5;
    private static final double EUR_COEFFICIENT = 38.6;

    public static double convertUAHtoUSD(double uah) {
        if (uah < 0) {
            throw new IllegalArgumentException("Amount of money cannot be negative");
        }
        return uah / USD_COEFFICIENT;
    }

    public static double convertUSDtoUAH(double usd) {
        if (usd < 0) {
            throw new IllegalArgumentException("Amount of money cannot be negative");
        }
        return usd * USD_COEFFICIENT;
    }

    public static double convertUAHtoEUR(double uah) {
        if (uah < 0) {
            throw new IllegalArgumentException("Amount of money cannot be negative");
        }
        return uah / EUR_COEFFICIENT;
    }

    public static double convertEURtoUAH(double eur) {
        if (eur < 0) {
            throw new IllegalArgumentException("Amount of money cannot be negative");
        }
        return eur * EUR_COEFFICIENT;
    }
}