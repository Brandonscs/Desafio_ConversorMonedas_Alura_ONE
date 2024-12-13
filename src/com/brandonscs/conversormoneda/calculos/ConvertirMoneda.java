package com.brandonscs.conversormoneda.calculos;

import com.brandonscs.conversormoneda.modelo.ConsultarCambioMoneda;
import com.brandonscs.conversormoneda.modelo.Moneda;

public class ConvertirMoneda {
    public double cambiarMoneda() {
        double valorMoneda = 1000;
        double tasaDeCambio;
        ConsultarCambioMoneda consulta = new ConsultarCambioMoneda();
        Moneda moneda = consulta.buscarCambioMoneda();

        tasaDeCambio = Double.valueOf(moneda.conversion_rates().get("AED"));
        System.out.println(tasaDeCambio + " x " + valorMoneda + " = " + valorMoneda * tasaDeCambio);
        return valorMoneda * tasaDeCambio;
    }
}
