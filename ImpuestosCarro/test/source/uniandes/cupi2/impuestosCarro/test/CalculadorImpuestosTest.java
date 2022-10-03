/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n5_calculoImpuestosCarro
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.impuestosCarro.test;

import org.junit.Test;
import static org.junit.Assert.*;
import uniandes.cupi2.impuestosCarro.mundo.CalculadorImpuestos;

/**
 * Clase de prueba para el calculador de impuestos de vehículos
 */
public class CalculadorImpuestosTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Calculador de impuestos
     */
    private CalculadorImpuestos calculador;
    /**
     * Precio de prueba
     */
    private double precio;
    /**
     * Valor de prueba
     */
    private double pago;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Prepara un escenario con el calculador
     */
    private void setupEscenario1( )
    {
        try
        {
            // Crea y prepara al calculador de impuestos
            calculador = new CalculadorImpuestos( );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }

    /**
     * Prepara un escenario con la información de un vehículo que existe
     */
    private void setupEscenario2( )
    {
        setupEscenario1( );
        precio = 136340000;
        pago = 3408500;
    }

    /**
     * Verifica el cálculo del pago de un vehículo que existe sin aplicar descuentos
     */
    @Test
    public void testCalcularPagoExisteSinDescuentos( )
    {
        double pagoObtenido = -1;

        // Configura el ambiente de prueba
        setupEscenario2( );

        try
        {
            pagoObtenido = calculador.calcularPago( false, false, false );
            assertEquals( "Igualdad de pagos", pago, pagoObtenido, 0 );
        }
        catch( Exception e )
        {
            assertTrue( true );
        }
    }

    /**
     * Prueba el cálculo del pago de un vehículo que existe con el descuento de pronto pago;
     */
    @Test
    public void testCalcularPagoExisteProntoPago( )
    {
        double pagoObtenido = -1;

        // Configura el ambiente de prueba
        setupEscenario2( );

        pago -= pago * CalculadorImpuestos.PORC_DESC_PRONTO_PAGO / 100;

        try
        {
            pagoObtenido = calculador.calcularPago( true, false, false );
            assertEquals( "Igualdad de pagos", pago, pagoObtenido, 0 );
        }
        catch( Exception e )
        {
            assertTrue( true );
        }
    }

    /**
     * Prueba el calculo del pago de un vehículo que existe con el descuento de servicio público;
     */
    @Test
    public void testCalcularPagoExisteSPublico( )
    {
        double pagoObtenido = -1;

        // Configura el ambiente de prueba
        setupEscenario2( );

        pago -= CalculadorImpuestos.VALOR_DESC_SERVICIO_PUBLICO;

        try
        {
            pagoObtenido = calculador.calcularPago( false, true, false );
            assertEquals( "Igualdad de pagos", pago, pagoObtenido, 0 );
        }
        catch( Exception e )
        {
            assertTrue( true );
        }
    }

    /**
     * Prueba el cálculo del pago de un vehículo que existe con el descuento de traslado de cuenta;
     */
    @Test
    public void testCalcularPagoExisteTrasladoCuenta( )
    {
        double pagoObtenido = -1;

        // Configura el ambiente de prueba
        setupEscenario2( );

        pago -= pago * CalculadorImpuestos.PORC_DESC_TRASLADO_CUENTA / 100;

        try
        {
            pagoObtenido = calculador.calcularPago( false, false, true );
            assertEquals( "Igualdad de pagos", pago, pagoObtenido, 0 );
        }
        catch( Exception e )
        {
            assertTrue( true );
        }
    }

    /**
     * Prueba el cálculo del pago de un vehículo que existe con todos los descuentos;
     */
    @Test
    public void testCalcularPagoExisteTodosDescuentos( )
    {
        double pagoObtenido = -1;

        // Configura el ambiente de prueba
        setupEscenario2( );

        pago -= pago * CalculadorImpuestos.PORC_DESC_PRONTO_PAGO / 100;
        pago -= CalculadorImpuestos.VALOR_DESC_SERVICIO_PUBLICO;
        pago -= pago * CalculadorImpuestos.PORC_DESC_TRASLADO_CUENTA / 100;

        try
        {
            pagoObtenido = calculador.calcularPago( true, true, true );
            assertEquals( "Igualdad de pagos", pago, pagoObtenido, 0 );
        }
        catch( Exception e )
        {
            assertTrue( true );
        }
    }
}