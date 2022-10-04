package uniandes.cupi2.impuestosCarro.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class DialogoAgregarVehiculo extends JFrame implements ActionListener {

    private JPanel panel = new JPanel();
    private JLabel etiquetaMarca = new JLabel("Marca:");
    private JTextField textBoxMarca = new JTextField();
    private JLabel etiquetaLinea = new JLabel("Línea:");
    private JTextField textBoxLinea = new JTextField();
    private JLabel etiquetaAnio = new JLabel("Año:");
    private JTextField textBoxAnio = new JTextField();
    private JLabel etiquetaPrecio = new JLabel("Precio:");
    private JTextField textBoxPrecio = new JTextField();
    private JLabel etiquetaImagen = new JLabel("Imágen:");
    private JTextField textBoxImagen = new JTextField();
    private JButton botonAgregarVehiculo = new JButton();
    private String marca, linea, anio, precio, rutaImagen;

    private InterfazImpuestosCarro principal;

    public DialogoAgregarVehiculo(InterfazImpuestosCarro ventanaPrincipal) {
        principal = ventanaPrincipal;
        setSize(300, 200);
        setLocationRelativeTo(null);
        IniciarComponentes();

    }

    private void IniciarComponentes(){


        panel.setLayout(null); //desactivar layout por defecto
        this.getContentPane().add(panel); //Agregar panel a la ventana

        etiquetaMarca.setBounds(10,10,50,20);
        panel.add(etiquetaMarca);

        textBoxMarca.setBounds(90, 10, 170, 20);
        panel.add(textBoxMarca);


        etiquetaLinea.setBounds(10,40,50,20);
        panel.add(etiquetaLinea);

        textBoxLinea.setBounds(90, 40, 170, 20);
        panel.add(textBoxLinea);


        etiquetaAnio.setBounds(10,70,50,20);
        panel.add(etiquetaAnio);

        textBoxAnio.setBounds(90, 70, 170, 20);
        panel.add(textBoxAnio);


        etiquetaPrecio.setBounds(10,100,50,20);
        panel.add(etiquetaPrecio);

        textBoxPrecio.setBounds(90, 100, 170, 20);
        panel.add(textBoxPrecio);


        /*etiquetaImagen.setBounds(10,130,50,20);
        panel.add(etiquetaImagen);

        textBoxImagen.setBounds(90, 130, 170, 20);
        panel.add(textBoxImagen);*/


        botonAgregarVehiculo.setBounds(90, 130, 170, 20);
        botonAgregarVehiculo.setText("Agregar vehículo");
        panel.add(botonAgregarVehiculo);
        botonAgregarVehiculo.addActionListener(this::actionPerformed);


    }

    public void actionPerformed (ActionEvent evento){

        String ruta = "";
        JFileChooser seleccionadorArchivos = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF","jpg", "png", "gif");
        seleccionadorArchivos.setFileFilter(filtro);

        int respuesta = seleccionadorArchivos.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION){
            ruta = seleccionadorArchivos.getSelectedFile().getName();
        }

        marca = textBoxMarca.getText();
        linea = textBoxLinea.getText();
        anio = textBoxAnio.getText();
        precio = textBoxPrecio.getText();
        rutaImagen = ruta;

        //rutaImagen = textBoxImagen.getText();

        principal.agregarVehiculo(marca, linea, anio, precio, rutaImagen);

        JOptionPane.showMessageDialog(this, "El vehículo " + marca + " " + linea + " modelo " + anio+ " ha sido agregado correctamente");
        dispose();

    }

    public String darMarca(){
        return  marca;
    }

    public String darLinea(){
        return linea;
    }

    public String darAnio(){
        return  anio;
    }

    public String darPrecio(){
        return precio;
    }

    public String darImagen(){
        return rutaImagen;
    }

}
