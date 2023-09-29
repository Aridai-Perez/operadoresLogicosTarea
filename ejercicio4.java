//Comprueba si un número es positivo y no es igual a cero.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio4 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        numero = digito.nextInt();
        
        if (numero >0){
            System.out.println("tu numero es positivo");
        } else {
            System.out.println("tu numero es negativo o cero");
        }
    }
}