/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 22/03/2023
 * Fecha de Actualización: 22/03/2023
 * Descripción: Programa que lee un número de 3 cifras y muestra sus cifras por separado
 */
package tareaPacial1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio10 extends JFrame{
    private JPanel panel;
    private JLabel etiquetaInstrucciones;
    private JTextField entradaDatos;
    private JButton boton;
    private JLabel resultado;
    
    
    public Ejercicio10 (){
        // Configurar la ventana
        setTitle("Muestra de cifras por separado");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Crear el panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(new Color(153, 153, 255));
        
        // Agregar las instrucciones
        etiquetaInstrucciones = new JLabel("Digita un numero entero");
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
                String dato = entradaDatos.getText();
                 String cifras = "";
                for (int i = 0; i < dato.length(); i++) {
                    //System.out.println(dato.charAt(i));
                    cifras += dato.charAt(i) + " ";
                }   
                resultado.setText("Las cifras del numero son: "+ cifras);
            }
        });
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
     public static void main(String[] args) {
        Ejercicio10 ventana = new Ejercicio10();
        ventana.setVisible(true);
    }
}
