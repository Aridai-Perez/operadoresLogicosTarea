//Determina si una cadena de texto contiene la letra "a" y la letra "b".

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        String palabra1 = "";
        
        Scanner frase1 = new Scanner(System.in);
        System.out.println("Ingrese una palabra por favor:");
        palabra1 = frase1.nextLine();
        
        if ( (palabra1.contains("e")) && (palabra1.contains("a"))) {
            System.out.println("tu numero contiene la letra e y la letra a");
        } else if (palabra1.contains("e")){
            System.out.println("tu palabra solo contiene la letra e");
        } else if (palabra1.contains("a")){
            System.out.println("tu palabra solo contiene la letra a");
    } else {
            System.out.println("tu palabra no contiene letras a ni e");
        }
                
    }
}