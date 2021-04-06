public class Jirafa extends Animal{

	public Jirafa(String especie, String nombre, int edad, String genero, boolean vacunado){
		super(especie, nombre, edad, genero, vacunado);
	}
	
	@Override
	public void comer(){
	System.out.println("La "+ especie + " "+nombre +" Esta comiendo heno de alfalfa");
	}

	@Override
	public void accion(){
		System.out.println("La "+ especie + " "+nombre +" Esta haciendo temblar el suelo con su recorrido");
	}
}