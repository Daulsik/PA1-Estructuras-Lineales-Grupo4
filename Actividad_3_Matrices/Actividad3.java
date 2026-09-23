public class Actividad3 {
    public static void main(String[] args) {

        // 1. Esta parte es de Declaración e inicialización de la matriz (4 filas x 5 columnas)
        int[][] ocupacion = {
                {25, 30, 15, 20, 10}, // Aula 0
                {18, 22, 28, 12,  5}, // Aula 1
                {35, 40, 38, 25, 18}, // Aula 2
                {10, 15, 12, 30, 22}  // Aula 3
        };

        int filas = ocupacion.length;
        int columnas = ocupacion[0].length;

        System.out.println("--- TOTAL DE ESTUDIANTES POR AULA ---");
        // 2. Algoritmo para calcular total por aula (Para sumar las filas)
        for (int i = 0; i < filas; i++) {
            int sumaAula = 0;
            for (int j = 0; j < columnas; j++) {
                sumaAula += ocupacion[i][j];
            }
            System.out.println("Aula [" + i + "]: " + sumaAula + " estudiantes.");
        }

        System.out.println("\n--- TOTAL DE ESTUDIANTES POR HORARIO ---");
        // 3. Algoritmo para calcular total por horario (Para sumar las  columnas)
        for (int j = 0; j < columnas; j++) {
            int sumaHorario = 0;
            for (int i = 0; i < filas; i++) {
                sumaHorario += ocupacion[i][j];
            }
            System.out.println("Horario [" + j + "]: " + sumaHorario + " estudiantes.");
        }

        System.out.println("\n--- CELDA CON MAYOR OCUPACIÓN ---");
        // 4. Identificamos la celda con mayor ocupación
        int maxEstudiantes = ocupacion[0][0];
        int aulaMax = 0;
        int horarioMax = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (ocupacion[i][j] > maxEstudiantes) {
                    maxEstudiantes = ocupacion[i][j];
                    aulaMax = i;
                    horarioMax = j;
                }
            }
        }
        System.out.println("Mayor ocupación: " + maxEstudiantes + " estudiantes.");
        System.out.println("Ubicación -> Aula [" + aulaMax + "], Horario [" + horarioMax + "]");
    }
}
