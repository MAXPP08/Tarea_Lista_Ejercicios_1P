/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa para pasar una calificación numérica a alfabética.
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio36 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio36 (){
        // Configurar la ventana
        setTitle("Convertir calificación numérica a alfabética");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese la calificación numérica:");
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
        boton = new JButton("Convertir");
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
                // Obtener la calificación numérica ingresada
                String calificacion = entradaDatos.getText();
                
                // Convertir la calificación numérica a alfabética
                String calificacionAlfabetica = convertirCalificacion(calificacion);
                
                // Actualizar el JLabel Resultado
                resultado.setText("La calificación alfabética es: " + calificacionAlfabetica);
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    
    private String convertirCalificacion(String calificacion) {
        int calificacionNumerica = Integer.parseInt(calificacion);
        
        if (calificacionNumerica >= 90) {
            return "A";
        } else if (calificacionNumerica >= 80) {
            return "B";
        } else if (calificacionNumerica >= 70) {
            return "C";
        } else if (calificacionNumerica >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
     public static void main(String[] args) {
        Ejercicio36 ventana = new Ejercicio36();
        ventana.setVisible(true);
    }
}
