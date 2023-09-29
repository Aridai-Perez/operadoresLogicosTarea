
import java.util.Scanner;

//Determina si un triángulo es equilátero o isósceles.

/**
 *
 * @author Lenovo
 */
public class ejercicio18 {
    public static void main(String[] args) {
        
        int lado1;
        int lado2;
        int lado3;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la medida del primer lado de su triangulo:");
        lado1 = teclado.nextInt();
        
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Ingrese la medida del segundo lado de su triangulo:");
        lado2 = teclado.nextInt();
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Ingrese la medida del tercer lado de su triangulo:");
        lado3 = teclado.nextInt();
        
        if ((lado1 == lado2)&&(lado1 == lado3)) {
            System.out.println("tu triangulo es equilatero");
        } else if ((lado1 == lado2)||(lado1 == lado3)){
            System.out.println("tu triangulo es isosceles");
        } else {
            System.out.println("tu triangulo es escaleno");
        }
    }
}
