# Reto 003 - Sistema de Cine

Sistema de gestion de cartelera y venta de tickets para cine.

## Estructura del dominio

El sistema modela 4 entidades principales, cada una en su archivo:

- **`Cine.java`**: Gestiona cartelera y venta de tickets
- **`Pelicula.java`**: Representa peliculas con seleccion aleatoria
- **`Ticket.java`**: Modelo de ticket con estados
- **`Visitante.java`**: Representa clientes del cine

## Responsabilidades

- `Cine`: Mantiene cartelera, muestra informacion y vende tickets
- `Pelicula`: Almacena datos de pelicula y proporciona seleccion aleatoria
- `Ticket`: Registra compra con estado modificable
- `Visitante`: Identifica al comprador

## Mejoras aplicadas

- Encapsulacion con getters en lugar de atributos publicos
- Estado inicial del ticket ("Emitido") definido en constructor
- Validacion de entrada en seleccion aleatoria
- Separacion de clases en archivos independientes

## Diagramas UML

- Diagrama de clases: `modelosUML/cinemaDC.puml`
- Diagrama de objetos: `modelosUML/cinemaDO.puml`

## Ejecucion

```bash
javac *.java
java reto003
```
