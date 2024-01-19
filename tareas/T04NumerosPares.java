package tareas;

import java.util.Scanner;

public class T04NumerosPares {
    /* 
        Determinar si un número es par o impar
        El programa debe imprimir si el numero ingresado
        es Par o Impar.

        Condicion
        - No se aceptan número negativos

        Número pares son divisible por 2
        14 / 2 = 7
        No tienen resto, siempre será resto = 0
    */

    public static void main(String[] args) {
        double num1;
        double resultadoDouble;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber si es par o impar: ");
        num1 = scanner.nextDouble();
        if(num1 < 0){
                System.out.println("El numero ingresado es invalido");
            }

        resultadoDouble = num1%2;
        if(resultadoDouble == 0){
            System.out.println("Su numero es par");
        }else if(resultadoDouble > 0){
            System.out.println("Su numero es impar");
        }

        scanner.close();
    }
}
