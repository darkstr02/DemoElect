package com.elecciones.francisco.eleccionesdemo;

/**
 * Created by Francisco on 17/08/2016.
 */
public class PuntosCasillas {
    private String id;
    private String nombre_casilla;
    private String domicilio;
    private int lat;
    private int longi;

    public String getId() {
        return this.id;
    }

    public String getNombre_casilla()
    {
        return this.nombre_casilla;
    }

    public String getDomicilio()
    {
        return this.domicilio;
    }

    public int getLat()
    {
        return this.lat;
    }

    public int getLongi()
    {
        return this.longi;
    }
}
