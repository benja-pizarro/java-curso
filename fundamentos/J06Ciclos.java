package fundamentos;

public class J06Ciclos {
    /*
        Ciclos:
        Nos referimos a las iteraciones dentro de un bucle, el cual se
        rompe cuando se cumple una cierta condición
    */

    public static void main(String[] args) throws InterruptedException {
        //while
        int cantidadDeIteraciones = 3;
        int contador = 0;

        while (contador < cantidadDeIteraciones) { // Aquí se evalua una condición, se espera sea true o false
            System.out.println("Hola desde un ciclo while, valor de contador: " + contador);
            Thread.sleep(1000); // Tiempo de espera
            contador++; // Incremento x1
        }
        // En el caso de que siempre sea true, se ejecutaría un bucle INFINITO

        //do-while
        // A diferencia de while, el do-while evalúa la condición al final
        do{
            System.out.println("Hola desde un ciclo do-while, valor de contador: " + contador);
        }while(contador < cantidadDeIteraciones);

        //for
        // Ciclo compuesto, es decir, tiene la creación de su variable, condición y incremento
        //Contiene: Contador(i) ; Condición ; Incremento
        for(int i = 0; i < 3; i++){
            System.out.println("Hola desde un ciclo for, valor de contador: " + i);
        }

        for(int i = 3; i > 0; i--){
            System.out.println("Hola desde un ciclo for inverso, valor de contador: " + i);
        }
    }
}
