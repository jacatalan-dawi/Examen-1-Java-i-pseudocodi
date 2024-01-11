// Exercici 6
package exercici6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int eleccio = menu();
        while(eleccio != 0) {
            if(eleccio == 1) {
                System.out.println("Introdueix un nombre enter:");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                exercici1.DecimalBinari.decimalBinari(n);
            } else if(eleccio == 2) {
                System.out.println("Introdueix un nombre binari:");
                Scanner scanner = new Scanner(System.in);
                long n = scanner.nextLong();
                exercici2.BinariDecimal.binariDecimal(n);
            } else if(eleccio == 3) {
                System.out.println("Introdueix un nombre:");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                System.out.println(exercici3.EsParell.esParell(n));
            } else if(eleccio == 4) {
                System.out.println("Introdueix un nombre enter n:");
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                exercici4.PrimersNombresParells.primersNombresParells(n);
            } else {
                System.out.println("Opció no vàlida");
            }
            eleccio = menu();
        }
    }

    public static int menu() {
        System.out.println("Escull una de les següents opcions:");
        System.out.println("1. Decimal a binari");
        System.out.println("2. Binari a decimal");
        System.out.println("3. És parell?");
        System.out.println("4. Calcular nombres parells entre 0 i n");
        System.out.println("0. Sortir");
        Scanner scanner = new Scanner(System.in);
        int eleccio = scanner.nextInt();
        return eleccio;
    }
}
