//Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una
//contraseña válidos.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio9 {
    public static void main(String[] args) {
        
        String password = "elotito";
        String usuario = "xridxi";
                
        String passwordIngresada = "";
        String usuarioIngresado = "";
                
        Scanner usuarios = new Scanner(System.in);
        System.out.println("ingresa el usuario:");
        usuarioIngresado = usuarios.nextLine();
        
        switch(usuarioIngresado){
            case "xridxi":
                System.out.println("usuario correcto");
                break;
            default:
                System.out.println("Usuario incorrecto");
                break;
        }             
        
        Scanner passwords = new Scanner(System.in);
        System.out.println("ingresa la contraseña:");
        passwordIngresada = passwords.nextLine();

        switch(passwordIngresada){
            case "elotito":
                System.out.println("contraseña correcta");
                break;
            default:
                System.out.println("contraseña incorrecta ");
                break;
        }         
        }
    }