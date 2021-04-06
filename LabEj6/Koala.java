public class Koala extends Animal{

	public Koala(String especie, String nombre, int edad, String genero, boolean vacunado){
		super(especie, nombre, edad, genero, vacunado);
	}
	
	@Override
	public void comer(){
		System.out.println("El "+ especie + " "+nombre +" Esta comiendo eucalipto!");
	}

	@Override
	public void accion(){
		System.out.println("El "+ especie + " "+nombre +" Se ha subido a un arbol!");
	}

}