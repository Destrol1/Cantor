package com.company;

public class Dispaly {
    public static Currency currency = new Currency();
    public static TradeDate tradeDate = new TradeDate();
    public static Helper helper = new Helper();

    public void displayTransaction(){
        System.out.print("------------------------------\n");
        System.out.print("\t\t\tCANTOR\n");
        System.out.print("------------------------------\n");
        System.out.print("Trade date: ");
        tradeDate.getTradeDate();
        System.out.print("Provide rate: \n");
        helper.setRate();
        System.out.print("Provide amount: \n");
        helper.setAmount();
        currency.setCurrency1();
        currency.setCurrency2();
        //calculate transaction
        System.out.print(helper.calculate(helper.getRate(), helper.getAmount()));
    }

}
