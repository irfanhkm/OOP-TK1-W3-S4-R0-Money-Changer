package com.irfanhkm.enums;

import java.util.ArrayList;
import java.util.List;

public enum CurrencyEnum {
    DOLLAR("USD", true),
    EURO("Euro", true),
    POUNDSTERLING("Pounds", false);

    public final String detail;
    private final boolean isActive;

    CurrencyEnum(String detail, boolean isActive) {
        this.detail = detail;
        this.isActive = isActive;
    }

    static public List<CurrencyEnum> getActiveCurrency() {
        CurrencyEnum[] classValue = CurrencyEnum.values();
        List<CurrencyEnum> activeCurrency = new ArrayList<>();
        for (CurrencyEnum value : classValue) {
            if (value.isActive) {
                activeCurrency.add(value);
            }
        }
        return activeCurrency;
    }
}