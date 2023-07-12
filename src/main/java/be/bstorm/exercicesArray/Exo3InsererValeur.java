package be.bstorm.exercicesArray;

import java.sql.Array;
import java.util.Scanner;

public class Exo3InsererValeur {
    public static void main(String[] args) {

//        Exercice 15:
//        Avec un tableau d'entier trier, venir inserer une nouvelle valeur au bon emplacement.

        Scanner sc = new Scanner(System.in);


        int[] arr1 = new int[5];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 4;
        arr1[3] = 5;

        System.out.println(arr1[4]);


        System.out.println("Veuillez inserer le nombre");
        int nm = sc.nextInt();
        boolean isDone = false;
        for (int i = 0; i < arr1.length && isDone == false; i++) {  // isDone est la pour vouloir sortir de la boucle quand on veut.
            if (nm < arr1[i]) {
                for (int j = arr1.length - 1; j > i; j--) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                }
                    arr1[i] = nm;
                    isDone = true;
            }
        }
        for (int i : arr1) {
            System.out.println(i);
        }

    }
}
