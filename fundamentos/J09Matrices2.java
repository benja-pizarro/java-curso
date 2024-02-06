package fundamentos;

import java.util.Random;

public class J09Matrices2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrizInt = new int[5][5];
        int limiteRnd = 100; // Límite de random

        // Asignamos los valores a la matriz
        for(int i = 0; i < matrizInt.length ; i++){ // Fila
            for(int j = 0; j < matrizInt[i].length ; j++){ // Columnas
                matrizInt[i][j] = rnd.nextInt(limiteRnd); // Asignamos un valor random
            }
        }

        // Readablity
        // Detectar la cantidad de número mayores a 50 e imprimirlo
        int cantidadNumeroMayoresACincuenta = 0;

        for(int i = 0; i < matrizInt.length ; i++){ // Fila
            for(int j = 0; j < matrizInt[i].length ; j++){ // Columnas
                System.out.print(matrizInt[i][j] + " ");
                if(matrizInt[i][j] > 50){
                    cantidadNumeroMayoresACincuenta++;
                }
            }
            System.out.println("");
        }

        System.out.println("La cantidad de número mayores a 50 es: " + cantidadNumeroMayoresACincuenta);

        //Tarea de continuación
        // Guardar todos los números mayores a 50 (en un array), y mostrarlos ordenamente, de menor a mayor


        // int contadorFilas = 0;
        // while (contadorFilas < matrizInt.length) {
            
        //     int contadorColumnas = 0;
        //     while (contadorColumnas < matrizInt[contadorFilas].length) {
        //         System.out.print(matrizInt[contadorFilas][contadorColumnas] + " ");

        //         contadorColumnas++;
        //     }

        //     System.out.println("");

        //     contadorFilas++;
        // }
    }
}
