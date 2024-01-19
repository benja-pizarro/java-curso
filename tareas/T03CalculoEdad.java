package tareas;

import java.util.Scanner;

public class T03CalculoEdad {
    /*
    Pedir al usuario el año en que nació y el año actual, 
    para calcular la edad que tiene.

    Determinar si el usuario es mayor edad, es decir, si es mayor
    o igual 18 años.
    Condiciones:
    - No se aceptan edades negativas, ej: -2 años
    - No se aceptan edades superiores a 100
    En el caso que no se cumplan las condiciones, el programa
    debe mostrar un mensaje.

    Imprimir la edad del usuario y si es mayor de edad

    Observaciones de revisión:
    - Siempre utiliza minúculas como letra inicial de una variable
        ej: annoNacimiento
    - Por un tema de formato, utiliza la función print en vez de println 
    */

    public static void main(String[] args) {
        int AmoNacimiento;
        int AmoActual;
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año de su nacimiento: ");
        AmoNacimiento = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        AmoActual = scanner.nextInt();
        edad = AmoActual - AmoNacimiento;
        if(edad < 18 && edad > 0){
            System.out.println("Usted tiene " + edad + " y es menor de edad");
        }else if(edad >= 18 && edad < 100){
            System.out.println("Usted tiene " + edad + " y es mayor de edad");
        }else if(edad > 100 || edad < 0){
            System.out.println("Los valores ingresados son invalidos");
        }

        scanner.close();
    }
}
