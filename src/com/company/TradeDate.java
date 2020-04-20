package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TradeDate {
    public TradeModel tradeModel = new TradeModel();
    public Date date = new Date();

    public String getTradeDate () {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        tradeModel.tradeDate = dateFormat.format(date);
        return tradeModel.tradeDate;
    }
}
//todo zrobić wybieranie daty