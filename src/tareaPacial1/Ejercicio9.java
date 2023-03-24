/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que calcula el área de un triángulo a partir de 
 *              la longitud de sus lados.
 */
package tareaPacial1;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float base, altura, area;
        
        System.out.println("Ingresa el valor de la base del triangulo: ");
        base = entrada.nextFloat();
        
        System.out.println("Ingresa el valor de la altura del triangulo: ");
        altura = entrada.nextFloat();
        
        area = (base*altura)/2;
        
        System.out.println("El are del triangulo es igual a: "+area);
    }
}
