//Comprueba si un número es mayor que 10 y menor que 20.

import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        int numero1;
        
        Scanner num1 = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        numero1 = num1.nextInt();
        
        if ((numero1 <20) && (numero1 >10)){
            System.out.println("el numero "+ numero1 + " es mayor que 10 y menor que 20");
        }
        else if ((numero1 <10) && (numero1 <20)){
            System.out.println("tu numero es menor que 10 y 20");
                    }
        else {
            System.out.println("tu numero es mayor que 10 y 20");
        }
    }
    
}
