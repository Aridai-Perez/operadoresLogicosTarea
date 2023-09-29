//Determina si una persona es adulta y no es jubilada.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio12 {
    public static void main(String[] args) {
        int edad;
        
        Scanner edadLegal = new Scanner(System.in);
        System.out.println("ingresa tu edad:");
        edad = edadLegal.nextInt();
        
        if ((edad >=18) && (edad<=54)) {
            System.out.println("eres mayor de edad y no eres una persona jubilada");
        } else if (edad >=55){
            System.out.println("Eres una persona jubilada");
        } else {
            System.out.println("eres menor de edad");
        }
    }
}
