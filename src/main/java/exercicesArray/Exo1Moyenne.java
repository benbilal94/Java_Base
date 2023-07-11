package exercicesArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo1Moyenne {
    public static void main(String[] args) {
//        Exercice 13:
//        Ecrire un programme qui demande a l'utilisateur de rentrer les scores de x personnes (max 10)
//        Calculer la moyenne de ces scores.

        Scanner s = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();


        for (int i = 0; i < 10 ; i++) {
            System.out.println("Entrez le scores");
            scores.add(s.nextInt());
        }
        float sum = 0;
        for (Integer score: scores){
            sum = sum + score;
        }
        System.out.println(sum);
        System.out.println( sum / scores.size());
    }
}
