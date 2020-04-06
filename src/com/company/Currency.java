package com.company;

import java.util.Scanner;

public class Currency {

    public TradeModel tradeModel = new TradeModel();

    public void setCurrency1(){

        Scanner scanner = new Scanner(System.in);
        String currency1;
        do {
            System.out.print("Provide currency1: /EUR/USD/GBP/PLN \n");
            currency1 = scanner.nextLine();
        }
        while (!"EUR".equals(currency1) && !"USD".equals(currency1)&& !"GBP".equals(currency1)&& !"PLN".equals(currency1));
        tradeModel.currency1 = currency1;
    }

    public String getCurrency1() {
        return tradeModel.currency1;
    }

    public void setCurrency2(){
        Scanner scanner = new Scanner(System.in);
        String currency2;
        do {
            System.out.print("Provide currency2: /EUR/USD/GBP/PLN \n");
            currency2 = scanner.nextLine();
        }
        while (!"EUR".equals(currency2) && !"USD".equals(currency2)&& !"GBP".equals(currency2)&& !"PLN".equals(currency2));
        tradeModel.currency2 = currency2;
    }

    public String getCurrency2() {
        return tradeModel.currency2;
    }

}

