# README — Evaluación PA1: Estructuras Lineales Estáticas

> **Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial
> **Código:** 30710
> **Evaluación:** PA1
> **Equipo:** 4

## 1. Integrantes

| Integrante | Rol | Aporte principal |
|---|---|---|
| [Huamancha Perez Jose Jossimar] | Integrador / Desarrollador | Actividad 3 (Matrices) y gestión del repositorio. |
| [Paco Becerra Juan Steve] | Desarrollador | Actividad 2 (Vectores - Búsqueda e Inserción). |
| [Nombre Compañero 3] | Desarrollador | Actividad 2 (Vectores - Ordenamiento) y Actividad 4. |
| [Mucho Mamani Richard] | Analista / Documentador | Actividad 1 (Análisis teórico) y revisión general. |
| [Nombre Compañero 5] | Analista / Documentador | Actividad 1 (Análisis teórico) y revisión general. |


## 2. Descripción y objetivo

**Problema:**  
El proyecto aborda la necesidad de una coordinación académica de organizar la información de sus talleres estudiantiles utilizando únicamente estructuras lineales estáticas.

**Objetivo:**  
Registrar cantidades de inscritos, ordenar resultados, realizar consultas y representar la distribución de estudiantes por aulas y horarios mediante algoritmos eficientes.

**Solución desarrollada:**  
Se implementaron soluciones modulares en [Lenguaje de programación, ej. Java o Python], utilizando arreglos unidimensionales para la gestión de inscritos y matrices de 4x5 para la ocupación de aulas.

## 3. Cómo ejecutar o revisar

```bash```
# Comandos para ejecutar los scripts (Ejemplo si usan Java o Python)
javac Actividad2.java
java Actividad2


Pasos de revisión:

Abrir la carpeta de cada Actividad (1 al 4) para revisar el código o pseudocódigo correspondiente.

Los diagramas y representaciones gráficas se encuentran adjuntos en formato [PDF/PNG] dentro de cada carpeta.

No publicar contraseñas, tokens, credenciales ni datos sensibles.


## 4. Evidencias

-- Sección para adjuntar capturas de pantalla de la consola mostrando:

###   ACTIVIDAD 3:
[Captura 1: Resultado del vector ordenado y valores mayor/menor]

[Captura 2: Resultado de la suma de filas/columnas en la matriz]


## Desarrollo del Examen

### Actividad 1: Análisis del problema
[Aquí el compañero 4 pega su texto explicando la teoría...]

### Actividad 2: Modelado y operaciones con vectores 

La solución fue desarrollada en Java, empleando arreglos unidimensionales estáticos. Se diseñaron tres algoritmos fundamentales integrados en un solo flujo de ejecución: búsqueda secuencial para los valores extremos, redimensionamiento manual mediante copiado de arreglos para la inserción de un nuevo dato, y el método de Bubble Sort para organizar la cantidad de inscritos de menor a mayor.


1. Representación gráfica del vector:
El arreglo inicial contiene la cantidad de inscritos por taller. En Java, los índices comienzan en la posición 0.


| Índice | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| **Valor (Inscritos)** | 28 | 15 | 34 | 21 | 19 | 40 | 12 | 26 |


2. Codigo:

```
import java.util.Arrays;

public class problema2 {

    public static void main(String[] args) {
        int[] inscritos = {28,15,34,21,19,40,12,26};
    
    // --- ALGORITMO 1  (MAYOR Y MENOR)    

        int mayor = inscritos[0];
        int menor = inscritos[0];

        for (int i = 1; i < inscritos.length; i++) {
            if (inscritos[i] > mayor) {
                mayor = inscritos[i];
            }
            if (inscritos[i] < menor) {
                menor = inscritos[i];
            }
        }
        
        System.out.println("El taller con mayor inscritos tiene: " + mayor);
        System.out.println("El taller con menor inscritos tiene: " + menor);

    // --- ALGORITMO 2 (INSERTAR NUEVO VALOR )

        int nuevoValor = 50; 
        int posicion = 3;    
        
        int[] nuevoArreglo = new int[inscritos.length + 1];
        int j = 0; 
        
        for (int i = 0; i < nuevoArreglo.length; i++) {
            if (i == posicion) {
                nuevoArreglo[i] = nuevoValor;
            } else {
                nuevoArreglo[i] = inscritos[j];
                j++; 
            }
        }
        
        System.out.println("Vector original: " + Arrays.toString(inscritos));
        System.out.println("Vector final:    " + Arrays.toString(nuevoArreglo));

    // --- ALGORITMO 3 (ORDENAR DE MENOR A MAYOR)
        
        int comparaciones = 0;

        for(int i=0;i<inscritos.length-1;i++){
            for(int l = 0 ; l<inscritos.length-1;l++){
                comparaciones++;
                if(inscritos[l]>inscritos[l+1]){
                    int temp= inscritos[l];
                    inscritos[l]=inscritos[l+1];
                    inscritos[l+1]=temp;
                }
            }
            System.out.println("pasada"+ (i+1)+":"+Arrays.toString(inscritos));

        }
        System.out.println("final:"+Arrays.toString(inscritos));
        System.err.println("comparaciones: "+ comparaciones);

        
    }
    
    
}


    
```


