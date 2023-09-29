//Verifica si un número es par o si es múltiplo de 5.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio5 {
    public static void main(String[] args) {
       
        int numero;
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        numero = digito.nextInt();
        
        if (numero % 2 ==0){
            System.out.println("tu numero es par");
        } else if (numero % 5 ==0){
            System.out.println("tu numero se puede dividir entre 5");
        } else {
            System.out.println("tu numero es impar indivisible entre 5 o 2");
        }
    }
}

