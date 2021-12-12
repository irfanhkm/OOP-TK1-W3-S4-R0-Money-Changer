package com.irfanhkm.services;

public class PoundsterlingChangerService extends RupiahChangerAbstract {

    public PoundsterlingChangerService() {
        this.baseRupiahPrice = 15000;
        this.suffixCurrency = "Poundsterling";
        this.prefixCurrency = "£";
    }
}