public class Jaguar extends Animal{

	public Jaguar(String especie, String nombre, int edad, String genero, boolean vacunado){
		super(especie, nombre, edad, genero, vacunado);
	}
	
	@Override
	public void comer(){
	System.out.println("El "+ especie + " "+nombre +" Esta comiendo carne fresca");
	}

	@Override
	public void accion(){
		System.out.println("El "+ especie + " "+nombre +" está saltando hacia los espectadores!");
	}
}