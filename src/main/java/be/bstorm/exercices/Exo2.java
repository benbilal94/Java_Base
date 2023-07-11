package be.bstorm.exercices;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {

//        Demander à l'utilisateur son age.
//        L'acceuillir si il est majeur, lui interdire l'app sinon.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quel est votre age?");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Bienvenue");
        }else {
            System.out.println("Vous n'etes pas le bienvenue");
        }

    }
}
