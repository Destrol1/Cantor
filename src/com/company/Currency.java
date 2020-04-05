package com.company;

import java.util.Scanner;

public class Currency {

    public TradeModel tradeModel = new TradeModel();

    public void setCurrency1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide currency1: ");
        String currency1 = scan.nextLine();
        tradeModel.currency1 = currency1;
    }

    public String getCurrency1() {
        return tradeModel.currency1;
    }

    public void setCurrency2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide currency2: ");
        String currency2 = scan.nextLine();
        tradeModel.currency2 = currency2;
    }

    public String getCurrency2() {
        return tradeModel.currency2;
    }

}

