//Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha
//obtenido un resultado de "Aprobado" en su evaluación.

/**
 *
 * @author Lenovo
 */
public class ejercicio14 {
    public static void main(String[] args) {
        
        Alumnos[] alumno = new Alumnos[5];
        
        alumno[0] = new Alumnos ("juan", 60);
        alumno[1] = new Alumnos ("miguel", 100);
        alumno[2] = new Alumnos ("lucia", 70);
        alumno[3] = new Alumnos ("panchito", 65);
        alumno[4] = new Alumnos ("ester", 87);
        
        for (Alumnos Alumno : alumno) {
            if (Estatus(Alumno.getCalificacion())){
                System.out.println("alumn@: "+ Alumno.getNombre() + ", calificacion: " + Alumno.getCalificacion() + ", estatus: aprobado");            
            } else {
                System.out.println("alumn@: "+ Alumno.getNombre() + ", calificacion: " + Alumno.getCalificacion() + ", estatus: aprobado");
               
            }
        }            
    }
    
    public static boolean Estatus (int calificacion) {
        return calificacion >= 70;
    }    
        
    static class Alumnos {
    
        private String nombre;
        private int calificacion;
        
        public Alumnos (String nombre, int calificacion){
            
            this.nombre = nombre;
            this.calificacion = calificacion;

        }

        public String getNombre() {
            return nombre;
        }

        public int getCalificacion() {
            return calificacion;
        }
        
    }
   
}
