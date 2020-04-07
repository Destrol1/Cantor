package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Helper {

    public static TradeModel tradeModel = new TradeModel();

//    public void zapisDopliku () throws FileNotFoundException {
//        PrintWriter zapis = new PrintWriter("tranzakcje.txt");
//        zapis.println("Rate: " + kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: ");
//        zapis.close();
//        System.out.print("Rate: " +  kurs.getKurs() + "\n" + "Amount: " + ilosc.getAmount() + "\n" + "Wartosc: " );
//    }
//todo zapis do pliku

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

    public void setCurrencyPair (String c1, String c2){
        String pair;

        pair = c1 + c2;

//        System.out.print(pair);
//        if(pair == "EURUSD") {
//
//            System.out.print("dziala");
//        }
//         else if(pair == "EURGPB"){
//            System.out.print("nie dziala");
//        }

        switch (pair) {
            case "EURUSD":
                tradeModel.rate = (float) 1.08;
                break;
            case "EURGBP":
                tradeModel.rate = (float) 0.88;
                break;
            case "EURPLN":
                tradeModel.rate = (float) 4.55;
                break;
            case "USDEUR":
                tradeModel.rate = (float) 0.93;
                break;
            case "USDGBP":
                tradeModel.rate = (float) 0.81;
                break;
            case "USDPLN":
                tradeModel.rate = (float) 4.21;
                break;
            case "PLNEUR":
                tradeModel.rate = (float) 0.22;
                break;
            case "PLNUSD":
                tradeModel.rate = (float) 0.24;
                break;
            case "GBPEUR":
                tradeModel.rate = (float) 1.13;
                break;
            case "GBPUSD":
                tradeModel.rate = (float) 1.23;
                break;
            case "GBPPLN":
                tradeModel.rate = (float) 5.13;
                break;
            default:
                System.out.print("Wrong currencies, enter again \n");
        }

    }
    //todo pobieranie kursów ze strony internetowej

    //zapis do pliku ------
    public void saveData() {
        File f = new File("transaction.txt");//owiera plik
        if(!f.exists()){//sprawdza czy nie istnieje jesli tak to tworzy
            try {
                f.createNewFile(); //tworzy plik
                System.out.println("Plik zostal utworzony");
            }
            catch (Exception error){
                System.out.println(error.getMessage());//wyjątek gdy próbujemy utworzyć plik w miejscu w którym nie mozemy
            }
        }
        if(f.canWrite()){ //sprawdzamy czy f jest w stanie zapisywac
           try {
               FileWriter fileSave = new FileWriter(f, true);       //zapisywanie do pliku //dolącza na koncu pliku nowe dane
               Formatter addFile = new Formatter(fileSave);    //formater pozwala formatowac wejsciowe dane
               Scanner scannerFile = new Scanner(f); // zczytywanie z pliku
               Scanner sc = new Scanner(System.in); //co uruchomienie programu uz dodaje dane a nastepnie wyswietla aktualna zawartosc
               System.out.println("Podaj tekst do pliku ");
               String tekst = sc.nextLine();
               addFile.format("%s \r\n", tekst);
               System.out.println("Zapisano ");
               addFile.close();
               fileSave.close();
               //odczytywanie
               System.out.println("Zawartosc pliku: ");
               while(scannerFile.hasNextLine()){//sprawdzam czy plik pusty
                   System.out.println(scannerFile.nextLine());
               }
               scannerFile.close();
           }
           catch (Exception error){
               System.out.println(error.getMessage());
           }
        }



    }
}
