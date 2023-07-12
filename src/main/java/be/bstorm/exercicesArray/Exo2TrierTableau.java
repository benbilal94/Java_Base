package be.bstorm.exercicesArray;

import java.util.Arrays;

public class Exo2TrierTableau {
    public static void main(String[] args) {

//        Exercice 14:
//        Trier un tableau d entier de maniere croissante.
        int[] newArr = {90, 18, 111, 7, 36, 98, 23};
//
        // Pour trier de maniere croissante
//        Arrays.sort(newArr);


        for (int i = 0; i < newArr.length; i++) {
            for (int j = i + 1; j < newArr.length; j++) {

                int temp = 0;
                if (newArr[i] > newArr[j]) {
                    temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
            System.out.print(newArr[i] + " ");
        }


//              Other way to resolve
//        System.out.println(Arrays.toString(newArr));
//        for (int item: newArr) {
//            System.out.print(item + " ");
//        }

    }
}