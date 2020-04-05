package com.company;

import java.io.FileNotFoundException;

public class Main {
//    public static Currency currency = new Currency();
//    public static TradeDate tradeDate = new TradeDate();
//    public static Helper helper = new Helper();
    public static Dispaly dispaly = new Dispaly();

    public static void main(String[] args) throws FileNotFoundException {

//        dane.setKlient(); // pobiera dane klienta
//        System.out.print(dane.getKlient()); // wyswietla dane klienta
//        System.out.print("\n");
//
//        kurs.setKurs(); //obliczannieKurs
//       System.out.print(kurs.getKurs()); // wyswietla kurs
//        System.out.print("\n");
//
//       ilosc.setAmount(); // ustawia ilosc
//       System.out.print(ilosc.getAmount()); // wyswietla ilosc
//        System.out.print("\n");
//
//        kursilosc.setValue(ilosc.getAmount(), kurs.getKurs());  // liczy kurs * ilosc
//        System.out.print("\n");
//        aktualnyczas.getTradeDate(); //wyswietla czas
//
//        zapisDopliku.zapisDopliku();

//------------------------------------------------------------
//        System.out.print("------------------------------\n");
//        System.out.print("\t\t\tKANTOR\n");
//        System.out.print("------------------------------\n");
//        System.out.print("Trade date: ");
//        tradeDate.getTradeDate();
//        System.out.print("Provide rate: \n");
//        helper.setRate();
//        System.out.print("Provide amount: \n");
//        helper.setAmount();
//        currency.setCurrency1();
//        currency.setCurrency2();
//        //calculate transaction
//        System.out.print(helper.calculate(helper.getRate(), helper.getAmount()));

        dispaly.displayTransaction();

//        float result = Currencies.EUR.calculate(helper.getRate(), helper.getAmount());
//        System.out.print("Transaction result: " + result);
//        helper.getRate();
//        currency.getAmount();
//        helper.getValue(helper.getRate(), helper.getAmount());

//        float result = Currencies.CHF.calculate(helper.getRate(), helper.getAmount());
//        System.out.println(result); //3.0
    }
}

