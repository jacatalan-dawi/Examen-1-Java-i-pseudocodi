// Exercici 4
package exercici4;

public class PrimersNombresParells {
    public static void main(String[] args) {
        int n = 10; // Pots canviar aquest valor
        primersNombresParells(n);
    }

    // Aquesta funció imprimeix els primers nombres parells fins a n
    public static void primersNombresParells(int n) {
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
