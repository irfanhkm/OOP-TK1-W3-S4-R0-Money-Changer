package com.irfanhkm.enums;

public enum CurrencyEnum {
    DOLLAR("USD", true),
    EURO("Euro", true),
    POUNDSTERLING("Pounds", false);

    private final String detail;
    private final boolean isActive;

    CurrencyEnum(String detail, boolean isActive) {
        this.detail = detail;
        this.isActive = isActive;
    }

    static public CurrencyEnum isMemberAndActive(String name) {
        CurrencyEnum[] classValue = CurrencyEnum.values();
        for (CurrencyEnum value : classValue)
            if (value.detail.equals(name) && value.isActive)
                return value;
        return null;
    }

    static public String getActiveCurrency() {
        CurrencyEnum[] classValue = CurrencyEnum.values();
        StringBuilder activeCurrency = new StringBuilder();
        for (CurrencyEnum value : classValue) {
            if (value.isActive) {
                if (activeCurrency.length() > 0) {
                    activeCurrency.append(" | ");
                }
                activeCurrency.append(value.detail);
            }
        }
        return activeCurrency.toString();
    }
}