package com.company;

public class Display {
    public static Currency currency = new Currency();
    public static TradeDate tradeDate = new TradeDate();
    public static Helper helper = new Helper();

    public void displayTransaction(){
        System.out.print("------------------------------\n");
        System.out.print("\t\t\tCANTOR\n");
        System.out.print("------------------------------\n");
        System.out.print("Trade date: ");
        tradeDate.getTradeDate();
        //    System.out.print("Provide rate: \n");
        //    helper.setRate();
        System.out.print("Provide amount: \n");
        helper.setAmount();
        currency.setCurrency1();
        currency.setCurrency2();
        helper.setCurrencyPair(currency.getCurrency1(), currency.getCurrency2());
        helper.setRate();
        //calculate transaction
        helper.setCalculate(helper.getRate(), helper.getAmount());
//        System.out.print("wynik transakcji " + helper.getCalculate() + currency.getCurrency2());
        //helper.getRate musi zosatać
        //helper.saveData();
    }

    public String transactionContent () {
        String content =
                "Id: " + "cos tam" +
                        "|\tCurrency1: " + currency.getCurrency1() +
                        "|\tCurrency2: " + currency.getCurrency2() +
                        "|\tAmount: " + helper.getAmount() +
                        "|\tRate: " + helper.getRate() +
                        "|\tValue: " + helper.getCalculate() +
                        "|\tTradeDate: " + tradeDate.getTradeDate();
        return content;
    }
}
