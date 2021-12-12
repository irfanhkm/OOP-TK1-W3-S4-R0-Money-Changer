package com.irfanhkm.services;

import java.text.DecimalFormat;

public abstract class RupiahChangerAbstract {

    /**
     * formmating zero outside comma
     */
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    /**
     * ini merupakan harga dasar dari rupiah
     */
    protected double baseRupiahPrice = 12000;

    /**
     * Suffix currency, ex: Dollar
     */
    protected String suffixCurrency = "Dollar";

    /**
     * Prefix currency, ex: $
     */
    protected String prefixCurrency = "$";

    protected void output(double result, double inputMoney)
    {
        System.out.println("Dengan Rp "+ inputMoney +" anda memperoleh "+ prefixCurrency
            +""+ dfZero.format(result) +" " + suffixCurrency);
    }

    public void calculate(double inputMoney) {
        double result = inputMoney / baseRupiahPrice;
        output(result, inputMoney);
    }
}
