/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que lea un número entero y calcule si es par o impar.
 */ 

package tareaPacial1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("El numero "+numero+" es par");
        } else {
            System.out.println("EL numero "+numero+" NO es par");
        }
    }
}
