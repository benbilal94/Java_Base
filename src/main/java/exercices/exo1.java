package exercices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {

//        exo :
//        Exercice 1:
//        Demander a l'utilisateur de rentrer son prenom et le saluer en lui affichant la date du jour.
//        ex input => Sebastien ... output => Bonjour Sebastien nous somme les 10 Juillet 2023.

        // Scanner pour le rendre en mode Input
        Scanner scan = new Scanner(System.in);

        System.out.println("Donnez-moi votre prénom");

        //Passer a la suivante avec .next()
        String nom = scan.next();

        //Pour prendre la date d'aujourdhui
        LocalDate today = LocalDate.now();
        String day = today.getDayOfWeek().toString();
//        String monthDay = String.valueOf(today.getDayOfMonth());
//        monthDay = switch (monthDay) {
//          case "1" -> "1st";
//          case "2" -> "2nd";
//          case "3" -> "3rd";
//          default -> monthDay + "th";
//        };
//        int month = today.getMonth().getValue();
//        int year = today.getYear();
        System.out.println("Bonjour " + nom + " nous sommes le " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // format(DateTimeFormatter.ofPattern("dd/MM/yyyy") pout formatter , pour rendre la date au format que tu veux.




        System.out.println("Bonjour " + nom + " nous sommes le " + today + ".");
    }
}
