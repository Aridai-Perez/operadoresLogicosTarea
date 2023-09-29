//Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o
//igual a 100.

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ejercicio6 {
    public static void main(String[] args) {
        
        int calificacion;
        
        Scanner digito = new Scanner(System.in);
        System.out.println("ingrese una calificacion (puntaje maximo 100):");
        calificacion = digito.nextInt();
        
        if ((calificacion >=60)&&(calificacion<=100)){
            System.out.println("Felicidades aprobaste, sigue esforzandote!!");
        } else {
            System.out.println("No pasate, pero sigue esfonzandote!!");
        }
    }
}
