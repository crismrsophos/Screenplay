/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia) 
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 * 
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: Impuestos de Carros
 * Autor: Katalina Marcos.
 * Modificación: Diana Puentes - Jun 23, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.impuestosCarro.test;

import java.util.ArrayList;

import org.junit.Test;

import uniandes.cupi2.impuestosCarro.mundo.Vehiculo;

import static org.junit.Assert.*;

/**
 * Clase de prueba para la línea de un modelo
 */
public class VehiculoTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Vehículo de la prueba 1
     */
    private Vehiculo vehiculo1;

    /**
     * Nombre de la línea
     */
    private String linea;

    /**
     * Nombre de la marca
     */
    private String marca;

    /**
     * Año del modelo
     */
    private String anio;

    /**
     * Precio del vehículo de este modelo
     */
    private double precio;

    /**
     * Ruta de la imagen del vehículo
     */
    private String rutaImagen;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Escenario con una línea sin modelos
     */
    private void setupEscenario1( )
    {
        marca = "Chevrolet";
        linea = "Silverado";
        anio = "2017";
        precio = 147000000;
        rutaImagen = "silverado2017.jpg";
        vehiculo1 = new Vehiculo( marca, linea, anio, precio, rutaImagen );
    }

    /**
     * Prueba la obtención válida del marca del vehículo
     */
    @Test
    public void testDarMarca( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( linea, vehiculo1.darLinea( ) );
    }

    /**
     * Prueba la obtención válida de la línea del vehículo
     */
    @Test
    public void testDarLinea( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( linea, vehiculo1.darLinea( ) );
    }

    /**
     * Prueba la obtención válida del año del vehículo
     */
    @Test
    public void testDarAnio( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( anio, vehiculo1.darAnio( ) );
    }

    /**
     * Prueba la obtención válida del precio del vehículo
     */
    @Test
    public void testDarPrecio( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertTrue( precio == vehiculo1.darPrecio( ) );
    }

    /**
     * Prueba la obtención válida de la ruta de la imagen del vehículo
     */
    @Test
    public void testDarRutaImagen( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( rutaImagen, vehiculo1.darRutaImagen( ) );
    }

}