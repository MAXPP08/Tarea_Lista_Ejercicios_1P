/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Comprobar si un número es múltiplo de tres y de cinco.
 */

package tareaPacial1;

import java.util.Scanner;


public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        
        if (numero%3==0) {
            System.out.println(numero+ " es multiplo de 3");
        } else if (numero%5==0){
            System.out.println(numero+" es multiplo de 5");
        } else if(numero%3==0 || numero%5==0){
            System.out.println(numero+" es multiplo de 3 y 5");
        }else{
            System.out.println(numero+" no es multiplo ni de 3 ni de 5");
        }
    }
}
