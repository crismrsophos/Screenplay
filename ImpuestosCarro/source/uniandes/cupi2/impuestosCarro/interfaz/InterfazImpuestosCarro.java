/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n5_calculoImpuestosCarro
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.impuestosCarro.interfaz;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

import uniandes.cupi2.impuestosCarro.mundo.*;

/**
 * Interfaz de c�lculo de impuestos de carros.
 */
@SuppressWarnings("serial")
public class InterfazImpuestosCarro extends JFrame
{

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Ruta de la imagen del banner.
	 */
	public final static String RUTA_IMAGEN = "./data/banner.jpg";

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Calculador de impuestos.
	 */
	private CalculadorImpuestos calculador;

	// -----------------------------------------------------------------
	// Atributos de la interfaz
	// -----------------------------------------------------------------

	/**
	 * Panel de veh�culos.
	 */
	private PanelVehiculo panelVehiculo;

	/**
	 * Panel de descuentos.
	 */
	private PanelDescuentos panelDescuentos;

	/**
	 * Panel de opciones
	 */
	private PanelOpciones panelOpciones;

	/**
	 * Panel de b�squedas.
	 */
	private PanelBusquedas panelBusquedas;

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------

	/**
	 * Crea la interfaz de impuestos de carros.
	 * @throws Exception Error al cargar los archivos.
	 */
	public InterfazImpuestosCarro( ) throws Exception
	{
		setTitle( "C�lculo impuestos" );
		setSize( 600, 700 );
		setLocationRelativeTo( null );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );

		// Crea el calculador de impuestos
		calculador = new CalculadorImpuestos( );

		setLayout( new BorderLayout( ) );

		// Crea los paneles y los agrega a la ventana

		// Imagen del t�tulo
		JLabel labImagen = new JLabel( );
		labImagen.setIcon( new ImageIcon( RUTA_IMAGEN ) );
		add( labImagen, BorderLayout.NORTH );

		JPanel centro = new JPanel( );
		centro.setLayout( new BorderLayout( ) );
		add( centro, BorderLayout.CENTER );

		// Panel de veh�culos: panel activo
		panelVehiculo = new PanelVehiculo( this );
		centro.add( panelVehiculo, BorderLayout.CENTER );

		panelBusquedas = new PanelBusquedas( this );
		centro.add( panelBusquedas, BorderLayout.SOUTH );

		JPanel sur = new JPanel( );
		sur.setLayout( new BorderLayout( ) );
		add( sur, BorderLayout.SOUTH );

		// Panel de descuentos: panel pasivo
		panelDescuentos = new PanelDescuentos( );
		sur.add( panelDescuentos, BorderLayout.CENTER );

		// Panel de opciones: panel activo
		panelOpciones = new PanelOpciones( this );
		sur.add( panelOpciones, BorderLayout.SOUTH );