3. Explicación de la lógica:


Algoritmo 1 (Mayor y Menor): Inicializamos dos variables asumiendo que el primer elemento es el mayor y el menor. Recorremos el arreglo comparando el valor actual con nuestras variables, reemplazándolas si encontramos un nuevo extremo. Costo: Lineal $O(n)$.


Algoritmo 2 (Inserción en posición): Como los arreglos estáticos en Java no pueden crecer, creamos un nuevoArreglo con tamaño n+1. Usamos un ciclo para copiar los datos del original, y cuando el índice coincide con la posición indicada (3), insertamos el nuevo valor (50).

Algoritmo 3 (Ordenamiento Burbuja / Bubble Sort): Utilizamos dos ciclos for anidados que comparan pares adyacentes y los intercambian si el de la izquierda es mayor, empujando los más grandes al final en cada "pasada".

Costo del Algoritmo 3:

Mayor costo -> $O(n^2)$: Ocurre cuando el arreglo está ordenado al revés. El algoritmo hace todas las comparaciones posibles (49 iteraciones) y el máximo número de intercambios.


### Actividad 3: Matrices
[Aquí tú pegas tu código de matrices y explicas la lógica...]

### Actividad 4: Matrices Especiales

4.1 Matriz cuadrada  

Una matriz cuadrada es aquella que tiene el mismo número de filas que de columnas. 

Ejemplo: 
Matriz cuadrada 3 x 3  

    [  1   4   2  ]
    [  0   5   8  ]
    [  3   9   6  ]
3 fílas y 3 columnas. 



4.2 Matriz poco densa 

Conocida también como matriz dispersa, es una matriz en la cual la gran mayoría de sus 
elementos son cero y solo unos pocos elementos tienen valores diferentes de cero. 

Ejemplo: 
Matriz poco densa 4 x 4 

    [  0   0   0   5  ]
    [  0   2   0   0  ]
    [  0   0   0   0  ]
    [  8   0   0   0  ]
De los 16 elementos de esta matriz, solo 3 son distintos de cero. Por eso se considera una 
matriz poco densa. 

Diferencia entre ambas: 

Matriz cuadrada: se define por su forma >  mismo número de filas y columnas. 

Matriz poco densa: se define por la cantidad de ceros > la mayoría de sus elementos son 
cero.

Ejemplo: Registro de Asistencia Semanal de un Colegio

Un colegio con 1,000 alumnos. Necesitan registrar las faltas de asistencia durante un año escolar de 200 días.

Si el alumno asistió a clase, se registra un 0.

Si el alumno faltó, se registra un 1.

                  Día 1   Día 2   Día 3  ...  Día 200
    Alumno 1    [   0       0       0    ...    0   ]
    Alumno 2    [   0       1       0    ...    0   ]  < Faltó el Día 2
       ...      [  ...     ...     ...   ...   ...  ]
    Alumno 1000 [   0       0       0    ...    0   ]

Justificación:
En un sistema de asistencia para 1,000 alumnos durante 200 días (200,000 registros potenciales), se asume una asistencia regular donde solo ocurren 500 faltas reales en todo el año (la matriz está compuesta en un 99.75% por ceros).

-Matriz Completa: Obliga a reservar espacio estático en RAM para las 200,000 casillas. La inmensa mayoría del espacio almacenará información redundante (asistencias/ceros).

-Matriz Poco Densa: Almacena únicamente los 500 eventos reales (las faltas) mediante su ubicación (alumno, día). Esto reduce el consumo de memoria en más del 99%, evitando el desperdicio de recursos.


## 5. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia |
|------------|------------|---------|---------------|------------|-----------|
| Huamancha Perez Jose Jossimar   | Alta | Media | Alta | Sí | Commits en Actividad 3 y README |
| Juan Steve Paco Becerra | Alta | Alta | Alta | Sí | Commits en Actividad 2 , README Y subir material a youtube|
| [Nombre 3] | Alta | Alta | Media | Sí | Commits en Actividad 2 |
| [Mucho Mamani Richard] | Alta | Media | Media | Sí | Commits en Actividad 2 |
| [Nombre 5] | Alta | Alta | Media | Sí | Commits en Actividad 2 |

## 6. Video de exposición

Video público de YouTube: [PEGAR AQUÍ EL ENLACE DEL VIDEO NO LISTADO]

Nota: Todos los integrantes participan explicando el procedimiento y las decisiones técnicas con las cámaras prendidas.

## 7. Conclusiones

- El uso de estructuras estáticas como arreglos y matrices resulta eficiente cuando se conoce de antemano el tamaño de los datos a procesar, como los bloques horarios o aulas fijas.
- El algoritmo de ordenamiento aplicado Bubble Sort presenta una complejidad temporal cuadrática O(n²). Aunque resulta funcional e intuitivo para volúmenes pequeños de datos como los de este caso, pierde eficiencia rápidamente si la lista crece, ya que el número de comparaciones aumenta de forma drástica.
- [Conclusión sobre por qué una matriz poco densa optimiza memoria frente a una completa en el caso académico].



**Última actualización:** [DD/MM/AAAA]


---




