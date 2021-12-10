# Money Changer
Just simple money change. TK Binus

Set isActive Enum Data to true for activating currency on input prompt
```
CurrencyEnum(String detail, boolean isActive) {
        this.detail = detail;
        this.isActive = isActive;
    }
```

Then add implementation on main class
```
switch (enumValue) {
    case DOLLAR:
       (new USDChangerService()).calculate(money);
       break;
    case EURO:
    case POUNDSTERLING:
        // TODO euro poundsterling
        System.out.println("Currency belum dissuport");
    }
```