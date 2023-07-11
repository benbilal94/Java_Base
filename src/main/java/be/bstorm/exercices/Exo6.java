package be.bstorm.exercices;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
//        Exercice 6:
//        Decomposer un montant en un minimum de coupures.
//        ex : 726€ => 1 billet de 500 , 1 billet de 200 , un billet de 20, un billet de 5 et une piece de 1

        Scanner s = new Scanner(System.in);
        int b500,b200,b100,b50,b20,b10,b5,montant;

        System.out.println("Entrez votre montant: ");
        montant = s.nextInt();

        b500 = (int) ((montant / 500));
        b200 = (int) ((montant % 500) / 200);
        b100 = (int) (montant / 100);
        b50 = (int) (montant / 50);
        b20 = (int) (montant / 20);
        b10 = (int) (montant / 10);
        b5 = (int) (montant / 5);

//        System.out.printf();

//        A faire a la Maison !!!
//            !!!!!!!!!!!!!!


    }
}
