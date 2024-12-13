package com.brandonscs.conversormoneda.procesos;

import java.util.ArrayList;
import java.util.List;

public class HistorialConversiones {
    private List<Conversion> historial;

    public HistorialConversiones() {
        this.historial = new ArrayList<>();
    }

    public void agregarConversion(Conversion conversion) {
        historial.add(conversion);
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay conversiones en el historial.");
        } else {
            System.out.println("Historial de conversiones:");
            for (int i = 0; i < historial.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, historial.get(i).toString());
            }
        }
    }
}