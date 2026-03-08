# Entrega - naranjoDylan

Entrega personal organizada con el estandar solicitado por la asignatura.

## Navegacion

- Codigo fuente: `src/<reto>/`
- Modelos UML: `modelosUML/`
- Documentacion: `docs/`
- Imagenes: `images/`

## Artefactos incluidos

- `src/reto003/reto003.java`: punto de entrada del reto 003.
- `src/reto003/Cine.java`, `src/reto003/Pelicula.java`, `src/reto003/Ticket.java`, `src/reto003/Visitante.java`: clases del dominio separadas por responsabilidad.
- `src/retoCCCF/retoCCCF.java`: simulacion de colas en supermercado (4 cajas).
- `modelosUML/cinemaDC.puml` y `modelosUML/cinemaDO.puml`: diagramas del dominio.
- `docs/reto003.md`: documentacion del sistema de cine.
- `docs/retoCCCF.md`: documentacion de la simulacion de supermercado.

## Ejecucion

Desde `entregas/naranjoDylan`:

```bash
cd src/reto003
javac *.java
java reto003

cd ../retoCCCF
javac retoCCCF.java
java retoCCCF
```

## Notas

- Se mejoro legibilidad del codigo con mejor nombrado, encapsulacion y menos duplicacion.
- Se corrigio un error funcional en `retoCCCF.java` en la gestion de la caja 3.
- Se aplico estructura de una clase por archivo en el reto 003.
