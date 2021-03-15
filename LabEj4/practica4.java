import java.util.Scanner;


public class practica4{

	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){
	
	System.out.println("\n| CREACION DE PERSONAJE ANGRY BIRDS |");

	System.out.println("Introduzca el nombre de usuario: ");
    String n = sc.nextLine();
	System.out.println("Introduzca el nombre del pajaro: ");
    String np = sc.nextLine();
	System.out.println("Introduzca el tamaño del pajaro (pequeño,mediano o grande): ");
    String t = sc.nextLine();
	System.out.println("Introduzca el estado del pajaro: ");
    String e = sc.nextLine();
	System.out.println("Introduzca la edad del pajaro: ");
    int age = sc.nextInt();
	sc.nextLine();
	System.out.println("Introduzca el color del pajaro: ");
    String c = sc.nextLine();
	System.out.println("Introduzca el ataque del pajaro: ");
    String a = sc.nextLine();

	mipersonaje personaje = new mipersonaje(n,np,t,e,age,c,a);
	pajaros p1 =  new pajaros("Chris","Pequeño","Ansioso",10,"Blanco","Suelta huevos de ataque al alcanzar su altura maxima");
	pajaros p2 =  new pajaros("Jordan","Mediano","Astuto",25,"Amarillo","Toma posición de aguila para atacar de forma veloz");
	pajaros p3 =  new pajaros("Paco","Grande","Valiente",52,"Negro","Explota al caer sobre los puercos enemigos");
	pajaro pajarito = new pajaro("Bobby","pequeño","Timido",5);
	
	pajaros[] misPajaros = {p1,p2,p3};
	


	
	boolean salir = false;
	int opcion;
	

	while(!salir){
		opcion = menu();
		switch(opcion){
			case 1: 
				System.out.println("\nNombre de usuario: "+personaje.getUsuario()+"\nPajaro: "+ personaje.getNombre() +"\nTamaño: "+ personaje.getTamaño()+"\nEstado: "+personaje.getEstado()+"\nEdad: "+personaje.getEdad()+"\nColor: "+personaje.getColor()+"\nAtaque: "+personaje.getAtaque());
				break;

			case 2: 
				System.out.println("\nPajaro: "+ misPajaros[0].getNombre() +"\nTamaño: "+ misPajaros[0].getTamaño()+"\nEstado: "+misPajaros[0].getEstado()+"\nEdad: "+misPajaros[0].getEdad()+"\nColor: "+misPajaros[0].getColor()+"\nAtaque: "+misPajaros[0].getAtaque());
				break;

			case 3: 
				System.out.println("\nPajaro: "+ misPajaros[1].getNombre() +"\nTamaño: "+ misPajaros[1].getTamaño()+"\nEstado: "+misPajaros[1].getEstado()+"\nEdad: "+misPajaros[1].getEdad()+"\nColor: "+misPajaros[1].getColor()+"\nAtaque: "+misPajaros[1].getAtaque());
				break;
			
			case 4: 
				System.out.println("\nPajaro: "+ misPajaros[2].getNombre() +"\nTamaño: "+ misPajaros[2].getTamaño()+"\nEstado: "+misPajaros[2].getEstado()+"\nEdad: "+misPajaros[2].getEdad()+"\nColor: "+misPajaros[2].getColor()+"\nAtaque: "+misPajaros[2].getAtaque());
				break;
			
			case 5: 
				System.out.println("\nPajaro: "+ pajarito.getNombre() +"\nTamaño: "+ pajarito.getTamaño()+"\nEstado: "+pajarito.getEstado()+"\nEdad: "+pajarito.getEdad());
				break;
			case 6: salir = true;
				break;
			
			default:
				System.out.println("Las opciones son entre 1 y 5");
			}
		}
	}
	public static int menu(){

		System.out.println("\n| ANGRY BIRDS |");
        System.out.println("\n1.- CONSULTAR MI PERSONAJE");
        System.out.println("2.- Consultar Pajaro 1");
        System.out.println("3.- Consultar Pajaro 2");
        System.out.println("4.- Consultar Pajaro 3");
		System.out.println("5.- Pajaro normal");
        System.out.println("6.- Salir");
        return sc.nextInt();
    }
}

// GONZALEZ PIMENTEL MAX ALEJANDRO 1272584 G541