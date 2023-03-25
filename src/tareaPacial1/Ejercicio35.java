/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción:  Programa que lea una variable entera mes y compruebe si el 
 *               valor corresponde a un mes de 30, 31 o 28 días. Se mostrará 
 *               además el nombre del mes. Se debe comprobar que el valor 
 *               introducido esté comprendido entre 1 y 12.
 */

package tareaPacial1;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un mes (1-12): ");
        int mes = sc.nextInt();
        sc.close();        
        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 2:
                System.out.println("Febrero tiene 28 días.");
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("El mes " + mes + " tiene 30 dias.");
                break;
                default:
                System.out.println("El mes " + mes + " tiene 31 dias.");
                break;
	    }
	} else {
	    System.out.println("El valor introducido no es valido. Debe ser un numero entre 1 y 12.");
	}
    }
}
