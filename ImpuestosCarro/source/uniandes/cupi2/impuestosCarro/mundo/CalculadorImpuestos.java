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
package uniandes.cupi2.impuestosCarro.mundo;

import java.io.*;
import java.util.*;

/**
 * Calculador de impuestos.
 */
public class CalculadorImpuestos
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Porcentaje de descuento por pronto pago.
     */
    public static final double PORC_DESC_PRONTO_PAGO = 10.0;

    /**
     * Valor de descuento por servicio p�blico.
     */
    public static final double VALOR_DESC_SERVICIO_PUBLICO = 50000.0;

    /**
     * Porcentaje de descuento por traslado de cuenta.
     */
    public static final double PORC_DESC_TRASLADO_CUENTA = 5.0;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Veh�culos que maneja el calculador.
     */
    private Vehiculo[] vehiculos;

    /**
     * Veh�culo actual mostrado en la aplicaci�n.
     */
    private int posVehiculoActual;

    /**
     * Rangos de los impuestos.
     */
    private RangoImpuesto[] rangosImpuesto;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un calculador de impuestos, cargando la informaci�n de dos archivos. <br>
     * <b>post: </b> Se inicializaron los arreglos de veh�culos y rangos.<br>
     * Se cargaron los datos correctamente a partir de los archivos.
     * @throws Exception Error al cargar los archivos.
     */

    //@@@@@@@@@@@@@@@@@@@@@ Ac� se carga los carros y las tablas de impuestos
    public CalculadorImpuestos( ) throws Exception
    {
        cargarVehiculos( "data/vehiculos.txt" );
        cargarTablaImpuestos( "data/impuestos.properties" );
    }

    // ----------------------------------------------------------------
    // M�todos
    // ----------------------------------------------------------------

    //@@@@@@@@@@@@@@@@@@@@@ Ac� se agregan los carros
    /**
     * Carga los datos de los veh�culos que maneja el calculador de impuestos. <br>
     * <b>post: </b> Se cargan todos los veh�culos del archivo con sus datos.
     * @param pArchivo Nombre del archivo donde se encuentran los datos de los veh�culos. pArchivo != null.
     * @throws Exception Si ocurre alg�n error cargando los datos.
     */
    private void cargarVehiculos( String pArchivo ) throws Exception
    {

        String texto, valores[], sMarca, sLinea, sModelo, sImagen;
        double precio;
        int cantidad = 0;
        Vehiculo vehiculo;

        try
        {
            File datos = new File( pArchivo );
            FileReader fr = new FileReader( datos );
            BufferedReader lector = new BufferedReader( fr );
            texto = lector.readLine( );

            cantidad = Integer.parseInt( texto );
            vehiculos = new Vehiculo[cantidad];
            posVehiculoActual = 0;

            texto = lector.readLine( );

            for( int i = 0; i < vehiculos.length; i++ )
            {
                valores = texto.split( "," );

                sMarca = valores[ 0 ];
                sLinea = valores[ 1 ];
                sModelo = valores[ 2 ];
                sImagen = valores[ 4 ];
                precio = Double.parseDouble( valores[ 3 ] );

                vehiculo = new Vehiculo( sMarca, sLinea, sModelo, precio, sImagen );
                vehiculos[ i ] = vehiculo;

                // Siguiente l�nea
                texto = lector.readLine( );
            }

            lector.close( );
        }
        catch( IOException e )
        {
            throw new Exception( "Error al cargar los datos almacenados de veh�culos." );
        }
        catch( NumberFormatException e )
        {
            throw new Exception( "El archivo no tiene el formato esperado." );
        }
    }

    //@@@@@@@@@@@@ Estamos haciendo esto @@@@@@@@@@@@
    private void AgregarVehiculoLista (String pArchivo, String Marca, String Linea, String Modelo, Double Valor, String RutaImagen) throws Exception
    {

        String texto, valores[], sMarca, sLinea, sModelo, sImagen;
        double precio;
        int cantidad = 0;

        try
        {
            sMarca = Marca;
            sLinea = Linea;
            sModelo = Modelo;
            precio = Valor;
            sImagen = RutaImagen;

            File datos = new File( pArchivo );

            FileReader fr = new FileReader( datos );
            BufferedReader lector = new BufferedReader( fr );
            texto = lector.readLine( );
            cantidad = Integer.parseInt( texto );
            lector.close();

            cantidad += 1;
            String numero = Integer.toString(cantidad);

            //
            String newString = numero;
            File myFile = new File( pArchivo );
            // An array to store each line in the file
            ArrayList<String> fileContent = new ArrayList<String>();
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                // Reads the file content into an array
                fileContent.add(myReader.nextLine());
            }
            myReader.close();

            fileContent.remove(0);
            fileContent.add(0, newString);
            // Writes the new content to file
            FileWriter myWriter = new FileWriter(pArchivo);
            for (int i = 0; i < fileContent.size(); i++ ) {

                if(i == fileContent.size() - 1)
                {
                    myWriter.write(fileContent.get(i));
                }
                else{
                    myWriter.write(fileContent.get(i) + "\n");
                }
            }
            myWriter.close();
            //

            FileWriter fw = new FileWriter( datos, true );
            BufferedWriter escritor = new BufferedWriter( fw );
            escritor.newLine();
            escritor.write(sMarca+ "," + sLinea + "," + sModelo + "," + precio + "," + sImagen);
            escritor.close();
        }

        catch ( IOException e )
        {
            throw new Exception( "Error al cargar los datos almacenados de veh�culos." );
        }
        catch( NumberFormatException e )
        {
            throw new Exception( "El archivo no tiene el formato esperado." );
        }

    }

    /**
     * Carga la tabla de impuestos por los rangos. <br>
     * <b>post: </b> Se cargan todos valores de impuestos seg�n los rangos de valores.
     * @param pArchivo Ubicaci�n del archivo a leer. pArchivo != null.
     * @throws Exception Si ocurre un error al cargar los rangos.
     */
    private void cargarTablaImpuestos( String pArchivo ) throws Exception
    {
        Properties datos = new Properties( );
        int rangos = 0;
        String texto, valores[];
        double inicio, fin, porcentaje;
        RangoImpuesto rango;
        try
        {
            FileInputStream input = new FileInputStream( pArchivo );
            datos.load( input );
            rangos = Integer.parseInt( datos.getProperty( "numero.rangos" ) );
            rangosImpuesto = new RangoImpuesto[rangos];

            for( int i = 0; i < rangos; i++ )
            {
                texto = datos.getProperty( "rango" + ( i + 1 ) );
                valores = texto.split( "," );
                try
                {
                    inicio = Double.parseDouble( valores[ 0 ] );
                    fin = Double.parseDouble( valores[ 1 ] );
                    porcentaje = Double.parseDouble( valores[ 2 ] );
                }
                catch( Exception e )
                {
                    throw new Exception( "Error en la definici�n de rango" + i );
                }

                rango = new RangoImpuesto( inicio, fin, porcentaje );
                rangosImpuesto[ i ] = rango;
            }
        }
        catch( IOException e )
        {
            throw new Exception( "Error al cargar los rangos de impuestos." );
        }
        catch( NumberFormatException e )
        {
            throw new Exception( "Error en el formato del archivo." );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            throw new Exception( "Error en el formato del archivo." );
        }
    }

    /**
     * Busca, dado un valor, el rango de impuestos al que corresponde.
     * @param pValor Valor a buscar. pValor > 0.
     * @return Rango de impuesto que contiene al valor o null si no lo encuentra.
     */
    private RangoImpuesto buscarRangoImpuesto( double pValor )
    {
        RangoImpuesto rango = null;
        for( int i = 0; i < rangosImpuesto.length && rango == null; i++ )
        {
            RangoImpuesto rangoAux = rangosImpuesto[ i ];
            if( rangoAux.contieneA( pValor ) )
            {
                rango = rangoAux;
            }
        }
        return rango;
    }

    /**
     * Calcula el pago de impuesto que debe hacer el veh�culo actual. <br>
     * <b>pre:</b> Las listas de rangos y veh�culos est�n inicializadas.
     * @param pDescProntoPago Indica si aplica el descuento por pronto pago.
     * @param pDescServicioPublico Indica si aplica el descuento por servicio p�blico.
     * @param pDescTrasladoCuenta Indica si aplica el descuento por traslado de cuenta.
     * @return Valor a pagar de acuerdo con las caracter�sticas del veh�culo y los descuentos que se pueden aplicar.
     */
    public double calcularPago( boolean pDescProntoPago, boolean pDescServicioPublico, boolean pDescTrasladoCuenta )
    {
        double pago = 0.0;
        double precio = darVehiculoActual( ).darPrecio( );
        // Calcula el impuesto seg�n el precio del veh�culo
        RangoImpuesto rango = buscarRangoImpuesto( precio );
        if( rango != null )
        {
            pago = precio * ( rango.darPorcentaje( ) / 100.0 );
        }
        // Aplica descuento por pronto pago
        if( pDescProntoPago )
        {
            pago -= pago * ( PORC_DESC_PRONTO_PAGO / 100 );
        }
        // Aplica descuento por ser un veh�culo de servicio p�blico
        if( pDescServicioPublico )
        {
            pago -= VALOR_DESC_SERVICIO_PUBLICO;
        }
        // Aplica descuento por cambio de ciudad del veh�culo
        if( pDescTrasladoCuenta )
        {
            pago -= pago * ( PORC_DESC_TRASLADO_CUENTA / 100 );
        }
        // Si por descuentos se va a n�mero negativo se deja en cero
        if( pago < 0 )
        {
            pago = 0;
        }
        return pago;
    }

    /**
     * Retorna el primer veh�culo. <br>
     * <b>post: </b> Se actualiz� la posici�n del veh�culo actual.
     * @return El primer veh�culo, que ahora es el veh�culo actual.
     * @throws Exception Si ya se encuentra en el primer veh�culo.
     */
    public Vehiculo darPrimero( ) throws Exception
    {
        if( posVehiculoActual == 0 )
        {
            throw new Exception( "Ya se encuentra en el primer veh�culo." );
        }
        posVehiculoActual = 0;
        return darVehiculoActual( );
    }

    /**
     * Retorna el veh�culo anterior al actual. <br>
     * <b>post: </b> Se actualiz� la posici�n del veh�culo actual.
     * @return El anterior veh�culo, que ahora es el veh�culo actual.
     * @throws Exception Si ya se encuentra en el primer veh�culo.
     */
    public Vehiculo darAnterior( ) throws Exception
    {
        if( posVehiculoActual == 0 )
        {
            throw new Exception( "Se encuentra en el primer veh�culo." );
        }
        posVehiculoActual--;
        return darVehiculoActual( );
    }

    /**
     * Retorna el veh�culo siguiente al actual. <br>
     * <b>post: </b> Se actualiz� la posici�n del veh�culo actual.
     * @return El siguiente veh�culo, que ahora es el veh�culo actual.
     * @throws Exception Si ya se encuentra en el �ltimo veh�culo
     */
    public Vehiculo darSiguiente( ) throws Exception
    {
        if( posVehiculoActual == vehiculos.length - 1 )
        {
            throw new Exception( "Se encuentra en el �ltimo veh�culo." );
        }
        posVehiculoActual++;
        return darVehiculoActual( );
    }

    /**
     * Retorna el �ltimo veh�culo. <br>
     * <b>post: </b> Se actualiz� la posici�n del veh�culo actual.
     * @return El �ltimo veh�culo, que ahora es el veh�culo actual.
     * @throws Exception Si ya se encuentra en el �ltimo veh�culo
     */
    public Vehiculo darUltimo( ) throws Exception
    {
        if( posVehiculoActual == vehiculos.length - 1 )
        {
            throw new Exception( "Ya se encuentra en el �ltimo veh�culo." );
        }
        posVehiculoActual = vehiculos.length - 1;
        return darVehiculoActual( );
    }

    /**
     * Retorna el veh�culo actual.
     * @return El veh�culo actual.
     */
    public Vehiculo darVehiculoActual( )
    {
        return vehiculos[ posVehiculoActual ];
    }

    /**
     * Busca el veh�culo m�s caro, lo asigna como actual y lo retorna.
     * @return El veh�culo m�s caro.
     */
    public Vehiculo buscarVehiculoMasCaro( )
    {
        Vehiculo masCaro = null;
        double valorVehiculo = 0;

        for( int i = 0; i < vehiculos.length; i++ )
        {
            Vehiculo vehiculo = vehiculos[ i ];
            if( vehiculo.darPrecio( ) > valorVehiculo )
            {
                masCaro = vehiculo;
                posVehiculoActual = i;
                valorVehiculo = vehiculo.darPrecio( );
            }
        }

        return masCaro;

    }

    /**
     * Busca y retorna el primer veh�culo que encuentra con la marca que llega por par�metro. <br>
     * <b>post: </b> Se asigna como veh�culo actual al veh�culo encontrado.
     * @param pMarca Marca buscada.
     * @return El primer veh�culo de la marca. Si no encuentra ninguno retorna null.
     */
    public Vehiculo buscarVehiculoPorMarca( String pMarca )
    {
        Vehiculo buscado = null;
        for( int i = 0; i < vehiculos.length && buscado == null; i++ )
        {
            Vehiculo vehiculo = vehiculos[ i ];
            if( vehiculo.darMarca( ).equalsIgnoreCase( pMarca ) )
            {
                buscado = vehiculo;
                posVehiculoActual = i;
            }
        }

        return buscado;
    }

    /**
     * Busca y retorna el veh�culo de la l�nea buscada. <br>
     * <b>post: </b> Se asigna como veh�culo actual al veh�culo encontrado.
     * @param pLinea L�nea buscada. pLinea != null && pLinea != ""
     * @return El veh�culo de la l�nea, null si no encuentra ninguno.
     */
    public Vehiculo buscarVehiculoPorLinea( String pLinea )
    {
        Vehiculo buscado = null;
        for( int i = 0; i < vehiculos.length && buscado == null; i++ )
        {
            Vehiculo vehiculo = vehiculos[ i ];

            if( vehiculo.darLinea( ).equalsIgnoreCase( pLinea ) )
            {
                buscado = vehiculo;
                posVehiculoActual = i;
            }
        }

        return buscado;
    }

    // ----------------------------------------------------------------
    // Puntos de Extensi�n
    // ----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1 del ejercicio.
     * @return Respuesta 1.
     */
    public String metodo1( String Marca, String Linea, String Modelo, String Valor, String RutaImagen) throws Exception
    {
        String _Marca, _Modelo, _Linea, _RutaImagen;
        Double _Valor;

        _Marca = Marca;
        _Linea = Linea;
        _Modelo = Modelo;
        _RutaImagen = RutaImagen;

        _Valor  = Double.parseDouble(Valor);

        AgregarVehiculoLista( "data/vehiculos.txt", _Marca, _Linea, _Modelo, _Valor, _RutaImagen);
        cargarVehiculos( "data/vehiculos.txt" );
        return "Mi respuesta 1 - AAM";
    }

    /**
     * M�todo para la extensi�n 2 del ejercicio.
     * @return Respuesta 2.
     */
    public String metodo2( )
    {
        return "Mi respuesta 2 - AAM";
    }


}