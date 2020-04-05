package com.company;

import java.util.Scanner;

public class Helper {

    public static TradeModel tradeModel = new TradeModel();

//    public void zapisDopliku () throws FileNotFoundException {
//        PrintWriter zapis = new PrintWriter("tranzakcje.txt");
//        zapis.println("Rate: " + kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: ");
//        zapis.close();
//        System.out.print("Rate: " +  kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: " );
//    }


    public void setRate (){
        Scanner scan = new Scanner(System.in);
        String rate = scan.nextLine();
        tradeModel.rate = Float.parseFloat(rate);
    }

    public float getRate (){
        return tradeModel.rate;
    }

    public void setAmount () {
        Scanner scan = new Scanner(System.in);
        float reader = Float.parseFloat(scan.nextLine());
        tradeModel.amount1 = reader;
    }

    public float getAmount () {
       return tradeModel.amount1;
    }

    public float calculate (float rate, float amount){
        float calculate = rate * amount;
        return tradeModel.value = calculate;
    }
}
