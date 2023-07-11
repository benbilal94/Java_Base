package be.bstorm.exercicesBoucles;

import java.util.Scanner;

public class DistributeurBalles {
    public static void main(String[] args) {
//        Exercice 8:
//        Ecrire un programme de distributeur de balles. On ne peut lancer une balle qu'a condition qu'il en reste et que le joueur soit prêt.

        Scanner s = new Scanner(System.in);
        boolean pret = true;
        int balles = 3;

        do {
            System.out.println("Est-tu pret?");
            pret = s.nextBoolean();
            if (pret == true && balles > 0) {
                System.out.println("Balle lancer");
                balles--;
            }else {
                System.out.println("D'accord");
            }
        }
        while (balles > 0);

    }
}
