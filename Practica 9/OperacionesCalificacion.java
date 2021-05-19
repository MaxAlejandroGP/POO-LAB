public class OperacionesCalificacion {

  
  public static int calcularProm(int[] soloCalificaciones){
    
    int suma=0, promedio;
    
    for (int i = 0; i < soloCalificaciones.length; i++){
        suma = suma+soloCalificaciones[i];
    }

    promedio = suma / soloCalificaciones.length;

    return promedio;
  }
} 
