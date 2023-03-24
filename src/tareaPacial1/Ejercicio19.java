/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea un número entero y muestre si el número es múltiplo de 10.
 */


package tareaPacial1;

import java.util.Scanner;
import javax.swing.SpringLayout;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO ENTERO: ");
        int numero = entrada.nextInt();
        
        if (numero % 10 == 0) {
            System.out.println("El numero "+numero+" es multiplo de 10");
        } else {
            System.out.println("El numero "+numero+" NO es multiplo de 10");
        }
    }
}
