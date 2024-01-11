// Exercici 1
package exercici1;

public class DecimalBinari {
    public static void main(String[] args) {
        int n = 10; // Pots canviar aquest valor
        decimalBinari(n);
    }

    // Aquesta funció converteix un nombre decimal a binari
    public static void decimalBinari(int n) {
        if(n > 0) {
            decimalBinari(n / 2);
            System.out.print(n % 2);
        }
    }
}
