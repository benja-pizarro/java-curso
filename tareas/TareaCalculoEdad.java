import java.util.Scanner;

public class TareaCalculoEdad{
    public static void main(String[] args) {
        int AmoNacimiento;
        int AmoActual;
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año de su nacimiento");
        AmoNacimiento = scanner.nextInt();
        System.out.println("Ingrese el año actual");
        AmoActual = scanner.nextInt();
        edad = AmoActual - AmoNacimiento;
        if(edad < 18 && edad > 0){
            System.out.println("Usted tiene " + edad + " y es menor de edad");
        }else if(edad >= 18 && edad < 100){
            System.out.println("Usted tiene " + edad + " y es mayor de edad");
        }else if(edad > 100 || edad < 0){
            System.out.println("Los valores ingresados son invalidos");
        }
    }
}