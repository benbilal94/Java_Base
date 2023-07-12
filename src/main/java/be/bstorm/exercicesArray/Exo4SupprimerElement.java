package be.bstorm.exercicesArray;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exo4SupprimerElement {
    public static void main(String[] args) {

//        Exercice 16:
//        Permetre du supprimer un element du tableau trier et replacer les element de sorte a ne pas avoir de trou.

        Scanner sc = new Scanner(System.in);

        int nbElement = 5;
        int[] numbers = new int[]{2, 4, 6, 8, 10};

        for (int number : numbers) {
            System.out.println(number + " | ");
        }

        System.out.println("Quel element voulez vous supprimer? (index)");

        int choice = sc.nextInt();

//        En cherchantt avec l'indice'
//
        for (int i = choice; i < nbElement; i++) {
            numbers[i] = numbers[i + 1];
        }
        nbElement--;


        for (int i = 0; i < nbElement; i++) {
            System.out.println(numbers[i] + " | ");
        }
    }
}
