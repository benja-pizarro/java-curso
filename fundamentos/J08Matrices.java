package fundamentos;

/*
 * Matrices
 * 
 * Son arreglos multidimensionales, es decir tiene filas y columnas
 * Al igual que los arreglos, son de un tipo definido (int, char, double, etc) y
 * también de un largo preestablecido
 */

public class J08Matrices {
    public static void main(String[] args) {
        //Cómo definir una matriz
        int[][] matrizInt = new int[3][5];

        //Fila 0, Columna 0
        matrizInt[0][0] = 5;

        //Fila 0, Columna 1
        matrizInt[0][1] = 6;

        /*
            | 1 | 1 | 1 | 1 | 1 | 
            | 2 | 2 | 2 | 5 | 2 | 
            | 3 | 3 | 3 | 3 | 3 | 
        */
        System.out.println("Fila 0, Columna 0: " + matrizInt[0][0]);
        System.out.println("Fila 0, Columna 1: " + matrizInt[0][1]);

        System.out.println("Cantidad de filas: " + matrizInt.length);
        System.out.println("Cantidad de columnas: " + matrizInt[0].length);

        //Para recorrer una matriz, necesitaremos dos índices, es decir un ciclo anidado
        // Ciclo para asignar valores a la matriz
        for(int i = 0; i < matrizInt.length ; i++){
            for(int j = 0; j < matrizInt[i].length ; j++){
                matrizInt[i][j] = i+1;
            }
        }

        // Ciclo para ver los valores en una matriz
        for(int i = 0; i < matrizInt.length ; i++){
            for(int j = 0; j < matrizInt[i].length ; j++){
                System.out.print(matrizInt[i][j]);
            }
            System.out.println("");
        }
    }
}
