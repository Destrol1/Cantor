package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;


public class Helper {
    public static TradeModel tradeModel = new TradeModel();
    public static TradeDate tradeDate = new TradeDate();
    public static Currency currency = new Currency();
    public static Display display = new Display();

    public void setRate (){
//        Scanner scan = new Scanner(System.in);
//        String rate = scan.nextLine();
//        tradeModel.rate = Float.parseFloat(rate);

        switch (getCurrencyPair()) {
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

    public float getRate (){
        return tradeModel.rate;
    }

    public void setCurrencyPair (String ccy1, String ccy2) {
        tradeModel.currencyPair = ccy1 + ccy2;
    }

    public String getCurrencyPair (){
        return tradeModel.currencyPair;
    }

    public void setAmount () {
        Scanner scan = new Scanner(System.in);
        float reader = Float.parseFloat(scan.nextLine());
        tradeModel.amount1 = reader;
    }

    public float getAmount () {
        return tradeModel.amount1;
    }

    public void setCalculate (float rate, float amount){
        tradeModel.value = rate * amount;
    }

    public float getCalculate (){
        return tradeModel.value;
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
//               Scanner scannerFile = new Scanner(f); // zczytywanie z pliku
               Scanner sc = new Scanner(System.in); //co uruchomienie programu uz dodaje dane a nastepnie wyswietla aktualna zawartosc
              // System.out.println("Podaj tekst do pliku ");
               //String tekst =sc.nextLine(); //todo funkcja
            addFile.format("%s \r\n", display.transactionContent()); // tu fnkcje
            //   addFile.format("%s \r\n", saveToVector()); // tu fnkcje
               System.out.println("Zapisano ");
               addFile.close();
               fileSave.close();
//               //odczytywanie
//               System.out.println("Zawartosc pliku: ");
//               while(scannerFile.hasNextLine()){//sprawdzam czy plik pusty
//                   System.out.println(scannerFile.nextLine());
//               }
//               scannerFile.close();
           }
           catch (Exception error){
               System.out.println(error.getMessage());
           }
        }
    }

    public void readData (){
        try {
            File myObj = new File("transaction.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void table1 () throws FileNotFoundException {
        Scanner s = new Scanner(new File("transaction.txt"));
        ArrayList<String> listS = new ArrayList<String>(); //listS zamieni na funkcje
        while(s.hasNextLine())
            listS.add(s.nextLine());

      System.out.println(listS);
      Collections.sort(listS);
      System.out.println(listS);

    }
        public String table ()  {
            List<String> lista = new ArrayList<>();
            lista.add(currency.getCurrency1());
            lista.add(currency.getCurrency2());
            lista.add(String.valueOf(getAmount()));
            lista.add(String.valueOf(getRate()));
            lista.add(String.valueOf(getCalculate()));
            lista.add(tradeDate.getTradeDate());
//            return lista.sort();
            return String.valueOf(lista);
        }
        //--------------------------------------------------------------------------

    public List<Float> saveToVector () {
        List<Float> amountList = new ArrayList<>();
       List<Float> valueList = new ArrayList<>();

        amountList.add(getAmount());
       valueList.add(getCalculate());
        return amountList;
    }

//    public void readVector () throws FileNotFoundException {
//
//        Scanner s = new Scanner(new File("transaction.txt"));
//        ArrayList<String> listS = new ArrayList<String>(); //listS zamieni na funkcje
////        ArrayList<Integer> listI = new ArrayList<Integer>();
//        while (s.hasNextLine())
//            listS.add(s.nextLine());
//
//        System.out.println(listS);
//        Collections.sort(listS);
//
//        System.out.println(listS);
//    }
}



















