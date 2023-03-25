/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Contar los números positivos introducidos por teclado
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;
	        
        do {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                contador++;
            }
        } while (numero != 0);
        
        System.out.println("Se ingresaron " + contador + " números positivos.");
    }
}
