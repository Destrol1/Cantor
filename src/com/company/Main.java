package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Display display = new Display();
    public static Helper helper = new Helper();

    public static void main(String[] args) throws FileNotFoundException {
        display.displayTransaction();
        helper.saveData();
       // helper.readData();
        helper.table();
        helper.table1();

    }
}

