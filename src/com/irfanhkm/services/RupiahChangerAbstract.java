package com.irfanhkm.services;

abstract class RupiahChangerAbstract {
    /**
     * ini merupakan harga dasar dari rupiah
     */
    public double baseRupiahPrice = 12000;

    /**
     * Suffix currency, ex: Dollar
     */
    public String suffixCurrency = "Dollar";

    /**
     * Prefix currency, ex: $
     */
    public String prefixCurrency = "$";

    protected void output(double result, double inputMoney)
    {
        System.out.println("Dengan Rp "+ (long) inputMoney +" anda memperoleh "+ prefixCurrency
            +""+ (long) result +" " + suffixCurrency);
    }

    public void calculate(double inputMoney) {
        double result = inputMoney / baseRupiahPrice;
        output(result, inputMoney);
    }
}
