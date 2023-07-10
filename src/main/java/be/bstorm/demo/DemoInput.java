package be.bstorm.demo;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args) {

        // Pour passer en mode input
        Scanner scan = new Scanner(System.in);

//        System.out.println("Jour: ");
//        int day = scan.nextInt();
//        System.out.println("Mois: ");
//        String month = scan.next();
//        System.out.println("Année: ");
//        long year = scan.nextLong();

        System.out.println("Jour: ");
        int day = scan.nextInt();
        System.out.println("Mois: ");
        int month = scan.nextInt();
        System.out.println("Année: ");
        int year = scan.nextInt();

        LocalDate date = LocalDate.of(year,month,year);
//        Date d = new Date(year,month,year);

//        System.out.println(d);
        System.out.println(date);
        System.out.println(day + "" + month + " " + year);

//        exo



        System.out.println(day + " " + month + " " + year);
    }
}
