package com.company;

public class Display {
    public static Currency currency = new Currency();
    public static TradeDate tradeDate = new TradeDate();
    public static Helper helper = new Helper();
    public static TradeModel tradeModel = new TradeModel();


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

        //calculate transaction
        System.out.print("wynik transakcji " + helper.calculate(helper.getRate(), helper.getAmount())+ currency.getCurrency2());
        //helper.getRate musi zosatać
        //helper.saveData();
    }

    public String transactionContent () {
        String content =
                "Id: " + "cos tam" +
                        "|\tCurrency1: " + currency.getCurrency1() +
                        "|\tCurrency2: " + currency.getCurrency2() +
                        "|\tAmount: " + helper.getAmount() +
                        "|\tRate: " + "1.2" +
                        "|\tValue: " + tradeModel.value +
                        "|\tTradeDate: " + tradeDate.getTradeDate();
        return content;
//        String calosc1 = currency.getCurrency1() + String.valueOf(tradeModel.amount1) + tradeModel.value ;
//        tradeModel.calosc = calosc1;
    }

}
