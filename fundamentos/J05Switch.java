package fundamentos;

import java.util.Scanner;

public class J05Switch {
    public static void main(String[] args) {
        /* 
            Switch se utilizan para evaluar condiciones de acuerdo a un 
            valor propociando, la comparación debe ser del mismo tipo de dato

            El Switch se utilizan principalmente para menús de programas
        */
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("Ingrese un valor: ");
        num1 = scanner.nextInt();

        switch(num1){
            case 10:
                System.out.println("El valor es igual a " + num1);
                break;
            case 15:
                System.out.println("El valor es igual a 15");
                break;
            case 20:
                System.out.println("El valor es igual a 20");
                break;
            default:
                System.out.println("El valor no está definido");
                break;
        }

        scanner.close();

    }
}
