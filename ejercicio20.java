
import java.util.Scanner;

//Verifica si una persona tiene acceso a una sala VIP si es mayor de edad o si tiene
//una invitación especial

/**
 *
 * @author Lenovo
 */
public class ejercicio20 {
    public static void main(String[] args) {
        
        String confirmacionUsuario = "";
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        edad = teclado.nextInt();
        teclado.nextLine();

        if (edad < 18){
            System.out.println("Parece que eres menor de edad, tienes una invitacion especial?");
                confirmacionUsuario = teclado.nextLine();
            switch (confirmacionUsuario){
                case "si": 
                    System.out.println("Bienvenido a la sala VIP");
                    break;
                case "no":
                    System.out.println("Lo siento no puedes ingresar");
                    break;
        }
        } else {
            System.out.println("Puedes ingresar a la sala VIP al ser mayor de edad, BIENVENIDO!");
        }
        
        

            
    }
}
