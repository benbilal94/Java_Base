package be.bstorm.demo;

import java.time.LocalDate;

public class DemoCondition {
    public static void main(String[] args) {
        boolean myBoolean = true;

        int nb = 10;

        System.out.println(10 > 5);
        System.out.println(10 >= 5);
        System.out.println(10 < 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);

        int day = LocalDate.now().getDayOfWeek().getValue();

//        if (nb > 10) {
//            System.out.println("Plus grand que 10");
//        } else if (nb < 10) {
//            System.out.println("Plus petit que 10");
//        } else {
//            System.out.println("Egal a 10");
//        }
//          System.out.println("finito");

        // Façon ternaire
//        String result = nb > 10 ? "Plus grand que 10" : "plus petit ou égale a 10 ";
//        String result2 = nb > 10 ? "plus grand que 10" : nb < 10 ? "Plus petit que 10" : "Egale a 10" ;
//        System.out.println(result2);

        nb = 5;

        if (nb >= 1 && nb <= 10) {
            System.out.println("Entre 1 et 10");
        }

        if (nb < 1 || nb > 10) {
            System.out.println("Pas entre 10");
        }

        if (!(nb < 1 || nb > 10)) {
            System.out.println("Entre 1 et 10");
        }
        switch (day) {
            case 1 -> System.out.println("Lundi des patates");
            case 2 -> System.out.println("Mardi des patates");
            case 3 -> System.out.println("Mercredi des patates");
            case 4 -> System.out.println("jeudi des patates");
            case 5 -> System.out.println("vendredii des patates");
            case 6 -> System.out.println("samedi des patates");
            default -> System.out.println("Et le dimanche , encore le jour des patates");
        }
    }
}
