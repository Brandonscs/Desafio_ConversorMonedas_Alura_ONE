package com.brandonscs.conversormoneda.procesos;

import com.brandonscs.conversormoneda.modelo.ConsultarCambioMoneda;
import com.brandonscs.conversormoneda.modelo.Moneda;

public class ConvertirMoneda {
    public double cambiarMoneda(String monedaBase, String cambioMoneda, double valorMoneda) {
        double tasaDeCambio;
        ConsultarCambioMoneda consulta = new ConsultarCambioMoneda();
        Moneda moneda = consulta.buscarCambioMoneda(monedaBase);

        tasaDeCambio = Double.valueOf(moneda.conversion_rates().get(cambioMoneda));
        return valorMoneda * tasaDeCambio;
    }
}