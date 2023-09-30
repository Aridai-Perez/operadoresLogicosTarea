//Comprueba si una persona es mayor de edad y tiene un permiso de conducir.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio7 {
    public static void main(String[] args) {
        
        int edad;
        String licencia = "";
        
        Scanner edadLegal = new Scanner(System.in);
        System.out.println("ingresa tu edad:");
        edad = edadLegal.nextInt();
        edadLegal.nextLine();
        
        if (edad >=18) {
            System.out.println("Tienes licencia de conducir?");
            licencia = edadLegal.nextLine();
            String licencia2 = licencia.toLowerCase();
            switch (licencia2){
                case "si": 
                    System.out.println("Excelente");
                    break;
                case "no":
                    System.out.println("Tienes la edad legal, puedes tramitarla");
                    break;
        }
        } else{
            System.out.println("Lo siento, sigues siendo joven para un permiso de conducir");
        }
    }
}
