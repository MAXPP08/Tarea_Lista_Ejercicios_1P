/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que muestre los números desde N hasta 1 
 *              utilizando las instrucciones for, while y do .. while
 */

package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio44 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;

    public Ejercicio44 (){
        // Configurar la ventana
        setTitle("Contar los números introducidos por teclado");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));

        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese un número entero");
        etiquetaInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaInstrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiquetaInstrucciones);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar el JTextField Entrada de Datos
        entradaDatos = new JTextField(12);
        entradaDatos.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar el botón
        boton = new JButton("Contar");
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(boton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar el JLabel Resultado
        resultado = new JLabel("");
        resultado.setFont(new Font("Arial", Font.PLAIN, 14));
        resultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(resultado);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String entrada = entradaDatos.getText();
                int numero = Integer.parseInt(entrada);

                // Utilizar for
                String resultadoFor = "";
                for (int i = numero; i >= 1; i--) {
                    resultadoFor += i + " ";
                }
                resultadoFor = "For: " + resultadoFor;

                // Utilizar while
                String resultadoWhile = "";
                int j = numero;
                while (j >= 1) {
                    resultadoWhile += j + " ";
                    j--;
                }
                resultadoWhile = "While: " + resultadoWhile;

                // Utilizar do-while
                String resultadoDoWhile = "";
                int k = numero;
                do {
                    resultadoDoWhile += k + " ";
                    k--;
                } while (k >= 1);
                resultadoDoWhile = "Do-While: " + resultadoDoWhile;

                resultado.setText("<html>" + resultadoFor + "<br>" + resultadoWhile + "<br>" + resultadoDoWhile + "</html>");
            }
        });

        // Agregar el panel a la ventana
        add(panel);
    }

    public static void main(String[] args) {
        Ejercicio44 ventana = new Ejercicio44();
        ventana.setVisible(true);
    }
}
