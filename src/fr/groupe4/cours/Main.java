package fr.groupe4.cours;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        System.out.println("Hello World!");


        createRace();
    }

    private static void createRace (){
        boolean choix = false;
        Scanner sc =  new Scanner(System.in);
        String nxtln = sc.nextLine();
        while (choix != true){
            if (nxtln.equals("Orc")) {
                System.out.println("Votre choix est Orc");
                choix = true;
            }
            else if(nxtln.equals("Elfe")) {
                System.out.println("Votre choix est Elfe");
                choix = true;
            }
                else{
                    System.out.println("Votre choix n'est pas valide");
                    nxtln = sc.nextLine();
                    choix = false;
            }
        }
    }
}

