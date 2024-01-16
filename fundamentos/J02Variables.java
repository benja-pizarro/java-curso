package fundamentos;
import java.util.Scanner;

public class J02Variables {

    // Diferentes tipo de variables de acuerdo al tipo de datos
    // Caracteres
    // Cadena de caracteres
    // Número
    // Verdadero y falso
    // Flotantes
    // Doble

    // Siempre que se nombra una variable, debe tener un nombre asociado a su uso

    // Uso de scanner
    /*
    Consume the newline character left in the buffer
        scanner.nextLine();
     */

    public static void main(String[] args){
        // Variables primitivas
        // Tipo - nombre = valor
        char caracter = 'b';
        int entero = 500; // Número negativos y positivos
        boolean verdadero = true;

        int edad; // Reservo un espacio de memoria

        System.out.println("Caracter: " + caracter);
        System.out.println("Entero: " + entero);
        System.out.println("Verdadero?: " + verdadero);

        edad = 17;
        System.out.println("Cuál es la edad: " + edad);

        // Variables primitivas flotantes
        double varibleDouble = 10.3222;
        float variableFloat = 3.3222f;

        System.out.println("Contenido variable double: " + varibleDouble);
        System.out.println("Contenido variable float: " + variableFloat);

        // Variable no primitiva
        String nombre;
        nombre = "Benjamín Pizarro Gálvez";
        System.out.println("Mi nombre es: " + nombre);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nuevo nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Qué guarda nombre al final: " + nombre);

        scanner.close();
    }

}