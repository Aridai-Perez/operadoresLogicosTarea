//Comprueba si un número es mayor que 10 y menor que 20.


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio2 {
    public static void main(String[] args) {
       
        int digito1;
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor: ");
        digito1 = digito.nextInt();
        
        if ((digito1 % 2 == 0)&&(digito1 % 3 == 0)){
            System.out.println("tu numero es divisible entre 2 y 3");
        } else if (digito1 % 2 ==0) {
            System.out.println("tu numero es divisible por 2");
        } else if (digito1 % 3 ==0){
            System.out.println("tu numero es divisible por 3");
        } else {
            System.out.println("tu numero no es divisible por 2 ni 3, lo siento");
        }
    }
}

