package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
    private List<Tiquete> tiquetesSinUsar;
    private List<Tiquete> tiquetesUsados;

    public Cliente() {
        tiquetesSinUsar = new ArrayList<>();
        tiquetesUsados = new ArrayList<>();
    }

    public abstract String getTipoCliente();

    public abstract String getIdentificador();

    public void agregarTiquete(Tiquete tiquete) {
        tiquetesSinUsar.add(tiquete);
    }

    public int calcularValorTotalTiquetes() {
        int total = 0;
        for (Tiquete tiquete : tiquetesSinUsar) {
            total += tiquete.getTarifa();
        }
        return total;
    }

    public void usarTiquetes() {
        for (Tiquete tiquete : tiquetesSinUsar) {
            tiquete.marcarComoUsado();
            tiquetesUsados.add(tiquete);
        }
        tiquetesSinUsar.clear();
    }
}