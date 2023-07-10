package exercices;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
//        Exercice 3:
//        L'utilisateur rentre deux nombres.
//        L'app les compare et affiche lequel est plus grand. (tenir compte de l'égalité)
//        ex : input (5,3) => "5 > 3"

        Scanner s = new Scanner(System.in);

        System.out.println("Entrez votre premier nombre");
        int nombre1 = s.nextInt();
        System.out.println("Entrez votre 2ème nombre");
        int nombre2 = s.nextInt();
        if (nombre1 > nombre2) {
            System.out.println(nombre1 + " > " + nombre2);
        } else if (nombre2 > nombre1) {
            System.out.println(nombre2 + " > " + nombre1);
        }else {
            System.out.println(nombre1 + " et " + nombre2 + " sont egaux");
        }
    }
}
