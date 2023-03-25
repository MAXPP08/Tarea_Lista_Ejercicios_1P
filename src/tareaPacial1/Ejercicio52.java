/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que implemta el Cifrado de Cesar
 */
package tareaPacial1;


public class Ejercicio52 {
    // Función que realiza el cifrado de César
    public static String cifrar(String texto, int desplazamiento) {
        String resultado = "";

        // Recorremos cada carácter del texto
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            // Si el carácter es una letra mayúscula
            if (Character.isUpperCase(caracter)) {
                caracter = (char) ((caracter + desplazamiento - 'A') % 26 + 'A');
            }
            // Si el carácter es una letra minúscula
            else if (Character.isLowerCase(caracter)) {
                caracter = (char) ((caracter + desplazamiento - 'a') % 26 + 'a');
            }

            // Agregamos el carácter cifrado al resultado
            resultado += caracter;
        }

        return resultado;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String textoOriginal = "Hola Mundo!";
        int desplazamiento = 3;

        String textoCifrado = cifrar(textoOriginal, desplazamiento);

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto cifrado: " + textoCifrado);
    }
}
