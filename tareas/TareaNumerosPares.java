import java.util.Scanner;

public class TareaNumerosPares{
    public static void main(String[] args) {
    double num1;
    double resultadoDouble;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un numero para saber si es par o impar");
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
        

    }
}