package tareas;

import java.util.Scanner;

/* 
    Realizar un programa que permita al usuario ingresar 7 notas
    y una vez ingresadas, calcular el promedio de estas
    - Imprimir por pantalla un mensaje con cada nota a pedir, 
        "ingresar nota 1: "
        "ingresar nota 2: "
        "ingresar nota 3: "
    - Imprimir, "el promedio de notas es: "
*/
public class T05ObtenerPromedio {
    public static void main(String[] args) {
        
        double[] nota = new double[7];
        int indice = 0;
        double resultadoSuma;
        double promedio;
        Scanner Scanner = new Scanner(System.in);

        while(indice < nota.length){
            System.out.print("Ingrese una nota: ");
            nota[indice] = Scanner.nextDouble();
            indice++;
        }
        resultadoSuma = nota[0] + nota[1] + nota[2] + nota[3] + nota[4] + nota[5] + nota[6];
        promedio = resultadoSuma/nota.length;
        System.out.print("resultado del promedio:" + promedio);

        }
    }
