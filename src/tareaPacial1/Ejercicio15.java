/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa quite a una variable N sus m últimas cifras.
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un Numero entero: ");
        int numero = entrada.nextInt();
        
        System.out.println("Ingrese el numero de cifras a eliminar");
        int eliminar = entrada.nextInt();
        
        // Calcular la division que se usara para para eliminar las ultimas cifras
        int divisor = (int) Math.pow(10, eliminar);
        
        // Obtener el numero sin las ultimas K cifras 
        int resultado = numero/divisor;
        
        // Mostrar el reusltado
        System.out.println("El numero sin las ultimas " + eliminar + " cifras es: "+ resultado);
    }
}
