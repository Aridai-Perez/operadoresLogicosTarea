
import java.util.Scanner;

//Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.

/**
 *
 * @author Lenovo
 */
public class ejercicio16 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner teclad = new Scanner(System.in);
        System.out.println("ingresa un numero:");
        numero = teclad.nextInt();
        
        if ((numero % 3 == 0)&&(numero % 5 == 0)){
            System.out.println("tu numero es multiplo de 3 y 5");
        } else if (numero % 3 == 0){
            System.out.println("tu numero solo es multiplo de 3");
        } else {
            System.out.println("tu numero no es multiplo de 3 o 5");
        }
       
    }
}
