//Comprueba si una persona es mayor de edad y tiene un permiso de conducir.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio7 {
    public static void main(String[] args) {
        
        int edad;
        
        Scanner edadLegal = new Scanner(System.in);
        System.out.println("ingresa tu edad:");
        edad = edadLegal.nextInt();
        
        if (edad >=18) {
            System.out.println("Tienes la edad legal para tener permiso de conducir");
        } else{
            System.out.println("Lo siento, sigues siendo joven para un permiso de conducir");
        }
    }
}
