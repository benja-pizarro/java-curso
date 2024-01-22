package fundamentos;

/*
    Operadores matemáticos
    Suma, Resta, Multiplicación, División y Resto 
*/
public class J03Operadores {
    public static void main(String[] args) {
        // // Suma
        // int num1, num2, resultado;
        // num1 = 10;
        // num2 = 3;

        // resultado = num1 + num2;
        // System.out.println("Resultado de la suma: " + resultado);

        // // Resta
        // resultado = num1 - num2;
        // System.out.println("Resultado de la resta: " + resultado);

        // //Multiplicación
        // resultado = num1 * num2;
        // System.err.println("Resultado de la multiplicación: " + resultado);

        // //División
        // double dob1, dob2;
        // double resultadoDouble;
        // dob1 = 10;
        // dob2 = 3;
        // resultadoDouble = dob1 / dob2;
        // System.out.println("Resultado de la división: " + resultadoDouble);

        // //Resto
        // resultadoDouble = dob1%dob2;
        // System.out.println("El resto de la división es: " + resultadoDouble);

        // Operadores de incremento
        int numIncremento = 0;
        
        numIncremento = numIncremento + 1;

        System.out.println("Valor de numIncremento: " + numIncremento);

        // Pre incremento
        //Primero incrementa el valor y luego lo asigna
        System.out.println("Valor de numIncremento: " + ++numIncremento);

        // Post incremento
        //Primero obtiene el valor y luego lo incrementa
        System.out.println("Valor de numIncremento: " + numIncremento++);

        // Después de hacer el incremento
        System.out.println("Valor de numIncremento: " + numIncremento);

        // Esto también se puede aplicar con otra operaciones
        System.out.println("Valor de numIncremento: " + --numIncremento);

        // Operación más asignación
        int operacionAsignacion = 5;
        operacionAsignacion *= operacionAsignacion;
        System.out.println("Resultado operación y asignación: " + operacionAsignacion);

        operacionAsignacion += operacionAsignacion;
        System.out.println("Resultado operación y asignación: " + operacionAsignacion);

        operacionAsignacion -= 30;
        System.out.println("Resultado operación y asignación: " + operacionAsignacion);

        operacionAsignacion /= 2;
        System.out.println("Resultado operación y asignación: " + operacionAsignacion);
    }
}
