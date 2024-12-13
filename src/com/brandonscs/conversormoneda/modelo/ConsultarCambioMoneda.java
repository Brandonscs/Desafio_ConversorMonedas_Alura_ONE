package com.brandonscs.conversormoneda.modelo;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambioMoneda {

    public Moneda buscarCambioMoneda(String monedaBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6e5e6d9c17778e10c89998b1/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontrdo cambio de moneda: " + e.getMessage());
        }
    }
}