import java.io.Serializable;

class Calificaciones implements Serializable{

	int calificacion;


	public void setCalificacion(int cal){
		calificacion = cal;
	}

	
	public int getCalificacion(){
		return calificacion;
	}
}