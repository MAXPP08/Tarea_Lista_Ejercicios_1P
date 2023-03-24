/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Comprobar si un número es múltiplo de dos o de tres.
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio24 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;
    
    public Ejercicio24 (){
        // Configurar la ventana
        setTitle("Múltiplo de dos o de tres");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese un número:");
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
                
                try {
                    int numero = Integer.parseInt(entrada);
                    
                    if (numero % 2 == 0) {
                        resultado.setText(numero + " es múltiplo de 2");
                    } else if (numero % 3 == 0) {
                        resultado.setText(numero + " es múltiplo de 3");
                    } else {
                        resultado.setText(numero + " no es múltiplo de 2 ni de 3");
                    }
                } catch (NumberFormatException ex) {
                    resultado.setText("Entrada inválida");
                }
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    public static void main(String[] args) {
        Ejercicio24 ventana = new Ejercicio24();
        ventana.setVisible(true);
    }
}