		Vehiculo actual = calculador.darVehiculoActual( );
		panelVehiculo.actualizar( actual.darMarca( ), actual.darLinea( ), actual.darAnio( ), actual.darPrecio( ), actual.darRutaImagen( ) );

	}

	// -----------------------------------------------------------------
	// Requerimientos funcionales
	// -----------------------------------------------------------------

	/**
	 * Calcula el pago del impuesto seg�n el veh�culo.
	 */
	public void calcularImpuestos( )
	{
		// Pide al panel respectivo la informaci�n de los descuentos
		boolean descProntoPago = panelDescuentos.hayDescuentoProntoPago( );
		boolean descServicioPublico = panelDescuentos.hayDescuentoServicioPublico( );
		boolean descTrasladoCuenta = panelDescuentos.hayDescuentoTrasladoCuenta( );

		// Calcula el valor de los impuestos
		double pago = calculador.calcularPago( descProntoPago, descServicioPublico, descTrasladoCuenta );
		DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
		df.applyPattern( "$ ###,###.##" );

		JOptionPane.showMessageDialog( this, "El valor a pagar es: " + df.format( pago ), "C�lcular impuestos", JOptionPane.INFORMATION_MESSAGE );

	}

	// ----------------------------------------------------------------
	// Puntos de Extensi�n
	// ----------------------------------------------------------------

	/**
	 * Muestra el anterior veh�culo en la lista.
	 */
	public void verAnterior( )
	{
		try
		{
			Vehiculo anterior = calculador.darAnterior( );
			panelVehiculo.actualizar( anterior.darMarca( ), anterior.darLinea( ), anterior.darAnio( ), anterior.darPrecio( ), anterior.darRutaImagen( ) );

		}
		catch( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Ver veh�culo anterior", JOptionPane.WARNING_MESSAGE );
		}
	}

	/**
	 * Muestra el siguiente veh�culo en la lista.
	 */
	public void verSiguiente( )
	{
		try
		{
			Vehiculo siguiente = calculador.darSiguiente( );
			panelVehiculo.actualizar( siguiente.darMarca( ), siguiente.darLinea( ), siguiente.darAnio( ), siguiente.darPrecio( ), siguiente.darRutaImagen( ) );
		}
		catch( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Ver veh�culo siguiente", JOptionPane.WARNING_MESSAGE );
		}

	}

	/**
	 * Muestra el primer veh�culo en la lista.
	 */
	public void verPrimero( )
	{
		try
		{
			Vehiculo primero = calculador.darPrimero( );
			panelVehiculo.actualizar( primero.darMarca( ), primero.darLinea( ), primero.darAnio( ), primero.darPrecio( ), primero.darRutaImagen( ) );
		}
		catch( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Ver primer veh�culo", JOptionPane.WARNING_MESSAGE );
		}
	}

	/**
	 * Muestra el �ltimo veh�culo en la lista.
	 */
	public void verUltimo( )
	{
		try
		{
			Vehiculo ultimo = calculador.darUltimo( );
			panelVehiculo.actualizar( ultimo.darMarca( ), ultimo.darLinea( ), ultimo.darAnio( ), ultimo.darPrecio( ), ultimo.darRutaImagen( ) );
		}
		catch( Exception e )
		{
			JOptionPane.showMessageDialog( this, e.getMessage( ), "Ver �ltimo veh�culo", JOptionPane.WARNING_MESSAGE );
		}
	}

	/**
	 * Busca el veh�culo m�s caro y lo muestra.
	 */
	public void buscarMasCaro( )
	{
		Vehiculo masCaro = calculador.buscarVehiculoMasCaro( );
		panelVehiculo.actualizar( masCaro.darMarca( ), masCaro.darLinea( ), masCaro.darAnio( ), masCaro.darPrecio( ), masCaro.darRutaImagen( ) );

	}

	/**
	 * Busca el veh�culo de la l�nea y lo muestra. Si no hay ninguno le informa al usuario.
	 */
	public void buscarPorLinea( )
	{
		String linea = panelBusquedas.darLinea();
		
		if( linea.isEmpty( ) )
		{
			JOptionPane.showMessageDialog( this, "Debe ingresar una l�nea.", 
					                             "Buscar por l�nea", JOptionPane.ERROR_MESSAGE );
			panelBusquedas.limpiar();
		}
		else
		{

			Vehiculo respuesta = calculador.buscarVehiculoPorLinea( linea );
			if( respuesta == null )
			{
				JOptionPane.showMessageDialog( this, "No se encontr� ning�n veh�culo de esta l�nea", 
						                             "Buscar por l�nea", JOptionPane.ERROR_MESSAGE );
			}
			else
			{
				panelVehiculo.actualizar( respuesta.darMarca( ), respuesta.darLinea( ), 
						                  respuesta.darAnio( ), respuesta.darPrecio( ), 
						                  respuesta.darRutaImagen( ) );

			}
		}
	}
	

		/**
		 * Busca el primer veh�culo de la marca y lo muestra. Si no hay ninguno informa al usuario.
		 */
		public void buscarPorMarca( )
		{
			String marca = panelBusquedas.darMarca();

			if( marca.isEmpty( ) )
			{
				JOptionPane.showMessageDialog( this, "Debe ingresar una marca.", "Buscar por marca", JOptionPane.ERROR_MESSAGE );
				panelBusquedas.limpiar();
			}
			else
			{
				Vehiculo respuesta = calculador.buscarVehiculoPorMarca( marca );
				if( respuesta == null )
				{
					JOptionPane.showMessageDialog( this, "No se encontr� ning�n veh�culo de esta marca", "Buscar por marca", JOptionPane.ERROR_MESSAGE );
				}
				else
				{
					panelVehiculo.actualizar( respuesta.darMarca( ), respuesta.darLinea( ), respuesta.darAnio( ), respuesta.darPrecio( ), respuesta.darRutaImagen( ) );
				}
			}
		}

			// ----------------------------------------------------------------
			// Puntos de Extensi�n
			// ----------------------------------------------------------------
			/**
			 * Llamado para realizar el m�todo de extensi�n 1.
			 */
			public void reqFuncOpcion1( )
			{
				String respuesta = calculador.metodo1( );
				JOptionPane.showMessageDialog( this, respuesta, "Respuesta", JOptionPane.INFORMATION_MESSAGE );

				Ventana1 ventana1 = new Ventana1();
				ventana1.setVisible(true); // Hacemos visible la ventana.


			}

			/**
			 * Llamado para realizar el m�todo de extensi�n 2.
			 */
			public void reqFuncOpcion2( )
			{
				String respuesta = calculador.metodo2( );
				JOptionPane.showMessageDialog( this, respuesta, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
			}

			// -----------------------------------------------------------------
			// Main
			// -----------------------------------------------------------------

			/**
			 * Ejecuta la aplicaci�n.
			 * @param pArgs Par�metros de la ejecuci�n. No son necesarios.
			 */
			public static void main( String[] pArgs )
			{
				try
				{
					// Unifica la interfaz para Mac y para Windows.
					UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

					InterfazImpuestosCarro interfaz = new InterfazImpuestosCarro( );
					interfaz.setVisible( true );
				}
				catch( Exception e )
				{
					e.printStackTrace( );
				}
			}
		}