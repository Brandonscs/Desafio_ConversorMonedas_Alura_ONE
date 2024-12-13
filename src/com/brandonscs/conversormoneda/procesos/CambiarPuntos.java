package com.brandonscs.conversormoneda.procesos;

public class CambiarPuntos {
    public Double cambiarPuntos(String texto) {
        double valorMoneda = 0;
        try {
            valorMoneda = Double.parseDouble(texto.replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("No se pudo transformar el numero " + e);
        }
        return valorMoneda;
    }
}