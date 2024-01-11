// Exercici 2
package exercici2;

public class BinariDecimal {
    public static void main(String[] args) {
        long n = 1010; // Pots canviar aquest valor
        binariDecimal(n);
    }

    // Aquesta funció converteix un nombre binari a decimal
    public static void binariDecimal(long n) {
        int decimal = 0;
        int base = 1;
        while(n > 0) {
            long ultim_digit = n % 10;
            n = n / 10;
            decimal += ultim_digit * base;
            base = base * 2;
        }
        System.out.println(decimal);
    }
}
