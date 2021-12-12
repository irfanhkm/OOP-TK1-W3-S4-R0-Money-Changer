package com.irfanhkm.services;

public class EuroChangerService extends RupiahChangerAbstract {

    public EuroChangerService() {
        this.baseRupiahPrice = 15000;
        this.suffixCurrency = "Euro";
        this.prefixCurrency = "€";
    }
}