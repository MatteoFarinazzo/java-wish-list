package org.lesson.java.wishList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> presents = new HashSet<>();

        System.out.println("Inserisci i regali che vuoi ricevere");
        String gif = scanner.nextLine();
        presents.add(gif);


        boolean stop = false;
        while(!stop) {
            System.out.println("Vuoi inserire un altro regalo? y/n");
            String response = scanner.nextLine();
            switch (response) {
                case "y":
                    System.out.println("Inserisci l' altro regalo");
                    String newGif = scanner.nextLine();
                    boolean added = presents.add(newGif);
                    if (!added) {
                        System.out.println("il regalo è già presente");
                    }
                    break;
                case "n":
                    stop = true;
                    break;
                default:
                    System.out.println("invalid answer");
                    break;
            }
        }

        for(String element : presents){
            System.out.println(element.toString());
        }

        scanner.close();

    }
}
