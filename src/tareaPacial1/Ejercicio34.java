/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lea tres números enteros H, M, S que contienen 
 *              hora, minutos y segundos respectivamente, y comprueba si la
 *              hora que indican es una hora válida.
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio34 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JTextField entradaDatos2;
    private JTextField entradaDatos3;
    private JButton boton;
    private JLabel resultado;
    
    public Ejercicio34 (){
        // Configurar la ventana
        setTitle("Comprobar si son iguales");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 250));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Ingrese la hora en formato HH:MM:SS");
        etiquetaInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
        etiquetaInstrucciones.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiquetaInstrucciones);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar el JTextField Entrada de Datos para la hora
        entradaDatos = new JTextField(2);
        entradaDatos.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos);
        panel.add(new JLabel(":"));

        // Agregar el JTextField Entrada de Datos para los minutos
        entradaDatos2 = new JTextField(2);
        entradaDatos2.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos2);
        panel.add(new JLabel(":"));

        // Agregar el JTextField Entrada de Datos para los segundos
        entradaDatos3 = new JTextField(2);
        entradaDatos3.setFont(new Font("Arial", Font.PLAIN, 12));
        entradaDatos3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(entradaDatos3);
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
                // Obtener los valores ingresados por el usuario
                int hora = Integer.parseInt(entradaDatos.getText());
                int minutos = Integer.parseInt(entradaDatos2.getText());
                int segundos = Integer.parseInt(entradaDatos3.getText());
                
                // Verificar si la hora es válida
                if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
                    resultado.setText("La hora ingresada es válida");
                } else {
                    resultado.setText("La hora ingresada no es válida");
                }
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    public static void main(String[] args) {
        Ejercicio34 ventana = new Ejercicio34();
        ventana.setVisible(true);
    }
}