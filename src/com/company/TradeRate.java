package com.company;

public class TradeRate {

    public TradeModel pojemnik = new TradeModel();

    public void setKurs(){ //ustala kurs
        // obliczamy kurs i przypisujemy do zmiennej globalnej
        float rate2 = (float) 5;;
        pojemnik.rate = rate2;
    }

    public float getKurs () { //wyswietlKurs
        return pojemnik.rate;
    } //wyswietla kurs

}
