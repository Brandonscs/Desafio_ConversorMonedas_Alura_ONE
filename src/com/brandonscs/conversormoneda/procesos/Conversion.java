package com.brandonscs.conversormoneda.procesos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversion {
    private String monedaBase;
    private String cambioMoneda;
    private double valorOriginal;
    private double valorConvertido;
    private LocalDateTime fechaHora;

    public Conversion(String monedaBase, String cambioMoneda, double valorOriginal, double valorConvertido) {
        this.monedaBase = monedaBase;
        this.cambioMoneda = cambioMoneda;
        this.valorOriginal = valorOriginal;
        this.valorConvertido = valorConvertido;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fechaHora.format(formatter);

        return String.format("[%s] De %.2f [%s] a %.2f [%s]",
                fechaFormateada, valorOriginal, monedaBase, valorConvertido, cambioMoneda);
    }
}