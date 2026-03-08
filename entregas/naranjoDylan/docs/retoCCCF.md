# Reto CCCF - Simulacion de Supermercado

Simulacion de colas en supermercado con 4 cajas durante 720 minutos.

## Modelo de simulacion

- **Duracion**: 720 minutos
- **Cajas**: 4 cajas simultaneas
- **Probabilidad de llegada**: 40% por minuto
- **Paquetes por persona**: Entre 5 y 15 (aleatorio)

## Logica centralizada (DRY)

En lugar de repetir codigo para cada caja, se utiliza un bucle que gestiona todas las cajas con la misma logica:

```java
for (int indiceCaja = 0; indiceCaja < TOTAL_CAJAS; indiceCaja++) {
    // Logica compartida para asignar y procesar
}
```

## Correccion de bug

**Version anterior**: La caja 3 restaba de `supermarket_checkout1` en lugar de `supermarket_checkout3`

**Version actual**: Todas las cajas usan su propio contador correctamente mediante el arreglo `cajas[]`

## Constantes definidas

- `TOTAL_MINUTOS = 720`
- `TOTAL_CAJAS = 4`
- `PROB_LLEGADA = 0.4`
- `MIN_PAQUETES = 5`
- `MAX_PAQUETES = 15`

## Mejoras de legibilidad

- Nombres de variables en español y descriptivos
- Funciones auxiliares (`generarPaquetes`, `imprimirEstadoColaYCajas`, `imprimirResumen`)
- Eliminacion de duplicacion en logica de cajas

## Ejecucion

```bash
javac retoCCCF.java
java retoCCCF
```
