package exercices;

//        Exercice 5:
//        L'utilisateur entre une valeur en seconde, convertir cette valeur en jour , heure, minute seconde

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int year,month,day,hour,minute,seconde;

        System.out.println("Entrez une valeur en secondes : ");
        seconde = s.nextInt();

        if (seconde < 0) {
            System.out.println("WTF!");
        }else {
//            year = (int)(seconde / 31_536_000);
//            month = (int) ((seconde % 31_536_000) / 2_628_288);
//            day = (int) ((seconde %  2_628_288) / 86400);
//            hour = (int) ((seconde % 86400) / 3600);
//            minute = (int) ((seconde % 3600) /60);
//            seconde = (int) seconde % 60;

            year = (seconde / 31_536_000);
            seconde = seconde % 31_536_000;
            month = (int) (seconde / 2_628_288);
            seconde = seconde % 2_628_288;
            day = (int) (seconde / 86400);
            seconde = seconde % 86400;
            hour = (int) (seconde / 3600);
            seconde = seconde % 3600;
            minute = (int) (seconde / 60 );
            seconde = seconde % 60;

            System.out.printf("%d an(s) %d mois %d jour(s) %d heure(s) %d minute(s) %d seconde(s).\n",year,month,day,hour,minute,seconde);

            System.out.println(Long.MAX_VALUE);
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Long.MAX_VALUE / 31_536_000);
        }


    }
}
