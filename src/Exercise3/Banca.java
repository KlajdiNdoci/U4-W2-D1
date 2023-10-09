package src.Exercise3;

import src.exceptions.BancaException;

public class Banca {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

        System.out.println("Saldo conto 1: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(100000);

            System.out.println("Saldo conto 1: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnline.ContoOnLine conto2 = new ContoOnline.ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1000);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }
}
