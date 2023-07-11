package be.bstorm.demo;

public class DemTableaux {
    public static void main(String[] args) {
        String [] strings = new String[3];
        strings[0] = "Piere";
        strings[1] = "Paul";
        strings[2] = "Jaques";

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Bonjour " + strings[i]);
        }
    }
}
