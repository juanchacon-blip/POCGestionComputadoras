# ESTEBAN
# POC Gestión Computadoras

Prueba de concepto (POC) en Java para la gestión de dispositivos electrónicos, enfocada en computadoras. La aplicación cuenta con una interfaz gráfica de escritorio (Swing) que permite registrar y listar computadoras, aplicando conceptos de programación orientada a objetos como herencia y polimorfismo.

## Descripción

El proyecto modela un dispositivo electrónico genérico (`DispositivoElectronico`) del cual hereda la clase `Computadora`, agregando atributos propios como memoria RAM y procesador. Cada tipo de dispositivo puede sobrescribir el cálculo de su valor actual (depreciación); en el caso de `Computadora`, el valor actual corresponde al 85% del precio original.

Los dispositivos registrados se almacenan en memoria a través de una capa de servicio (`ServicioDispositivo`), que permite agregarlos, listarlos, buscarlos por modelo y calcular la sumatoria total de sus valores.

## Características

- **Registro de computadoras**: formulario para ingresar código, marca, modelo, precio, fecha de fabricación, memoria RAM y procesador.
- **Listado de computadoras**: visualización en tabla de todas las computadoras registradas.
- **Cálculo de valor actual**: depreciación automática del 15% sobre el precio original.
- **Validaciones**: el precio no puede ser negativo (se lanza una excepción en caso contrario).

## Arquitectura del proyecto

```
POCGestionComputadoras/
├── pom.xml
└── src/main/java/com/cal/gestioncomputadoras/
    ├── GestionComputadoras.java        # Clase principal (punto de entrada)
    ├── gui/
    │   ├── GUIPrincipal.java           # Ventana principal / menú
    │   ├── GUIAddComputadora.java      # Formulario para agregar computadoras
    │   └── GUIListarComputadora.java   # Listado de computadoras registradas
    ├── model/
    │   ├── DispositivoElectronico.java # Clase abstracta base
    │   └── Computadora.java            # Clase que extiende DispositivoElectronico
    └── servicios/
        └── ServicioDispositivo.java    # Lógica de negocio (CRUD en memoria)
```

## Requisitos

- **Java 21** o superior (JDK)
- **Maven** 3.6+
- Dependencia: [Lombok](https://projectlombok.org/) 1.18.46

## Instalación y ejecución

1. Clonar o descomprimir el proyecto.
2. Compilar con Maven:

   ```bash
   mvn clean compile
   ```

3. Ejecutar la aplicación:

   ```bash
   mvn exec:java -Dexec.mainClass="com.cal.gestioncomputadoras.GestionComputadoras"
   ```

   Alternativamente, generar el `.jar` y ejecutarlo:

   ```bash
   mvn clean package
   java -cp target/GestionComputadoras-1.0-SNAPSHOT.jar com.cal.gestioncomputadoras.GestionComputadoras
   ```

## Uso

1. Al iniciar, se abre la ventana **Principal** con un menú de opciones.
2. Desde el menú se puede:
   - Abrir el formulario de **agregar computadora** e ingresar sus datos.
   - Abrir el **listado** para visualizar las computadoras registradas en una tabla.
3. La opción "Acerca de" muestra los autores del proyecto.

## Autores

- Juan Pablo Chacón Moreno
- Juan Esteban Molano Polanco
- Johan Daniel Esterling Hernández

## Licencia

Proyecto académico desarrollado con fines educativos (UNIBAGUE).
