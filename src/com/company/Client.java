package com.company;

import java.util.Scanner;

public class Client {
    public TradeModel klient = new TradeModel();

    public void setKlient () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko klienta.");
        String podaj = scan.nextLine();
        klient.dane = podaj;
    }

    public String getKlient(){
        return klient.dane;
    }
}
//todo dodokonczenia