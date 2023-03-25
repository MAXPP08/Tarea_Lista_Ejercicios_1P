/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa Java que lea dos números y muestre los números pares entre ellos
 */

package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio46 extends JFrame {
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JTextField entradaDatos2;
    private JButton boton;
    private JLabel resultado;

    public Ejercicio46() {
        // Configurar la ventana
        setTitle("Mostrar números pares entre dos números");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));

        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese dos números separados por una coma:");
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
        boton = new JButton("Preciona Aquí");
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
                // Obtener los números ingresados
                String entrada = entradaDatos.getText();
                String[] numeros = entrada.split(",");
                int num1 = Integer.parseInt(numeros[0]);
                int num2 = Integer.parseInt(numeros[1]);

                // Verificar cuál número es mayor y cuál es menor
                int menor = Math.min(num1, num2);
                int mayor = Math.max(num1, num2);

                // Mostrar los números pares entre los dos números
                String pares = "";
                for (int i = menor; i <= mayor; i++) {
                    if (i % 2 == 0) {
                        if (pares.isEmpty()) {
                            pares += i;
                        } else {
                            pares += ", " + i;
                        }
                    }
                }

                // Mostrar el resultado
                resultado.setText("Los números pares entre " + num1 + " y " + num2 + " son: " + pares);
            }
        });

        // Agregar el panel a la ventana
        add(panel);
    }

    public static void main(String[] args) {
        Ejercicio46 ventana = new Ejercicio46();
        ventana.setVisible(true);
    }
}
