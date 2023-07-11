package be.bstorm.exercicesBoucles;

import java.util.Scanner;

public class ExoNmb1_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nm;

        do {
            System.out.println("Entrez un nombre entre 1 et 10 :");
            nm = s.nextInt();
        }while (nm > 10 || nm < 1 );
        System.out.println(nm);
    }
}
