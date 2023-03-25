/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que muestre los múltiplos de un número desde 1 hasta M
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
	        
	Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese un límite superior: ");
        int m = scanner.nextInt();        
        System.out.println("Los múltiplos de " + n + " desde 1 hasta " + m + " son:");
	        
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}
