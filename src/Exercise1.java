package src;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int[] arrayInteri = new int[5];
            Random rand = new Random();
            for (int i = 0; i < arrayInteri.length; i++) {
                arrayInteri[i] = rand.nextInt(10) + 1;
                System.out.println(arrayInteri[i]);
            }

            int userInput;
            do {
                System.out.print("Inserisci un numero (1-5) o 0 per uscire: ");
                userInput = input.nextInt();

                if (userInput >= 1 && userInput <= 5) {
                    System.out.println("Hai selezionato l'elemento " + userInput + ": " + arrayInteri[userInput - 1]);
                } else if (userInput != 0) {
                    System.err.println("Input non valido. Inserisci un numero tra 1 e 5 o 0 per uscire.");
                }
            } while (userInput != 0);
        } catch (NumberFormatException ex) {
            System.out.println("Hai inserito un valore non numerico");
        } catch (Exception ex) {
            System.out.println("Errore generico");
        } finally {
            input.close();
        }
    }
}






