package com.company;

import java.io.FileNotFoundException;

public class Main {
    public static Display display = new Display();
    public static Helper helper = new Helper();

    public static void main(String[] args) throws FileNotFoundException {
        display.displayTransaction();
        helper.saveData();
        helper.readData();
    }
}

