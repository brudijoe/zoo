package zoo;

import vertebrate.mammal.monkey.Gorilla;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Gorilla boby = new Gorilla(125.0, 160.8, "black", "Boby");
        Gorilla nika = new Gorilla(100.5, 150.5, "black", "Nika");
        ArrayList<Gorilla> gorillas = new ArrayList<>();
        gorillas.add(boby);
        gorillas.add(nika);

        System.out.println("Which animals do you want to visit?");
        Scanner scanner = new Scanner(System.in);
        String myMessage = scanner.nextLine();

        switch(myMessage) {
            case "Gorillas":
                for (Gorilla i : gorillas) {
                    System.out.println("The name of the Gorilla is " + i.name + " and weights " + i.weight + " KG und is " + i.height  + "CM tall and has a " + i.color + " color.");
                }
                break;
            case "Chimpanzees":
                System.out.println("Sorry, the zoo has no chimpanzees yet");
                break;
            default:
                System.out.println("Animal: " + myMessage +" does not exist.");
        }


    }
}
