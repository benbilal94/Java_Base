package be.bstorm.exercicesBoucles;

import java.util.Scanner;

public class DisributeurDeBoissons {
    public static void main(String[] args) {

//        Exercice 12:
//        Ecrire un programme qui simule un distributeur de boisson.
//        L'utilisateur rentre un nombre qui represente son choix et si il reste des boisson lui en donner une
//        Le programme tourne tant que l'utilisateur le decide

        Scanner scan = new Scanner(System.in);

        boolean enCours = true;
        int stockCoca = 10;
        int stockJus = 5;
        int stockCafe = 0;

        while (enCours) {

            System.out.println("1 : Coca\n2 : Jus\n3 : Café\n4 : Quitter");
            int choix = scan.nextInt();

            switch (choix) {

                case 1:
                    if (stockCoca <= 0) {
                        System.out.println("Plus de coca");
                    } else {
                        stockCoca--;
                        System.out.println("Voici votre coca");
                    }
                    break;
                case 2:
                    if (stockJus <= 0) {
                        System.out.println("Plus de jus");
                    } else {
                        stockJus--;
                        System.out.println("Voici votre jus");
                    }
                    break;
                case 3:
                    if (stockCafe <= 0) {
                        System.out.println("Plus de café");
                    } else {
                        stockCafe--;
                        System.out.println("Voici votre café");
                    }
                    break;
                case 4:
                    enCours = false;
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("WTF?");
            }
        }
    }
}
