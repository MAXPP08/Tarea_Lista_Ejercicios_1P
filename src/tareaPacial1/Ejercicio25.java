/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio25 {
    public static void main(String[] args) {
	        
	Scanner scanner = new Scanner(System.in);
	        
	System.out.print("Ingrese un caracter: ");
	char caracter = scanner.next().charAt(0);
	        
	if (Character.isUpperCase(caracter)) {
            System.out.println("El caracter ingresado es una letra mayuscula.");
	} else {
	        System.out.println("El carácter ingresado no es una letra mayuscula.");
	}
    }
}
