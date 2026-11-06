# SW-AyLP-APE-04: Clases, Objetos y Métodos

**Universidad Técnica de Ambato**
Facultad de Ingeniería en Sistemas, Electrónica e Industrial
**Carrera:** Software | **Nivel:** Primero | **Asignatura:** Algoritmos y Lógica de Programación
**Ciclo académico:** Julio 2026 - Diciembre 2026

**Integrantes:** Alex Cabrera, Kevin Garces, Erick Cordonez, Cristian Gomez, Esteban Zambrano

## Objetivo

Desarrollar programas en Java utilizando clases, objetos y métodos, lo cual permite disminuir errores y reutilizar el código.

## Estructura del proyecto

Cada ejercicio está en su propia carpeta y cada clase en su propio archivo `.java`.

```
APE04/
├── ejercicio1/   Libro y Autor
│   ├── Autor.java
│   ├── Libro.java
│   └── Main.java
├── ejercicio2/   Rectángulo
│   ├── Rectangulo.java
│   └── Main.java
├── ejercicio3/   Producto y Venta
│   ├── Producto.java
│   ├── Venta.java
│   └── Main.java
├── ejercicio4/   Transferencias
│   ├── Cuenta.java
│   └── Main.java
└── ejercicio5/   Biblioteca
    ├── Usuario.java
    ├── Libro.java
    ├── Prestamo.java
    └── Main.java
```

## Descripción de los ejercicios

| N.º | Ejercicio | Concepto | Qué hace |
|---|---|---|---|
| 1 | Libro y Autor | Objeto como atributo | `Libro` tiene un atributo de tipo `Autor` y muestra título, año y nombre del autor. Se crean 2 libros. |
| 2 | Rectángulo | Firmas de métodos | `Rectangulo` calcula área y perímetro, indica si es cuadrado, devuelve una descripción y muestra todos los resultados. |
| 3 | Producto y Venta | Objeto como parámetro | `Venta.aplicar(Producto)` reduce el stock y muestra el total a pagar. Si no hay stock imprime "Stock insuficiente." |
| 4 | Transferencias | Objeto como parámetro | `Cuenta.transferir(Cuenta destino, double monto)` mueve dinero solo si hay fondos. Se prueba una transferencia válida y otra que falla. |
| 5 | Biblioteca | Colaboración entre clases | `Usuario`, `Libro` y `Prestamo` colaboran. Dos usuarios piden el mismo libro: el primero lo consigue y el segundo no. |

## Cómo compilar y ejecutar

Requisito: tener instalado el JDK de Java.

Desde la carpeta de cualquier ejercicio (por ejemplo `ejercicio1`):

```bash
cd ejercicio1
javac *.java
java Main
```

Repite lo mismo cambiando `ejercicio1` por `ejercicio2`, `ejercicio3`, `ejercicio4` o `ejercicio5`.

> Nota: cada ejercicio tiene su propia clase `Main`, por eso se compilan por separado en su carpeta. En el ejercicio 1 y en el ejercicio 5 hay una clase `Libro` distinta en cada uno.

## Salida esperada

**Ejercicio 1**
```
Título: Cien años de soledad
Año: 1967
Autor: Gabriel García Márquez

Título: Huasipungo
Año: 1934
Autor: Jorge Icaza
```

**Ejercicio 2**
```
Rectángulo de 4.0 x 6.0
Área: 24.0
Perímetro: 20.0
¿Es cuadrado?: false

Rectángulo de 5.0 x 5.0
Área: 25.0
Perímetro: 20.0
¿Es cuadrado?: true
```

**Ejercicio 3**
```
Producto: Laptop | Precio: $650.0 | Stock: 5

--- Venta de 2 unidades ---
Venta realizada. Total a pagar: $1300.0
Producto: Laptop | Precio: $650.0 | Stock: 3

--- Venta de 10 unidades ---
Stock insuficiente.
Producto: Laptop | Precio: $650.0 | Stock: 3
```

**Ejercicio 4**
```
--- Saldos iniciales ---
Titular: Ana | Saldo: $500.0
Titular: Luis | Saldo: $100.0

--- Transferencia válida ---
Transferencia exitosa de $200.0 de Ana a Luis
Titular: Ana | Saldo: $300.0
Titular: Luis | Saldo: $300.0

--- Transferencia que falla ---
Transferencia fallida: fondos insuficientes en la cuenta de Ana
Titular: Ana | Saldo: $300.0
Titular: Luis | Saldo: $300.0
```

**Ejercicio 5**
```
Préstamo exitoso: María Pérez (C.I. 1801234567) se llevó "Don Quijote de la Mancha".
No se pudo prestar: "Don Quijote de la Mancha" ya está prestado. Usuario: Carlos Gómez.
```
