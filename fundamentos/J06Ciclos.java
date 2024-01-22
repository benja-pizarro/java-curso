package fundamentos;

public class J06Ciclos {
    /*
        Ciclos:
        Nos referimos a las iteraciones dentro de un buclem el cual se
        rompe cuando se cumple una cierta condición
    */

    public static void main(String[] args) throws InterruptedException {
        //while
        int cantidadDeIteraciones = 3;
        int contador = 0;

        while (contador < cantidadDeIteraciones) { // Aquí se evalua una condición, se espera sea true o false
            System.out.println("Hola desde un ciclo while, valor de contador: " + contador);
            Thread.sleep(2000);
            contador++;
        }
        // En el caso de que siempre sea true, se ejecutaría un bucle INFINITO
    }
}
