import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        volume();
        */
        /*
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();

        System.out.println("J'ai récupéré un entier: " + unEntier);
        System.out.println("J'ai aussi récupéré un réel: " + unReel);
        */

         /*
         Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour, " + prenom);
        */
    }

    public static void somme(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de "+ premierEntier +" avec "+ deuxiemeEntier +" est égal à "+ somme);
    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();
        float somme = (float)premierEntier / (float)deuxiemeEntier;
        System.out.println("La division de "+ premierEntier +" par "+ deuxiemeEntier +" est égal à "+ somme);
    }

    public static void volume(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        float somme = longueur * largeur * hauteur;

        System.out.println("Le volume du pavé est de "+ somme);

    }
}
