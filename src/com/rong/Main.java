package com.rong;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        showDate time = new showDate(date);
        time.printDate();
        time.afterNumsDays(10);
    }
}
