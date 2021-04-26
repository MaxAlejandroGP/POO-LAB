public class Practica7{
	public static void main(String []args){
		int opc;
		boolean salir = false;
		boolean salir1 = false;
		boolean salir2 = false;
		boolean salir3 = false;

		boolean flag1 = false;
		boolean flag2 = false;

		RobotChef rc = new RobotChef("Max",100,25042021);
		RobotAyudanteCuchillos rac = new RobotAyudanteCuchillos("Alejandro",100,25042021,0);
		RobotAyudanteManosCalientes ram = new RobotAyudanteManosCalientes("Gonzalez",100,25042021,0);

		while(!salir){
			salir1 = false;
			salir2 = false;
			salir3 = false;
			System.out.println("\nPREPARACION DE MAGNUM OPUS");
            System.out.println("\n1) Robot Chef");
            System.out.println("2) Mini robot ayudante cuchillos 3000");
            System.out.println("3) Mini robot ayudante manos calientes");
			System.out.println("4) Salir");
			opc = CapturaEntrada.capturarInt("Seleccione un robot: ");
			switch(opc){
				case 1:
					if (rc.getBateria() > 0){
						while(!salir1){
							if (rc.getBateria() > 0){
								System.out.println("\nROBOT CHEF");
								System.out.println("\n1) Preparar los ingredientes");
								System.out.println("2) Cocinar el guiso de carne y verduras");
								System.out.println("3) Servir guiso en el tazon");
								System.out.println("4) Consultar estado de Robot Chef");
								System.out.println("5) Regresar");
								opc = CapturaEntrada.capturarInt("Seleccione una accion: ");
								
								switch(opc){
									case 1:
										System.out.println("\nRobot chef no puede preparar los ingredientes, llama a mini robot ayudante con cuchillos para prepararlos");
									break;

									case 2:
										System.out.println("\nRobot Chef no puede cocinar los ingredientes, llama a mini robot ayudante con manos calientes para cocinar el guiso");
									break;

									case 3:
										if (flag1 == true && flag2 == true){
											System.out.println("\n");
											rc.servirGuisoEnTazon();
											System.out.println("...\n...\n...");
											System.out.println("¡Hurra! El plato estaba delicioso");
											salir1 = true;
											salir= true;
										}
										else if (flag1 == true && flag2 == false){
											System.out.println("\nAun no se ha cocinado el platillo");
										}
										else{
											System.out.println("\nAun no se han preparado los ingredientes ni cocinado el platillo");
										}
									break;

									case 4:
										System.out.println("\nNombre: "+rc.getNombre()+ "\tBateria: "+rc.getBateria()+"%\tIdentificacion: "+rc.getIdentificacion());
									break;

									case 5:
										salir1 =true;
									break;

									default:
										System.out.println("Selecciona una accion");
									break;
								}
							}else{
								System.out.println(rc.getNombre()+" se quedo sin bateria, ya no se podra servir el plato");
								salir1= true;
							}
						}
					}else{
						System.out.println(rc.getNombre()+" no tiene bateria");
					}
				break;

				case 2:
					if (rac.getBateria() > 0 ){
						while(!salir2){
							if (rac.getBateria() > 0){
								System.out.println("\nMINI ROBOT AYUDANTE CON CUCHILLOS");	
								System.out.println("\n1) Preparar los ingredientes");
								System.out.println("2) Cocinar el guiso de carne y verduras");
								System.out.println("3) Servir guiso en el tazon");
								System.out.println("4) Consultar estado de Robot ayudante con cuchillos");
								System.out.println("5) Regresar");
								opc = CapturaEntrada.capturarInt("Seleccione una accion: ");
								switch(opc){
									case 1:
										if (flag1 == false){
											System.out.println("\n");
											rac.cortarCarne();
											rac.cortarVerduras();
											flag1 = true;
											System.out.println("...\n...\n...");
											System.out.println("Ingredientes preparados, se corto "+rac.getCorte()+ " veces");
										}
										else{
											System.out.println("Volviendo a preparar...\n");
											rac.cortarCarne();
											rac.cortarVerduras();
											System.out.println("...\n...\n...");
											System.out.println("Ingredientes preparados");
	
											System.out.println("\n Los ingredientes se han cortado "+rac.getCorte()+ " veces");
										}
	
									break;
	
									case 2:
										System.out.println("\nMini robot ayudante con cuchillos no puede cocinar los ingredientes, llama a mini robot ayudante con manos calientes para cocinar el guiso");
									break;
	
									case 3:
										System.out.println("\nMini robot ayudante con cuchillos no puede servir el platillo, solo robot chef puede hacerlo");
									break;
	
									case 4:
										System.out.println("\nNombre: "+rac.getNombre()+ "\tBateria: "+rac.getBateria()+"%\tIdentificacion: "+rac.getIdentificacion());
									break;
	
									case 5:
										salir2 =true;
									break;
	
									default:
										System.out.println("Selecciona una accion");
									break;
								}
							}else{
								System.out.println("\nSeñoras y señores, tristemente "+rac.getNombre()+" se quedo sin bateria, ya no podras seguir preparando el platillo");
								salir2= true;
							}
							
						}
					}else{
						System.out.println("\n"+rac.getNombre()+" se quedo sin bateria, ya no podras seguir preparando el platillo");
					}
				break;

				case 3:	
					if (ram.getBateria() > 0){
						while(!salir3){
							if (ram.getBateria() > 0){
								System.out.println("\nMINI ROBOT AYUDANTE CON MANOS CALIENTES");
								System.out.println("\n1) Preparar los ingredientes");
								System.out.println("2) Cocinar el guiso de carne y verduras");
								System.out.println("3) Servir guiso en el tazon");
								System.out.println("4) Consultar estado de Robot ayudante con manos calientes");
								System.out.println("5) Regresar");
								opc = CapturaEntrada.capturarInt("Seleccione una accion: ");
								switch(opc){
									case 1:
										System.out.println("\nMini robot ayudante con manos calientes no puede cocinar los ingredientes, llama a mini robot ayudante con cuchillos para cocinar el guiso");
									break;
	
									case 2:
									if (flag2 == false && flag1 == true){
										System.out.println("\n");
										ram.cocinarGuiso();
										flag2 = true;
										System.out.println("...\n...\n...");
										System.out.println("Guiso cocinado, la temperatura es "+ram.getControlTemperatura()+" Grados Celsius");
									}
									else if(flag2 == true){
										System.out.println("\nVolviendo a cocinar guiso");
										ram.cocinarGuiso();
										System.out.println("...\n...\n...");
										System.out.println("Guiso cocinado");
										System.out.println("\nLa temperatura del guiso aumento a "+ram.getControlTemperatura()+" Grados Celsius");
									}
									
									else{
										System.out.println("\nAun no se han preparado los ingredientes");
									}
									break;
	
									case 3:
										System.out.println("\nMini robot ayudante con manos calientes no puede servir el platillo, solo robot chef puede hacerlo");
									break;
	
									case 4:
										System.out.println("\nNombre: "+ram.getNombre()+ "\tBateria: "+ram.getBateria()+"%\tIdentificacion: "+ram.getIdentificacion());
									break;
	
									case 5:
										salir3 =true;
									break;
	
									default:
										System.out.println("Selecciona una accion");
									break;
								}
							}else{
								System.out.println("Tristemente "+ram.getNombre()+" se quedo sin bateria, ya no podras seguir cocinando el platillo");
								salir3= true;
							}
						}
					}else{
						System.out.println("\n"+ram.getNombre()+" no tiene bateria, ya no podras seguir cocinando el platillo");
					}
				break;

				case 4:
					salir = true;
				
				break;

				default:
					System.out.println("Selecciona un robot!!!");
				break;
			}
		}
	}	
}