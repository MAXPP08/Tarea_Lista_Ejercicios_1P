/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Comprobar si dos números enteros terminan con la misma cifra.
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio22 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JTextField entradaDatos2;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio22 (){
        // Configurar la ventana
        setTitle("Terminacion con la misma cifra");
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
                 // Obtener los dos números enteros ingresados por el usuario
                int num1 = Integer.parseInt(entradaDatos.getText());
                int num2 = Integer.parseInt(entradaDatos2.getText());
        
                // Obtener la última cifra de cada número
                int ultimaCifra1 = num1 % 10;
                int ultimaCifra2 = num2 % 10;
        
                // Comprobar si las dos últimas cifras son iguales
                if (ultimaCifra1 == ultimaCifra2) {
                    // Mostrar mensaje de que los números terminan con la misma cifra
                    resultado.setText("Los números terminan con la misma cifra.");
                } else {
                    // Mostrar mensaje de que los números no terminan con la misma cifra
                    resultado.setText("Los números no terminan con la misma cifra.");
            }
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
     public static void main(String[] args) {
        Ejercicio22 ventana = new Ejercicio22();
        ventana.setVisible(true);
    }
}

