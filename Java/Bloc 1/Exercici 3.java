// Exercici 3
package exercici3;

public class EsParell {
    public static void main(String[] args) {
        int n = 10; // Pots canviar aquest valor
        System.out.println(esParell(n));
    }

    // Aquesta funció verifica si un nombre és parell
    public static boolean esParell(int n) {
        return n % 2 == 0;
    }
}
