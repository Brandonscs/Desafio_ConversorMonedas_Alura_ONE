package com.brandonscs.conversormoneda.principal;

import com.brandonscs.conversormoneda.procesos.CambiarPuntos;
import com.brandonscs.conversormoneda.procesos.ConvertirMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ConvertirMoneda convertirMoneda = new ConvertirMoneda();
        CambiarPuntos cambiarPuntos = new CambiarPuntos();
        int opcion;
        boolean validacion;
        boolean bucleActivo = true;
        String monedaBase = "";
        String cambioMoneda = "";
        String textoValor;
        double valorMoneda;
        double nuevoValor;
        String menu = """
                
                *******************************************
                Bienvenido al conversor de monedas
                
                Elija una opcion valida:
                
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                
                *******************************************
                """;

        while (bucleActivo) {
            System.out.println(menu);
            try {
                opcion = Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }
            validacion = true;

            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    cambioMoneda = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    cambioMoneda = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    cambioMoneda = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    cambioMoneda = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    cambioMoneda = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    cambioMoneda = "USD";
                    break;
                case 7:
                    System.out.println("Cerrando programa...");
                    bucleActivo = false;
                    validacion = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    validacion = false;
            }

            if (validacion) {
                System.out.println("Ingrese el valor a convertir:");
                textoValor = leer.next();
                valorMoneda = cambiarPuntos.cambiarPuntos(textoValor);
                nuevoValor = convertirMoneda.cambiarMoneda(monedaBase, cambioMoneda, valorMoneda);
                System.out.printf("El valor de %.2f [%s] corresponde a %.2f [%s]%n", valorMoneda, monedaBase, nuevoValor, cambioMoneda);
            }
        }
    }
}