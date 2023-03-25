/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea dos números por teclado y muestre el resultado
 *              de la división del primero por el segundo. Se debe comprobar 
 *              que el divisor no puede ser cero.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio31 {
     public static void main(String[] args) {
	        
	Scanner scanner = new Scanner(System.in);
	        
	System.out.print("Ingrese el dividendo: ");
	double dividendo = scanner.nextDouble();
	        
	double divisor;
	        
	do {
            System.out.print("Ingrese el divisor: ");
	    divisor = scanner.nextDouble();
	    if (divisor == 0) {
	        System.out.println("Error: el divisor no puede ser cero. Intente nuevamente.");
	    }
	} while (divisor == 0);
	    double resultado = dividendo / divisor;
	    System.out.println("El resultado de la division es: " + resultado);
    }
}
