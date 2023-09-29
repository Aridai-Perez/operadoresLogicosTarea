//Comprueba si un número es negativo o si es cero.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio10 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        numero = digito.nextInt();
        
        if (numero <0){
            System.out.println("tu numero es negativo");
        } else {
            System.out.println("tu numero es positivo o cero");
        }
    }
          
}