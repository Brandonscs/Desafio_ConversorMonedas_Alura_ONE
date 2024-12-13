package com.brandonscs.conversormoneda.principal;

import com.brandonscs.conversormoneda.calculos.ConvertirMoneda;
import com.brandonscs.conversormoneda.modelo.ConsultarCambioMoneda;
import com.brandonscs.conversormoneda.modelo.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        ConvertirMoneda cambioMoneda = new ConvertirMoneda();
        double nuevoValor = cambioMoneda.cambiarMoneda();
        System.out.println(nuevoValor);

    }
}