package src.Exercise3;

import src.exceptions.BancaException;

public class ContoOnline {
    public static class ContoOnLine extends ContoCorrente {
        double maxPrelievo;

        ContoOnLine(String titolare, double saldo, double maxP) {
            super(titolare, saldo);
            this.maxPrelievo = maxP;
        }

        void stampaSaldo() {

            System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                    + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
        }

        void preleva(double x) throws BancaException {
            if (x <= maxPrelievo) {
                super.preleva(x);

            } else if (x > maxPrelievo) {
                throw new BancaException("il prelievo non è disponibile");
            } else if (x > saldo) {
                throw new BancaException("il prelievo non è disponibile");
            }
        }
    }

}
