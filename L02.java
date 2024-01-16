import java.util.Scanner;

    public class L02 {

        public static void main(String[] args){
            int num1, num2, resultado;
            Scanner scanner = new Scanner(System.in);
            
            // Pedir numero 1
            System.out.print("Ingrese numero 1: ");
            num1 = scanner.nextInt();
            
            // Pedir numero 2
            System.out.print("Ingrese numero 2: ");
            num2 = scanner.nextInt();

            //Suma
            resultado = num1 + num2;
            System.out.println("Resultado de la suma es: " + resultado);

             resultado = num1 - num2;
            System.out.println("Resultado de la resta es: " + resultado);

            double num1double, num2double, resultadoDouble;
            System.out.print("Ingrese numero 1: ");
            num1double = scanner.nextDouble();
            System.out.print("Ingrese numero 2: ");
            num2double = scanner.nextDouble();

            resultadoDouble = num1double / num2double;
            System.out.println("Resultado de la division es: " + resultadoDouble);

            resultadoDouble = num1double%num2double;
            System.out.println("El resto de la division es: " + resultadoDouble);




            
        }

    }