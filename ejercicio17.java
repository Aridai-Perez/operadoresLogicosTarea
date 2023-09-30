
import java.util.Scanner;

//Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra
//"Python".

/**
 *
 * @author Lenovo
 */
public class ejercicio17 {
    public static void main(String[] args) {
        
        String fraseUsuario = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor: ");
        fraseUsuario = teclado.nextLine();
        String contenedorFrase = fraseUsuario.toLowerCase();
        
        boolean palabraContenedora = contenedorFrase.contains("java");
        boolean palabraContenedora2 = contenedorFrase.contains ("phyton");
        
        if (palabraContenedora == true){
            System.out.println("tu frase " + "'" + fraseUsuario + "'" + " contiene la palabra Java");
        } else if (palabraContenedora2 == true) {
            System.out.println("tu frase " + "'" + fraseUsuario + "'" + " contiene la palabra Phyton");
        } else if ((palabraContenedora == true)&&(palabraContenedora2 == false)) {
            System.out.println("tu frase " + "'" + fraseUsuario + "'" + " contiene la palabra Java, pero no la palabra Phyton");
        } else {
            System.out.println("tu frase " + "'" + fraseUsuario + "'" + " no contiene la palabra Java, ni Phyton");
        }
    }
}
