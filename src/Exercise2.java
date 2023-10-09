package src;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci i chilometri percorsi");
            int km = Integer.parseInt(input.nextLine());

            System.out.println("Inserisci i litri utilizzati");
            int liters = Integer.parseInt(input.nextLine());

            System.out.println("Hai un consumo di " + calcConsumption(km, liters) + " km al litro");

        } catch (ArithmeticException ex) {
            System.err.println("Non puoi inserire 0 come valore dei litri");

        } catch (NumberFormatException ex) {
            System.err.println("Hai inserito un valore non numerico");

        } catch (Exception ex) {
            System.err.println("Errore generico");

        } finally {
            input.close();
        }

    }

    public static double calcConsumption(double km, double liters) {
        return km / liters;
    }
}
