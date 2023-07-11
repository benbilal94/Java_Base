package exercicesBoucles;

public class fibonacci {
//    Exercice 9:
//    Ecrire un programme qui affiche les x premiers nombres de la suite de fibonacci.
//    (0,1,1,2,3,5,8,13,...) le prochaine nombre vaut la sommes de deux précedent.
    public static void main(String[] args) {
        int nb1 = 0;
        int nb2 = 1;
        int nb3;
        int count = 15;

        System.out.println(nb1);

        for (int i = 2;  i < count;i++){
           nb3 = nb1 + nb2;
           nb1 = nb2;
           nb2 = nb3;

            System.out.println(" " + nb3);
        }
    }
}
