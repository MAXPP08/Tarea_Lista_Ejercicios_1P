/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa para calcular si un año es bisiesto.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese un año: ");
	        int anio = scanner.nextInt();
	        
	        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
	            System.out.println(anio + " es un año bisiesto.");
	        } else {
	            System.out.println(anio + " no es un año bisiesto.");
	        }
	        
	        scanner.close();
	    }
}
