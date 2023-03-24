/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que calcula el número de la suerte de una persona 
 *              a partir de su fecha de nacimiento.
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Leer la Fecha de Nacimiento del Usuario
        System.out.println("Ingresa su Fecha de Nacimiento en formato dd/mm/aaaa: ");
        String fechaNacimiento = entrada.nextLine();
        
        // Calcular la suma de los digitos de la fecha de nacimiento
        int sumaDigitos = 0;
        for (int i = 0; i < fechaNacimiento.length(); i++) {
            char caracter = fechaNacimiento.charAt(i);
            if (Character.isDigit(caracter)) {
                sumaDigitos += Character.getNumericValue(caracter);
            }
        }
        
        // Recibir la suma de Digitos a un solo digito
        int numeroSuerte = 0;
        while (sumaDigitos > 0) {            
            numeroSuerte += sumaDigitos % 10;
            sumaDigitos/=10;
        }
        
        // Mostramos el numero de la suerte
        System.out.println("Su Numero de la Suerte es "+numeroSuerte);
    }
}
