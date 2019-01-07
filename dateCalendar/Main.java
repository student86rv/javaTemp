package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args) {

//        Date dateNow = new Date();
//        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
//        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));


//        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
//        Date date = calendar.getTime();
//        System.out.println(date);
        

//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.YEAR, 2017);
//        calendar.set(Calendar.MONTH, 0);
//        calendar.set(Calendar.DAY_OF_MONTH, 25);
//        calendar.set(Calendar.HOUR_OF_DAY, 19);
//        calendar.set(Calendar.MINUTE, 42);
//        calendar.set(Calendar.SECOND, 12);
//
//        System.out.println(calendar.getTime());


//        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
//        calendar.set(Calendar.HOUR, 19);
//        calendar.set(Calendar.MINUTE, 42);
//        calendar.set(Calendar.SECOND, 12);
//
//        calendar.add(Calendar.MONTH, -2);//чтобы отнять значение - в метод нужно передать отрицательное число
//        System.out.println(calendar.getTime());

        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());
    }
}
