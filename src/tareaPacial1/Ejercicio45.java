/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que lea dos números y muestre los números desde 
 *              el menor hasta el mayor
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio45 {
    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el primer número: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Ingrese el segundo número: ");
	        int num2 = scanner.nextInt();
	        scanner.close();
	        
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);
	        
	        for (int i = menor; i <= mayor; i++) {
	            System.out.print(i + " ");
	        }
	    }
}
