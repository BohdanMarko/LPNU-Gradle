package com.bohdanmarko;

import org.junit.Test;

public class CurrencyConverterTests {
    
    @Test
    public void testConvertUAHtoUSD() {
        var expected = 1.0;
        var actual = CurrencyConverter.convertUAHtoUSD(27.0);
        assert actual == expected;
    }

    @Test
    public void testConvertUSDtoUAH() {
        var expected = 27.0;
        var actual = CurrencyConverter.convertUSDtoUAH(1.0);
        assert actual == expected;
    }

    @Test
    public void testConvertUAHtoEUR() {
        var expected = 1.0;
        var actual = CurrencyConverter.convertUAHtoEUR(32.0);
        assert actual == expected;
    }

    @Test
    public void testConvertEURtoUAH() {
        var expected = 32.0;
        var actual = CurrencyConverter.convertEURtoUAH(1.0);
        assert actual == expected;
    }
}