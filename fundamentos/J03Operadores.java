package fundamentos;

/*
    Operadores matemáticos
    Suma, Resta, Multiplicación, División y Resto 
*/
public class J03Operadores {
    public static void main(String[] args) {
        // Suma
        int num1, num2, resultado;
        num1 = 10;
        num2 = 3;

        resultado = num1 + num2;
        System.out.println("Resultado de la suma: " + resultado);

        // Resta
        resultado = num1 - num2;
        System.out.println("Resultado de la resta: " + resultado);

        //Multiplicación
        resultado = num1 * num2;
        System.err.println("Resultado de la multiplicación: " + resultado);

        //División
        double dob1, dob2;
        double resultadoDouble;
        dob1 = 10;
        dob2 = 3;
        resultadoDouble = dob1 / dob2;
        System.out.println("Resultado de la división: " + resultadoDouble);

        //Resto
        resultadoDouble = dob1%dob2;
        System.out.println("El resto de la división es: " + resultadoDouble);
    }
}
