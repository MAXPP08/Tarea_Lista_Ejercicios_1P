/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que pase de millas a kilómetros
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de millas a convertir: ");
        double millas = scanner.nextDouble();	        
        double kilometros = millas * 1.60934;        
	System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
    }
}
