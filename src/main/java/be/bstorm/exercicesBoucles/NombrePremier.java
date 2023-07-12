package be.bstorm.exercicesBoucles;

import java.util.Scanner;

public class NombrePremier {
    public static void main(String[] args) {

//        Exercice 11:
//        Ecrire un programme qui affiche les x premiers nombres premiers.

        Scanner scan = new Scanner(System.in);

        System.out.print("Longueur : ");
        int length = scan.nextInt();
        int found = 1;
        int toTest = 3;

        System.out.println(2);
        while (found < length) {

            boolean isPrime = true;
            for (int div = 2; div <= Math.sqrt(toTest) && isPrime; div++) {

                if (toTest % div == 0) {

                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(toTest);
                found++;
            }
            toTest += 2;
        }
    }
}
