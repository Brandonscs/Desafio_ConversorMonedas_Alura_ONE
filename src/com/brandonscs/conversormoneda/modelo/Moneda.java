package com.brandonscs.conversormoneda.modelo;

import java.util.Map;

public record Moneda(Map<String, Double> conversion_rates) {
}
