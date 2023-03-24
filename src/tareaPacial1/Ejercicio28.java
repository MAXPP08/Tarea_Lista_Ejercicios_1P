/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea un carácter y compruebe si es un número 
 *              (Carácter entre '0' y '9').
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio28 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio28 (){
        // Configurar la ventana
        setTitle("Carácter entre '0' y '9");
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
                String entrada = entradaDatos.getText();
                char caracter = entrada.charAt(0);
        
                if (Character.isDigit(caracter)) {
                    resultado.setText("El carácter es un número entre '0' y '9'.");
                } else {
                    resultado.setText("El carácter NO es un número entre '0' y '9'.");
                }
                
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
     public static void main(String[] args) {
        Ejercicio28 ventana = new Ejercicio28();
        ventana.setVisible(true);
    }
}


