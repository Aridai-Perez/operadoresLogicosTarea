//Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha
//obtenido un resultado de "Aprobado" en su evaluación.

/**
 *
 * @author Lenovo
 */
public class ejercicio14 {
    public static void main(String[] args) {
        
        int[] alumnos = {70, 60, 100, 40, 80, 75};
        
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i] >= 70){
                System.out.println("aprobado");
            }else{
                System.out.println("reprobado");
            }
        }
    }
}
