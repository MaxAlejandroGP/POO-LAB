public class Practica8{
	public static void main(String []args){
		int opc;
		boolean salir = false;
		int flag=0;

		torneo torneo = new torneo();

		while(!salir){
			System.out.println("\nULTIMATE BASKETBALL TOURNAMENT");
            System.out.println("\n1) Torneo");
            System.out.println("2) Mostrar Torneo");
			System.out.println("3) Salir");
			opc = CapturaEntrada.capturarInt("Seleccione una opcion: ");
			switch(opc){
				case 1:
					System.out.println("\nINGRESO DE DATOS - ULTIMATE BASKETBALL TOURNAMENT");
					torneo.setNombre(CapturaEntrada.capturarString("Nombre del torneo: "));
					torneo.setRegion(CapturaEntrada.capturarString("Region del torneo: "));
					torneo.setNumeroParticipantes(CapturaEntrada.capturarInt("Participantes: "));
					torneo.setPartidosJugados(CapturaEntrada.capturarInt("Partidos jugados: "));
					torneo.setPartidosPendientes(CapturaEntrada.capturarInt("Partidos pendientes: "));
					torneo.setEquipo(torneo.getNumeroParticipantes());
					flag=1;
				break;
		
				case 2:
					if(flag==1){
						System.out.println("\nDATOS DEL ULTIMATE BASKETBALL TOURNAMENT:");
						System.out.println("\nNombre: "+torneo.getNombre());
						System.out.println("Region: "+torneo.getRegion());
						System.out.println("Numero de equipos participantes: "+torneo.getNumeroParticipantes());
						System.out.println("Partidos jugados: "+torneo.getPartidosJugados());
						System.out.println("Partidos pendientes: "+torneo.getPartidosPendientes());

						torneo.mostrarDatos();
					}
					else{
						System.out.println("\nDebes capturar un torneo primero!!!");
					}
				break;

				case 3:	
					salir = true;
				break;
				
				default:
					System.out.println("Selecciona una opcion");
				break;
			}
		}
	}	
}