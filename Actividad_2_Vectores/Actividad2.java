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


    
