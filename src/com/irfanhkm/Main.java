package com.irfanhkm;

import com.irfanhkm.enums.CurrencyEnum;
import com.irfanhkm.services.EuroChangerService;
import com.irfanhkm.services.PoundsterlingChangerService;
import com.irfanhkm.services.USDChangerService;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        List<CurrencyEnum> activeCurrency = CurrencyEnum.getActiveCurrency();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Money Changer - ForeignerMoney");
        System.out.println("============================== \n \n");
        do {
            try {

                System.out.print("Masukkan Jenis Mata Uang Asing " + mapListActiveCurrency(activeCurrency) + " : ");
                String inputCurrency = scanner.nextLine();
                Optional<CurrencyEnum> enumValue = activeCurrency.stream().filter(currencyEnum -> currencyEnum.detail.equals(inputCurrency)).findFirst();
                if (enumValue.isPresent()) {
                    System.out.print("Masukkan Nominal Uang yang akan ditukarkan : ");
                    double money = scanner.nextDouble();
                    switch (enumValue.get()) {
                        case DOLLAR:
                            (new USDChangerService()).calculate(money);
                            break;
                        case EURO:
                            (new EuroChangerService()).calculate(money);
                            break;
                        case POUNDSTERLING:
                            (new PoundsterlingChangerService()).calculate(money);
                            break;
                    }

                } else {
                    System.out.println("Mata Uang Yang Anda Masukkan Salah, Silahkan Coba Kembali!");
                }
                scanner.nextLine();
                System.out.println();
                System.out.println();
                System.out.println();
            } catch (InputMismatchException $e) {
                System.out.println("Input yang anda masukkan salah, Silahkan Coba Kembali!");
            }

        } while (true);
    }

    /**
     * Input: List<CurrencyEnum>
     * @Ouput: USD | EURO | BATH | YEN
     * @param List<CurrencyEnum> activeCurrency
     * @return String strBuilder
     */
    protected static String mapListActiveCurrency(List<CurrencyEnum> activeCurrency) {
        StringBuilder strBuilder = new StringBuilder();
        for (CurrencyEnum curr : activeCurrency) {
            if (strBuilder.length() > 0)
                strBuilder.append(" | ");

            strBuilder.append(curr.detail);
        }
        return strBuilder.toString();

    }
}
