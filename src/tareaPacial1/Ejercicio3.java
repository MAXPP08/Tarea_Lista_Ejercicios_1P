/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que lee un número entero por teclado y obtiene
 *              y muestra por pantalla el doble y el triple de ese número.
 */

package tareaPacial1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Proporciona un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("El numero proporcionado es "+numero);
        System.out.println("El doble del numero proporcionado es "+ numero*2);
        System.out.println("El triple del numero proporcionado es: "+numero*3);
    }
    
}
