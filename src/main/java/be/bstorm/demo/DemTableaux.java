package be.bstorm.demo;

public class DemTableaux {
    public static void main(String[] args) {
        String [] name = new String[3];
        name[0] = "Piere";
        name[1] = "Paul";
        name[2] = "Jaques";

        for (int i = 0; i < name.length; i++) {
            System.out.println("Bonjour " + name[i]);
        }

        String[][] strings2D = new String [5][3];

        int[][] ints2D = new int[3][3];

//        ints2D[0][0] = 1;
//        ints2D[0][1] = 2;
//        ...

        int cpt = 1;
        for (int i = 0; i < ints2D.length; i++ ){

            for (int j = 0; j < ints2D[i].length; j++) {

               ints2D[i][j] = cpt++;
            }

        }

        for (int i = 0; i < ints2D.length; i++ ){

            for (int j = 0; j < ints2D[i].length; j++) {

                System.out.print(ints2D[i][j] + " | ");
            }
            System.out.println();

        }

    }
}
