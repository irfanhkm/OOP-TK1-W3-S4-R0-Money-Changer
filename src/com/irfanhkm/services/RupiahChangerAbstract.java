package com.irfanhkm.services;

abstract class RupiahChangerAbstract {
    /**
     * Angka yang akan dikalikan ketika melkaukan konversi ke rupiah
     */
    public double oneRupiahPrice = 12000;

    public String currencyString = "dollar";

    public String currencySymbol = "$";

    protected void output(double result, double inputMoney)
    {
        System.out.println("Dengan Rp "+ (long) inputMoney +" anda memperoleh "+ currencySymbol +""+ (long) result +" " + currencyString);
    }

    public void calculate(double inputMoney) {
        double result = oneRupiahPrice * inputMoney;
        output(result, inputMoney);
    }
}
