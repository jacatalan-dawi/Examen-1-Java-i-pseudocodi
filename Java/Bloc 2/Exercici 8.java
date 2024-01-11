// Exercici 8
package exercici8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Què transportaràs? 1. Líquids 2.Sòlids");
        int eleccio = scanner.nextInt();
        while(eleccio != 1 && eleccio != 2) {
            System.out.println("Opció no vàlida");
            System.out.println("Què transportaràs? 1. Líquids 2.Sòlids");
            eleccio = scanner.nextInt();
        }
        System.out.println("Quin és el volum que s'ha d'enviar, en metres cúbics?");
        double volum = scanner.nextDouble();
        double capacitat;
        if(eleccio == 1) {
            System.out.println("Quants centímetres de radi té la cisterna?");
            int radi = scanner.nextInt();
            System.out.println("Quants centímetres de longitud té la cisterna?");
            int longitud = scanner.nextInt();
            capacitat = exercici7.VolumCilindre.volumCilindre(radi, longitud);
        } else {
            System.out.println("Quina és la longitud dels tres costats del prisma en centímetres?");
            int llargada = scanner.nextInt();
            int amplada = scanner.nextInt();
            int alçada = scanner.nextInt();
            capacitat = exercici7.VolumPrismaRectangular.volumPrismaRectangular(llargada, amplada, alçada);
        }
        System.out.println("El camió té una capacitat de " + capacitat + " centímetres cúbics.");
        double volum_en_m3 = capacitat / 1000000;
        System.out.println("Es poden ajustar " + volum_en_m3 + " metres cúbics.");
        double viatges = volum / volum_en_m3;
        System.out.println("Necessitaràs fer " + viatges + " viatges.");
    }
}
