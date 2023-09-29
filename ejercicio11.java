//Verifica si un número es primo y menor que 100. 
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println("hola");
        int numero;
        int contador = 0;        
                
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor:");
        numero = teclado.nextInt();
              
        for(int i = numero; i > 0; i--){
            if(numero % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            System.out.println("tu numero es primo y menor a 100");
        } else if ( numero > 100){
        System.out.println("tu numero esta fuera de rango, es mayor a 100");
        } else {
            System.out.println("no es primo, pero si menor a 100");
        }
   
    }
}
