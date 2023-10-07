package com.bohdanmarko;

import org.junit.Test;

public class CurrencyConverterTests {
    
    @Test
    public void testConvertUAHtoUSD() {
        assert CurrencyConverter.convertUAHtoUSD(27.0) == 1.0;
    }

    @Test
    public void testConvertUSDtoUAH() {
        assert CurrencyConverter.convertUSDtoUAH(1.0) == 27.0;
    }

    @Test
    public void testConvertUAHtoEUR() {
        assert CurrencyConverter.convertUAHtoEUR(32.0) == 1.0;
    }

    @Test
    public void testConvertEURtoUAH() {
        assert CurrencyConverter.convertEURtoUAH(1.0) == 32.0;
    }
}