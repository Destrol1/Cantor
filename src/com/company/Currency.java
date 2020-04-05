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



    //   enum Currencies {
//       EUR, USD, GBP, CHF, PLN;
//
//       float calculate(float rate, float amount) {
//
//
//           String currency ;
//           Scanner scan = new Scanner(System.in);
//           System.out.println("provide currency");
//           String currency = scan.nextLine();
//           klient.dane = currency;
//
//           switch (currency) {
//               case "EUR":
//                   return 4 * amount;
//               case "USD":
//                   return 3 * amount;
//               case "GBP":
//                   return 5 * amount;
//               default:
//                   throw new AssertionError("Unknown currency " + this);
//           }
//
//
//
//
//
//
//           switch (this) {
//               case EUR:
//                   return rate * amount;
//               case USD:
//                   return rate * amount;
//               case GBP:
//                   return rate * amount;
//               case CHF:
//                   return rate * amount;
//               case PLN:
//                   return rate * amount;
//               default:
//                   throw new AssertionError("Unknown currency " + this);
//           }
//       }
//   }
}

