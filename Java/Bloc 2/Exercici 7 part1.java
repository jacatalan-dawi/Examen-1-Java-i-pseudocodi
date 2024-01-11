// Exercici 7 Part1
// Funció volumCilindre
package exercici7;

public class VolumCilindre {
    public static void main(String[] args) {
        int radi = 5; // Pots canviar aquest valor
        int longitud = 10; // Pots canviar aquest valor
        System.out.println(volumCilindre(radi, longitud));
    }

    // Aquesta funció calcula el volum d'un cilindre
    public static double volumCilindre(int radi, int longitud) {
        return 3.14 * radi * radi * longitud;
    }
}
