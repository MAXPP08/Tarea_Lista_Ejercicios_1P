/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lee por teclado el valor del radio de una 
 *              circunferencia y calcula y muestra por pantalla la longitud
 *              y el área de la circunferencia. Longitud de la 
 *              circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float radio, longitud, area;
        final float PI = 3.1416f;
        
        System.out.println("Proporciona un valor para el Radio: ");
        radio = entrada.nextFloat();
        
        longitud = 2*PI*radio;
        area = PI*radio*radio;
        
        System.out.println("La Longitud del curculo es: "+ longitud);
        System.out.println("El Area del circulo es: "+ area);
    }
}
