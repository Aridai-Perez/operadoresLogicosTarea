//Verifica si un número es menor que 50 o mayor que 100.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio8 {
    public static void main(String[] args) {
        
        int numero;
        Scanner digitos = new Scanner(System.in);
        System.out.println("ingresa un numero:");
        numero = digitos.nextInt();
        
        if (numero <50){
            System.out.println("el numero "+ numero +" es menor a 50");
        } else if (numero>100){
            System.out.println("el numero "+ numero +" es mayor a 100");
        } else {
            System.out.println("el numero "+ numero +" se encuentra entre 50 o 100");
        }
    }
}
