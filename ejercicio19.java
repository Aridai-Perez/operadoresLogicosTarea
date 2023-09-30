
import java.util.Scanner;

//Comprueba si un número es mayor que 100 o si es menor que -100.

/**
 *
 * @author Lenovo
 */
public class ejercicio19 {
    public static void main(String[] args) {
        
        int numeroDelUsuario;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero, positivo o negativo:");
        numeroDelUsuario = teclado.nextInt();
        
        if (numeroDelUsuario > 100 ){
            System.out.println("tu numero es mayor a 100");
        } else if (numeroDelUsuario < -100){
            System.out.println("tu numero negativo, esta por debajo de -100");
        } else {
            System.out.println("tu numero se encuentra entre 100 y -100");
        }
        
        
    }
           
}
