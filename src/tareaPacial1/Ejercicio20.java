/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea dos números y comprueba si son iguales
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio20 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JTextField entradaDatos2;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio20 (){
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
                String dato1 = entradaDatos.getText();
                String dato2 = entradaDatos2.getText();
                float numero1 = Float.parseFloat(dato1);
                float numero2 = Float.parseFloat(dato2);
                
                if (numero1 == numero2) {
                    resultado.setText(numero1+ " y "+ numero2+" Son Iguales");
                } else {
                    resultado.setText(numero1+ " y "+ numero2+" NO Son Iguales");
                }
                
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
     public static void main(String[] args) {
        Ejercicio20 ventana = new Ejercicio20();
        ventana.setVisible(true);
    }
}

