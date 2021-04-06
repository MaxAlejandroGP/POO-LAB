public class Canguro extends Animal{

	public Canguro(String especie, String nombre, int edad, String genero, boolean vacunado){
		super(especie, nombre, edad, genero, vacunado);
	}
	
	@Override
	public void comer(){
	System.out.println("El "+ especie + " "+nombre +" Esta comiendo hierbas");
	}

	@Override
	public void accion(){
		System.out.println("El "+ especie + " "+nombre +" esta guardando rocas en su bolso!");
	}
}