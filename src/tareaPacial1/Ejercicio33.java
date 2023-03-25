/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción:  Calcular el mayor de tres números enteros en Java.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
	int num1 = scanner.nextInt();        
	System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();        
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();        
        int mayor = num1;        
        if (num2 > mayor) {
            mayor = num2;
        }        
        if (num3 > mayor) {
            mayor = num3;
        }        
        System.out.println("El numero mayor es: " + mayor);
    }
}
