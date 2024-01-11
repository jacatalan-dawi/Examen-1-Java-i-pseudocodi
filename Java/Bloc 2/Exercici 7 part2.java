// Exercici 7 Part2
package exercici7;
// Funció volumPrismaRectangular
public class VolumPrismaRectangular {
    public static void main(String[] args) {
        int llargada = 5; // Pots canviar aquest valor
        int amplada = 10; // Pots canviar aquest valor
        int alçada = 15; // Pots canviar aquest valor
        System.out.println(volumPrismaRectangular(llargada, amplada, alçada));
    }

    // Aquesta funció calcula el volum d'un prisma rectangular
    public static int volumPrismaRectangular(int llargada, int amplada, int alçada) {
        return llargada * amplada * alçada;
    }
}