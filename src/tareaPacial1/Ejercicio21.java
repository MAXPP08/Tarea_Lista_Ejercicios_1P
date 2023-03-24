/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea dos números y calcula cuál es el mayor.
 */

package tareaPacial1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        float num1 = entrada.nextFloat();
        
        System.out.println("Ingrese un numero: ");
        float num2 = entrada.nextFloat();
        
        if (num1 > num2) {
            System.out.println(num1+" es mayor que "+ num2);
        } else {
            System.out.println(num2+" es mayor que "+ num1);
        }
    }
}
