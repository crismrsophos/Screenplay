package uniandes.cupi2.impuestosCarro.interfaz;

import javax.swing.*;

public class Ventana1 extends JFrame {
    public Ventana1(){
        this.setSize(400,400); //Se establece el tamaño de la ventana.
        this.setTitle("Ingreso de carro");
        //this.setLocation(500,130);
        //this.setBounds(500,130,400,400);
        this.setLocationRelativeTo(null); //Me centra la ventana en la pantalla.

        iniciarComponentes();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creación de panel

        //panel.setBackground();

        this.getContentPane().add(panel); //Agregamos panel a la ventana
    }

}
