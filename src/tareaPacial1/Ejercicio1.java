/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que lea dos números enteros por teclado y 
 *              los muestre por pantalla.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Creamos un Objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        float num1, num2;
        // Solicitamos los datos la usuario
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextFloat();
        System.out.println("Itroduce un numero: ");
        num2 = entrada.nextFloat();
        // Imprimimos los datos que proporciono el usuario
        System.out.println("El primer numero introducido es: "+num1);
        System.out.println("El segundo numero introducido es: "+num2);
    }
    
}
