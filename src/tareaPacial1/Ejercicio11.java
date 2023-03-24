/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea un número entero N de 5 cifras y muestre sus 
 *              cifras desde el principio.
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingresa un numero entero: ");
        numero = entrada.nextInt();
        
        String stringNumero = Integer.toString(numero);
        System.out.println("Las cifras del numero son: ");
        for (int i = 0; i < stringNumero.length(); i++) {
            System.out.println(stringNumero.charAt(i));
        }       
    }
}
