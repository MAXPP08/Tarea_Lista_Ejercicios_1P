/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa lea la longitud de los catetos de un triángulo 
 *              rectángulo y calcule la longitud de la hipotenusa según 
 *              el teorema de Pitágoras.
 */
package tareaPacial1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float catetoA, catetoB, hipotenusa;
        
        System.out.println("Ingresa el valor del Cateto A: ");
        catetoA = entrada.nextFloat();
        
        System.out.println("Ingresa el valor del Cateto B: ");
        catetoB = entrada.nextFloat();
        
        //hipotenusa = ((float) Math.pow(2, catetoA)) + ((float)Math.pow(2, catetoB));
        hipotenusa = (catetoA*catetoA)+(catetoB*catetoB);
        System.out.println("La Hipotenusa del rectangulo es: "+ hipotenusa);
                
    }
}
