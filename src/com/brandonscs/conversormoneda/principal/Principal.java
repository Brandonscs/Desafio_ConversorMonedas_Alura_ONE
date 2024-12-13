package com.brandonscs.conversormoneda.principal;

import com.brandonscs.conversormoneda.modelo.ConsultarCambioMoneda;
import com.brandonscs.conversormoneda.modelo.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        ConsultarCambioMoneda consulta = new ConsultarCambioMoneda();
        Moneda moneda = consulta.buscarCambioMoneda();
        System.out.println(moneda);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(moneda));
    }
}