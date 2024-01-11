// Exercici 5
package exercici5;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println(menu());
    }

    // Aquesta funció mostra un menú i retorna l'elecció de l'usuari
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
