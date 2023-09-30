//Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada
//legalmente.

import java.util.Scanner;



/**
 *
 * @author Lenovo
 */
public class ejercicio15 {
    public static void main(String[] args) {
        
        int edad;
        String restrinccionLegal = "";
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Tienes alguna restriccion/inhabilitacion legal actualmente? ");
        restrinccionLegal = teclado2.nextLine();
        
        switch(restrinccionLegal){
            case "si":
                System.out.println("Actualmente tienes restrincciones legales, "
                        + "asi que no puedes votar, lo siento");
                System.exit(0);
            case "no":
                System.out.println("Perfecto, continuemos!");
        }
        
        System.out.println("ingresa tu edad, por favor: ");
        edad = teclado2.nextInt();
        
        if (edad >= 18){
            System.out.println("Eres mayor de edad, si cuentas con una INE, puedes votar!!");
        } else {
            System.out.println("Eres menor de edad, no puedes votar, lo siento!");    
        }
 
    }
            
}
