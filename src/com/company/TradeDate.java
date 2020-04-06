package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TradeDate {

    public TradeModel tradeModel = new TradeModel();

    public void getTradeDate () {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        tradeModel.tradeDate = dateFormat.format(date);
        System.out.println(dateFormat.format(date));
    }

}
//todo zrobić wybieranie daty