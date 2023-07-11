package exercices;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
//        Exercice 4:
//        Pareil qu'au dessus mais cette fois ci avec 3 nombres.
//        bonus : un seul System.out.printLn() apres encodage des nombres.
//        ex : input (3,5,2) => 2 < 3 < 5

        Scanner s = new Scanner(System.in);
        System.out.println("entre le nombre 1");
        int a = s.nextInt();
        System.out.println("entrez le nombre 2");
        int b = s.nextInt();
        System.out.println("entrez le nombre 3");
        int c = s.nextInt();
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if(a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if(b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Les nombres triés en ordre croissant sont : " + a + ", " + b + ", " + c);

    }
}
