public class Actividad3 {
    public static void main(String[] args) {
        
        // 1. Declaración e inicialización de la matriz (4x5) creada por [Huamancha Jossimar]
        int[][] ocupacion = {
            {25, 30, 15, 20, 10}, // Aula 0
            {18, 22, 28, 12,  5}, // Aula 1
            {35, 40, 38, 25, 18}, // Aula 2
            {10, 15, 12, 30, 22}  // Aula 3
        };

        int filas = ocupacion.length;    
        int columnas = ocupacion[0].length; 

        System.out.println("--- TOTAL DE ESTUDIANTES POR AULA ---");
        // 2. Algoritmo para calcular total por aula (Sumar filas)
        for (int i = 0; i < filas; i++) {
            int sumaAula = 0;
            for (int j = 0; j < columnas; j++) {
                sumaAula += ocupacion[i][j];
            }
            System.out.println("Aula [" + i + "]: " + sumaAula + " estudiantes.");
        }
        
        // --- AQUÍ EMPEZARÁ EL CÓDIGO DE MI COMPAÑERO ---
    }
}
