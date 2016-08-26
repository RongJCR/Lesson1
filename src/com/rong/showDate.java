package com.rong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Rong on 2016/8/26.
 */
public class showDate {
    public showDate(Date date){
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void printDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Today is: " + dateFormat.format(date));
    }
    private int haveDays(int month, int day, boolean run){
        int res;
        switch (month){
            case 1:
                res = day;
                break;
            case 2:
                res = day + 31;
                break;
            case 3:
                res = day + 31 + 28;
                if (run)
                    ++res;
                break;
            case 4:
                res = day + 31 + 28 + 31;
                break;
            case 5:
                res = day + 31 + 28 + 31 + 30;
                break;
            case 6:
                res = day + 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                res = day + 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                res = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                res = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                res = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                res = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                res = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                res = 0;
                break;

        }
        return res;

    }
    public void afterNumsDays(int days){

        Calendar calendar = new GregorianCalendar();
        int dayw = calendar.get(Calendar.DAY_OF_WEEK);
        dayw = (dayw - 1 + days)%7;
        if (dayw == 0)
            dayw = 7;
        System.out.printf("After %d days is 星期%d",days,dayw);

//        Calendar calendar = new GregorianCalendar();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int daym = calendar.get(Calendar.DAY_OF_MONTH);
//        int dayw = calendar.get(Calendar.DAY_OF_WEEK);
//        int last, yeardays, febdays;
//        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
//            yeardays = 366;
//            int have = haveDays(month + 1,daym,true); // Date中的一月是用0表示的
//            if (have == 0){
//                System.out.printf("Error: No %d exist!\n",month + 1);
//                return;
//            }
//            last = yeardays - have;
//
//        }
//        else {
//            yeardays = 365;
//            int have = haveDays(month + 1, daym, false);
//            if (have == 0){
//                System.out.printf("Error: No %d exist!\n",month + 1);
//                return;
//            }
//            last = yeardays - have;
//        }
//        if (days < last){
//
//        }


    }

    private Date date;

}
