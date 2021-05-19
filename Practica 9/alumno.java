import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.*;

class alumno implements Serializable {
    String nombre;
    Calificaciones califs[];
    int promedio, matricula;

      

      public void setNombre(String nom){
        nombre = nom;
      } 

      public void setMatricula(int mat){
        matricula = mat;
       } 

      public void setPromedio(int prom){
        promedio = prom;
      } 

       
      public void setCalificaciones(int nummat){
        califs = new Calificaciones[nummat];

        for (int i = 0; i < nummat; i++){
          califs[i]= new Calificaciones();
          califs[i].calificacion = calificacionesP9[(int) (Math.random()*21)];

        }
      } 

      public void getCalificaciones(){
        for (int i =0; i < califs.length; i++ ){
          System.out.println(califs[i].getCalificacion());
        }
      }

      public int[] soloCalificaciones(){
        int[] solocali = new int[califs.length];
        for (int i =0; i < califs.length; i++ ){
          solocali[i]=califs[i].calificacion;
        }
        return solocali;
      }
   
      public String getNombre(){
        return nombre;
      } 
       
      public int getMatricula(){
        return matricula;
      }
   
      public int getPromedio(){
        return promedio;
      } 
   
      
      int[] calificacionesP9 = new int[21];{
      calificacionesP9[0] = 67;
      // LECTURA DEL ARCHIVO
      String fileName = "practica9.csv";
      File file = new File(fileName);
      try {
          Scanner inputStream = new Scanner(file);
          while (inputStream.hasNext()){
              String data = inputStream.next();
              String[] values = data.split(",");
              for (int i =1; i < values.length; i++ ){
                  calificacionesP9[i] = Integer.parseInt(values[i]);
                }
          }
          inputStream.close();
      } catch (FileNotFoundException e){
        e.printStackTrace();
      
      }
      }
}//fin clase Alumno5