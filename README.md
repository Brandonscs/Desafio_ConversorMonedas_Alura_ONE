# Conversor de Moneda

## Descripción
Este es un proyecto de consola en Java que permite convertir monedas. Utiliza la API de ExchangeRate para obtener tasas de cambio en tiempo real.

## Características
- Conversiones entre múltiples monedas
- Historial de conversiones

## Requisitos
- Java 17 o superior
- Conexión a Internet
- Librería Gson
- API key de ExchangeRate (incluida en el código)

## Instalación

### Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/conversor-moneda.git
cd conversor-moneda
```

### Dependencias
Asegúrate de tener las siguientes dependencias:
- Gson (puedes agregarlo via Maven o descargar el JAR)

## Uso
1. Ejecuta la aplicación
2. Selecciona una opción del menú:
3. Ingresa el valor a convertir
4. Visualiza el resultado de la conversión
5. Opcionalmente, puedes ver el historial de conversiones

## Estructura del Proyecto
```
src/
└── com/
    └── brandonscs/
        └── conversormoneda/
            ├── modelo/
            │   ├── ConsultarCambioMoneda.java
            │   └── Moneda.java
            ├── procesos/
            │   ├── CambiarPuntos.java
            │   ├── Conversion.java
            │   ├── ConvertirMoneda.java
            │   └── HistorialConversiones.java
            └── principal/
                └── Principal.java
```

## Notas Adicionales
- Las tasas de cambio se obtienen en tiempo real
- Se requiere conexión a Internet para las conversiones
- La precisión depende de la API de ExchangeRate
