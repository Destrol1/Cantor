package com.company;

import java.util.Scanner;

public class Helper {

    public static TradeModel tradeModel = new TradeModel();
//    public static Currency ilosc = new Currency();
//    public static Helper kursilosc = new Helper();
//    public static TradeDate aktualnyczas = new TradeDate();
//    public static Client dane = new Client();
//    public static Helper zapisDopliku = new Helper();
//    float wynik;
//
//    public void setValue (float wartoscKursu, float iloscpieniedzy){ //mnozy kurs * ilosc pieniedzy
//        System.out.print(wartoscKursu * iloscpieniedzy);
//        wartoscKursu = kurs.getKurs();
//        iloscpieniedzy = ilosc.getAmount();
//    }
//
//    public float getVaue (){
//        return wynik;
//    }
//
//    public void zapisDopliku () throws FileNotFoundException {
//        PrintWriter zapis = new PrintWriter("tranzakcje.txt");
//        zapis.println("Rate: " + kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: ");
//        zapis.close();
//        System.out.print("Rate: " +  kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: " );
//    }

//    ----------------------------------------------------------------------

    public void setRate (){
        Scanner scan = new Scanner(System.in);
        String rate = scan.nextLine();
        tradeModel.rate = Float.parseFloat(rate);
    }

    public float getRate (){
        return tradeModel.rate;
    }

//    public TradeModel getValue (float value, float rate){
//        float result = value * rate;
//        tradeModel.value = result;
//        System.out.print(tradeModel.value);
//        return tradeModel;
//    }

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
