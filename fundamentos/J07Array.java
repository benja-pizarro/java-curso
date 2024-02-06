package fundamentos;

import java.util.Scanner;

public class J07Array {
    /*
        Un Array, Arreglo o Vector, es una estructura de datos dentro de Java, en cual
        se puede almacenar multiples datos correspondientes a un tipo específico, 
        es decir, int, char, boolean, double, float... etc.
        - Se almacenan de acuerdo un índice que es de tipo numérico
        - No se pueden cambiar de tipo
        - De definen con un largo específico inmutable
        - Los índices siempre comienzan la posición 0
    */    
    public static void main(String args[]){
      //  int array1[] = new int[5];
        // int[] array2 = new int[5]; Otra manera de declarar un arreglo

      //  array1[0] = 10;
      //  array1[1] = 15;
      //  array1[2] = 20;

     //   System.out.println("Valor índice 1: " + array1[1]);

        //Array tiene la propieda de obtener el largo total
     //   int largoArray = array1.length;
     //   System.out.println("Largo total array: " + largoArray);

        // Imprimir el arreglo completo
     //   for(int i = 0; i < array1.length; i++){
    //      System.out.println("Índice " + i + " contiene valor: " + array1[i]);
        

        //Pedir al usuario que ingrese 7 caracteres
        Scanner sc = new Scanner(System.in);
        char[] nombre = new char[7];
        int indice = 0;
        
        while (indice < nombre.length) {
            System.out.print("Ingrese una letra: ");
            nombre[indice] = sc.nextLine().charAt(0);
            indice++;
        }

        System.out.print("El nombre ingresado es: ");
        for(indice = 0;indice < nombre.length; indice++){
            System.out.print(nombre[indice]);
        }
        sc.close();



    }
}