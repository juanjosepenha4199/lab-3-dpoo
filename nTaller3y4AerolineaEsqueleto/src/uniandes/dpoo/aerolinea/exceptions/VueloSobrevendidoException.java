package uniandes.dpoo.aerolinea.exceptions;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

/**
 * Esta clase se usa para anunciar que se intentó vender un tiquete para un vuelo que ya está lleno
 */
@SuppressWarnings("serial")
public class VueloSobrevendidoException extends Exception
{

    public VueloSobrevendidoException( String string )
    {
        super( "El vuelo " + string.getRuta( ).getCodigoRuta( ) + " del " + string.getFecha( ) + " no tiene cupo" );
    }

}
