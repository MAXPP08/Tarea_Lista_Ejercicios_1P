/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que muestre los números desde 1 hasta N 
 *              utilizando las instrucciones for, while y do .. while
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el numero N: ");
	        int N = scanner.nextInt();
	        scanner.close();
	        
	        // Usando la instrucción for
	        System.out.println("Usando la instrucción for:");
	        for (int i = 1; i <= N; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        // Usando la instrucción while
	        System.out.println("Usando la instrucción while:");
	        int i = 1;
	        while (i <= N) {
	            System.out.print(i + " ");
	            i++;
	        }
	        System.out.println();
	        
	        // Usando la instrucción do-while
	        System.out.println("Usando la instrucción do-while:");
	        i = 1;
	        do {
	            System.out.print(i + " ");
	            i++;
	        } while (i <= N);
	        System.out.println();
	    }
}
