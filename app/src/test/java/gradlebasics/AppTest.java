package gradlebasics;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testConvertUAHtoUSD() {
        var expected = 1.0;
        var actual = CurrencyConverter.convertUAHtoUSD(36.5);
        assert actual == expected;
    }

    @Test
    public void testConvertUSDtoUAH() {
        var expected = 36.5;
        var actual = CurrencyConverter.convertUSDtoUAH(1.0);
        assert actual == expected;
    }

    @Test
    public void testConvertUAHtoEUR() {
        var expected = 1.0;
        var actual = CurrencyConverter.convertUAHtoEUR(38.6);
        assert actual == expected;
    }

    @Test
    public void testConvertEURtoUAH() {
        var expected = 38.6;
        var actual = CurrencyConverter.convertEURtoUAH(1.0);
        assert actual == expected;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertUAHtoUSDException() {
        CurrencyConverter.convertUAHtoUSD(-1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertUSDtoUAHException() {
        CurrencyConverter.convertUSDtoUAH(-1.0);
    }
}
