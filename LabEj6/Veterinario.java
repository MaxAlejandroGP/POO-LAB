public class Veterinario {
	String nombre;
	double salario;
    String experiencia;
	
	public Veterinario(String nombre, double salario, String experiencia) {
		this.nombre = nombre;
        this.salario = salario;
        this.experiencia = experiencia;
	}

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public String getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(String experiencia){
        this.experiencia = experiencia;
    }

    public void vacuna(Animal animal, int n){
        for (int i=0; i<n; i++){
            if (animal.vacunado == true){
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " ya tiene su vacuna");
                break;
            }
            else{
                animal.setVacunado(true);
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " ha sido vacunado");
                break;
            }
        }
        
    }
	
    public void verificarEdad(Animal animal, int n){
        for (int i=0; i<n; i++){
            if (animal.edad >= 25){
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " esta muy viejo, ocupa ser examinado con deteminiento");
                break;
            }
            else{
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " es un animal joven y salvaje");
                break;
            }
        }
    }

        
    public void habilitarComidaAdulta(Animal animal, int n){
        for (int i=0; i<n; i++){
            if (animal.edad >= 5){
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " tiene permiso para consumir alimentos para animales mayores a 5 años");
                break;
            }
            else{
                System.out.println(animal.getEspecie() + " "+ animal.getNombre() + " es muy pequeño, debe consumir alimentos para animales bebe");
                break;
            }
        }
    }
}