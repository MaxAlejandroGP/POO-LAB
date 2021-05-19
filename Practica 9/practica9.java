import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class practica9 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{


        int n = 3;
        int nummat = 7;

        alumno alumno[] = new alumno[n];

        alumno[0] = new alumno();
        alumno[0].setNombre("Max");
        alumno[0].setMatricula(1272584);
        alumno[0].setCalificaciones(nummat);

        alumno[1] = new alumno();
        alumno[1].setNombre("Alejandro");
        alumno[1].setMatricula(1288425);
        alumno[1].setCalificaciones(nummat);

        alumno[2] = new alumno();
        alumno[2].setNombre("Gonzalez");
        alumno[2].setMatricula(1292584);
        alumno[2].setCalificaciones(nummat);

        for (int i = 0; i <  n ; i++){
            System.out.println("\n-| ALUMNO: " + alumno[i].getNombre()+"\nMatricula: " +alumno[i].getMatricula());
            System.out.println("\n | CALIFICACIONES |");
            alumno[i].getCalificaciones();

            alumno[i].setPromedio(OperacionesCalificacion.calcularProm(alumno[i].soloCalificaciones()));
            System.out.println("\nEl promedio es: "+ alumno[i].getPromedio());
        }

        try {
 
            FileOutputStream fileOut = new FileOutputStream("alumnos.csv");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(alumno[0]);
            objectOut.writeObject(alumno[1]);
            objectOut.writeObject(alumno[2]);
            objectOut.close();
            System.out.println("Se ha creado el archivo correctamente");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}

// GONZALEZ PIMENTEL MAX ALEJANDRO      1272584     G541