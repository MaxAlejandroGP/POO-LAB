public class Elefante extends Animal{

	public Elefante(String especie, String nombre, int edad, String genero, boolean vacunado){
		super(especie, nombre, edad, genero, vacunado);
	}
	
	@Override
	public void comer(){
	System.out.println("El "+ especie + " "+nombre +" Esta comiendo hierba y fruta");
	}

	@Override
	public void accion(){
		System.out.println("El "+ especie + " "+nombre +" se esta dando un baño con el lodo!");
	}

}