/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea dos números por teclado y muestre el 
 *              resultado de la división del mayor entre el menor. Se debe 
 *              comprobar que el divisor no puede ser cero
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio32 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JTextField entradaDatos2;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio32 (){
        // Configurar la ventana
        setTitle("Comprobar si son iguales");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese un numero en cada casilla");
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
        
        // Agregar el JTextField Entrada de Datos
        entradaDatos2 = new JTextField(12);
        entradaDatos2.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos2);
        panel.add(Box.createRigidArea(new Dimension(0, 40)));

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
                // Leer los números ingresados
                double num1 = Double.parseDouble(entradaDatos.getText());
                double num2 = Double.parseDouble(entradaDatos2.getText());

                // Determinar el número mayor y el número menor
                double mayor = Math.max(num1, num2);
                double menor = Math.min(num1, num2);

                // Realizar la división y comprobar que el divisor no sea cero
                if (menor != 0) {
                    double resultadoDivision = mayor / menor;
                    resultado.setText("El resultado de la división es: " + resultadoDivision);
                } else {
                    resultado.setText("El divisor no puede ser cero.");
                }
                
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
     public static void main(String[] args) {
        Ejercicio32 ventana = new Ejercicio32();
        ventana.setVisible(true);
    }
}

