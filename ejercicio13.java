//Comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y menor que 30.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio13 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa un numero:");
        numero = teclado.nextInt();
        
        if ((numero > 5) && (numero < 10)){
            System.out.println("tu numero es mayor que 5 y menor que 10");
        } else if  ((numero >20)&&(numero<30)) {
            System.out.println("tu numero es mayor que 20 y menor que 30");
        } else {
            System.out.println("tu numero no esta en el rango que se establecio");
        }
    }
}

