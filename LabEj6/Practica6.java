public class Practica6{
    public static void main(String []args){

        int opc;
        int bandera=0;
        Zoo zoo = new Zoo();
        Veterinario veterinario = new Veterinario("Max Alejandro Gonzalez Pimentel", 999.98, "19 años de experiencia en cuidados animales");
        System.out.println("\nSAN DIEGO MINI ZOO");
        
        boolean salir = false;

        while(!salir){
            
            System.out.println("\n¿Que desea realizar?");
            System.out.println("\n1) Agregar animal");
            System.out.println("2) Eliminar animal");
            System.out.println("3) Mostrar animales");
            System.out.println("4) Consulta veterinario");
            System.out.println("5) Observar animales");
            System.out.println("6) Observar animales en su habitad");
            System.out.println("7) Salir");
            opc = CapturaEntrada.capturarInt("\nSeleccione una opcion: ");
            switch(opc){
                case 1:
                    System.out.println("\nLista de animales permitidos en este Zoologico");    
                    System.out.println("\n1) Canguro");
                    System.out.println("2) Elefante");
                    System.out.println("3) Jaguar");
                    System.out.println("4) Jirafa");
                    System.out.println("5) Koala");

                    zoo.agregarAnimal();
                    bandera=1;
                break;

                case 2:
                    if(bandera==1){
                        zoo.eliminarAnimal();
                    }
                    else{
                        System.out.println("\nEl zoologico no tiene animales registrados");
                    }
                break;
                
                case 3:
                    if(bandera==1){
                        zoo.mostrarAnimales();
                    }
                    else{
                        System.out.println("\nEl zoologico no tiene animales registrados");
                    }
                break;

                case 4:
                    if(bandera==1){
                        int opcv;
                        System.out.println("\nVeterinario "+ veterinario.getNombre()+ " a su disposicion!");    
                        System.out.println("1) Vacunar animales");
                        System.out.println("2) Analizar edad");
                        System.out.println("3) Revisar alimentos");
                        System.out.println("4) Datos del veterinario");
                        System.out.println("5) Atrás");
                        opcv = CapturaEntrada.capturarInt("\nSeleccione una opcion: ");
                        switch(opcv){
                            case 1:
                                for(int i=0; i<zoo.listaDeAnimales.size(); i++) {
                                veterinario.vacuna(zoo.listaDeAnimales.get(i), zoo.listaDeAnimales.size());
                                }
                            break;

                            case 2:
                                for(int i=0; i<zoo.listaDeAnimales.size(); i++) {
                                veterinario.verificarEdad(zoo.listaDeAnimales.get(i), zoo.listaDeAnimales.size());
                                }
                            break;

                            case 3:
                                for(int i=0; i<zoo.listaDeAnimales.size(); i++) {
                                veterinario.habilitarComidaAdulta(zoo.listaDeAnimales.get(i), zoo.listaDeAnimales.size());
                                }
                            break;
                            
                            case 4:
                                System.out.println("\nVeterinario: "+ veterinario.getNombre()+ "\nExperiencia: "+ veterinario.getExperiencia()+ "\nSalario: $"+veterinario.getSalario()+ " Pesos por sesión de revisión"); 
                            break;
                                
                            case 5:

                            break;

                            default:
                                System.out.println("\nSelecciona una opcion del 1 al 5");
                            break;
                        }
                    }
                    else{
                        System.out.println("\nEl zoologico no tiene animales registrados");
                    }
                break;
                
                case 5:
                    if(bandera==1){
                        System.out.println("\nObservando animales");
                        for(int i=0; i<zoo.listaDeAnimales.size(); i++) {
                            zoo.listaDeAnimales.get(i).comer();

                        }
                    }
                    else{
                        System.out.println("\nEl zoologico no tiene animales registrados");
                    }
                break;

                case 6:
                    if(bandera==1){
                        System.out.println("\nObservando animales en su habitad");
                        for(int i=0; i<zoo.listaDeAnimales.size(); i++) {
                            zoo.listaDeAnimales.get(i).accion();
                        }
                    }
                    else{
                        System.out.println("\nEl zoologico no tiene animales registrados");
                    }
                break;

                case 7:
                    salir = true;
                break;

                default:
                    System.out.println("\nSelecciona una opcion del 1 al 7");
                break;
            }
        }
	}
}