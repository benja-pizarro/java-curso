package fundamentos;

import java.util.Scanner;

public class J04Condicionales {
    /*
        Condicionales:
        Si es que se cumplen ciertas condiciones para realizar cierto, proceso, operación siguiente
        <, >, ==, !=
        Incluyente (y): &&
        Excluyente (o): ||
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorIngresadoUsuario;
        int valorAComparar = 10;

        System.out.print("Ingrese un valor a comparar: ");
        valorIngresadoUsuario = scanner.nextInt();

        // Igual a
        if(valorAComparar == valorIngresadoUsuario){
            System.out.println("Valor es igual " + valorAComparar);
        }
        
        // Distinto de
        if(valorAComparar != valorIngresadoUsuario){
            System.out.println("Valor es diferente " + valorAComparar);
        };

        // Para resolver el salto de línea automático de scanner
        // scanner.nextLine();

        // Else
        String password = "benjamin";
        String passwordConfirmacion = "benjamin";

        if(password == passwordConfirmacion){
            System.out.println("La contraseña ha sido creada correctamente");
        }else{
            System.out.println("Las contraseñas ingresadas no son iguales");
        }

        // Else if
        int num1 = 100;
        int num2 = 101;
        int resultado = num1 + num2;

        if(resultado > 10 && resultado <= 100){
            System.out.println("Resultado mayor a 10");
        }else if(resultado > 100 && resultado <= 200){
            System.out.println("Resultado mayor a 100");
        }else if(resultado > 200){
            System.out.println("Resultado mayor a 200");
        }else{
            System.out.println("Resultado es menor a 10");
        }

        // If obtiene sólo si es veradero o falso, es decir sólo si se cumple una condición
        boolean condicion = true;
        if(condicion){
            System.out.println("La condición es verdadera");
        }else{
            System.out.println("La condición es falsa");
        }

        int num3=5, num4=10, numUsuario;
        System.out.print("Ingrese un número: ");
        numUsuario = scanner.nextInt();

        // Condición incluyente "y"
        if(numUsuario > num3 && numUsuario < num4){
            System.out.println(numUsuario + " es mayor a " + num3 + " y menor que " + num4);
        
        // Excluyente
        }else if(numUsuario == num3 || numUsuario == num4){
            System.out.println(numUsuario + " es igual a " + num3 + " o igual a " + num4);
        }else{
            System.out.println(numUsuario + " número fuera de rango entre " + num3 + " y " + num4);
        }

        // Condición almacenada en una variable boleana
        boolean dentroDeRango = numUsuario > num3 && numUsuario < num4;
        boolean numeroIgual =  numUsuario == num3 || numUsuario == num4;

        if(dentroDeRango){
            System.out.println(numUsuario + " es mayor a " + num3 + " y menor que " + num4);
        }else if(numeroIgual){
            System.out.println(numUsuario + " es igual a " + num3 + " o igual a " + num4);
        }else{
            System.out.println(numUsuario + " número fuera de rango entre " + num3 + " y " + num4);
        }

        scanner.close();
    }
}
