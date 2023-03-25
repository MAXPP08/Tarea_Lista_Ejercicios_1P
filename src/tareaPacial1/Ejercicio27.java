/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea dos caracteres y compruebe si son dos letras minúsculas.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio27 {
     public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer caracter: ");
	        char caracter1 = scanner.next().charAt(0);
	        
	        System.out.print("Ingrese el segundo caracter: ");
	        char caracter2 = scanner.next().charAt(0);
	        
	        if (Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)) {
	            System.out.println("Los dos caracteres ingresados son letras minusculas.");
	        } else {
	            System.out.println("Al menos uno de los caracteres ingresados no es una letra minuscula.");
	        }
	        
	        scanner.close();
	    }
}
