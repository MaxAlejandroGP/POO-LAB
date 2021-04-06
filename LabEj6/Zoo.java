import java.util.ArrayList;

public class Zoo{
    ArrayList<Animal> listaDeAnimales = new ArrayList<Animal>();

    public void agregarAnimal() {
        Animal animal = new Animal("","", 0, "", false);

        int opc;

       /* PRUEBAS
        animal = new Canguro("Canguro","Pepe",3,"Macho",false);
                listaDeAnimales.add(animal);
        animal = new Canguro("Canguro","Diego",15,"Macho",false);
                listaDeAnimales.add(animal);
        animal = new Jirafa("Jirafa","Max",52,"Macho",false);
                listaDeAnimales.add(animal);
        animal = new Jaguar("Jaguar","Aydan",23,"Macho",true);
                listaDeAnimales.add(animal);
        animal = new Jaguar("Jaguar","Ayadin",66,"Macho",false);
                listaDeAnimales.add(animal);
        animal = new Elefante("Elefante","Dumbo",4,"Macho",true);
                listaDeAnimales.add(animal);
        */
        
        opc = CapturaEntrada.capturarInt("\n¿Que animal desea ingresar al Zoo? ");
        switch(opc){
            case 1:
                animal = new Canguro("Canguro",CapturaEntrada.capturarString("Nombre del animal:"),CapturaEntrada.capturarInt("Edad:"),CapturaEntrada.capturarString("Genero del animal:"),CapturaEntrada.capturarBoolean("Vacunado (True si esta vacunado, false si no esta vacunado): "));
                listaDeAnimales.add(animal);
                break;
            case 2:
                animal = new Elefante("Elefante",CapturaEntrada.capturarString("Nombre del animal:"),CapturaEntrada.capturarInt("Edad:"),CapturaEntrada.capturarString("Genero del animal:"),CapturaEntrada.capturarBoolean("Vacunado (True si esta vacunado, false si no esta vacunado): "));
                listaDeAnimales.add(animal);
                break;
            case 3:
                animal = new Jaguar("Jaguar",CapturaEntrada.capturarString("Nombre del animal:"),CapturaEntrada.capturarInt("Edad:"),CapturaEntrada.capturarString("Genero del animal:"),CapturaEntrada.capturarBoolean("Vacunado (True si esta vacunado, false si no esta vacunado): "));
                listaDeAnimales.add(animal);
                break;
            case 4:
                animal = new Jirafa("Jirafa",CapturaEntrada.capturarString("Nombre del animal:"),CapturaEntrada.capturarInt("Edad:"),CapturaEntrada.capturarString("Genero del animal:"),CapturaEntrada.capturarBoolean("Vacunado (True si esta vacunado, false si no esta vacunado): "));
                listaDeAnimales.add(animal);
                break;
            case 5:
                animal = new Koala("Koala",CapturaEntrada.capturarString("Nombre del animal:"),CapturaEntrada.capturarInt("Edad:"),CapturaEntrada.capturarString("Genero del animal:"),CapturaEntrada.capturarBoolean("Vacunado (True si esta vacunado, false si no esta vacunado): "));
                listaDeAnimales.add(animal);
                break;

            default:
                System.out.println("\nAnimal no permitido");
                break;
            

        }
    }

    public void eliminarAnimal() {

        System.out.println("\nELIMINACION DE ANIMAL DEL ZOOLOGICO");
		String nombre;
        boolean banderon = false;
		nombre = CapturaEntrada.capturarString("\nNombre del animal: ");

        for(int i=0; i<listaDeAnimales.size(); i++) {
			if(nombre.equals(listaDeAnimales.get(i).getNombre())){
				listaDeAnimales.remove(listaDeAnimales.get(i));
                banderon = true;
                System.out.println("\nAnimal expulsado");
				break;
			}
		}

        if (!banderon){
            System.out.println("\nAnimal no encontrado");
        }
	}
	

    public void mostrarAnimales() {
        for(int i=0; i<listaDeAnimales.size(); i++) {
            System.out.println("\nESPECIE:" + listaDeAnimales.get(i).getEspecie());
            System.out.println("Nombre:" + listaDeAnimales.get(i).getNombre());
            System.out.println("Edad:" + listaDeAnimales.get(i).getEdad());
            System.out.println("Genero:" + listaDeAnimales.get(i).getGenero());
            System.out.println("Vacuna: " + listaDeAnimales.get(i).getVacunado());

        }
    }
}