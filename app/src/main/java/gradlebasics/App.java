package gradlebasics;

public class App {

    public static void main(String[] args) {
        var uahValue1 = 1000.0;
        var usdValue1 = CurrencyConverter.convertUAHtoUSD(uahValue1);
        System.out.println(uahValue1 + " UAH = " + usdValue1 + " USD");

        var usdValue2 = 1000.0;
        var uahValue2 = CurrencyConverter.convertUSDtoUAH(usdValue2);
        System.out.println(usdValue2 + " USD = " + uahValue2 + " UAH");

        var uahValue3 = 1000.0;
        var eurValue3 = CurrencyConverter.convertUAHtoEUR(uahValue3);
        System.out.println(uahValue3 + " UAH = " + eurValue3 + " EUR");

        var eurValue4 = 1000.0;
        var uahValue4 = CurrencyConverter.convertEURtoUAH(eurValue4);
        System.out.println(eurValue4 + " EUR = " + uahValue4 + " UAH");
    }
}