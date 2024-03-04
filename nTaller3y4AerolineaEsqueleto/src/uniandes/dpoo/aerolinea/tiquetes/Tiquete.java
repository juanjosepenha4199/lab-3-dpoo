package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelos;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
    private Cliente cliente;
    private Vuelos vuelo;
    private String codigo;
    private int tarifa;
    private boolean usado;

    public Tiquete(String codigo, Vuelos vuelo, Cliente cliente, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.cliente = cliente;
        this.tarifa = tarifa;
    }

    public Cliente getCliente() { return cliente; }
    public Vuelos getVuelo() { return vuelo; }
    public String getCodigo() { return codigo; }
    public int getTarifa() { return tarifa; }
    
    public void marcarComoUsado() { usado = true; }
    public boolean esUsado() { return usado; }
}