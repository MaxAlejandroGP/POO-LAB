  
public class Practica5 {

	public static void main(String[] args) {
        int opc;
        int bandera=0;
        Banco banco = new Banco();
        System.out.println("\nBANCO");

        
        boolean salir = false;

        while(!salir){
            System.out.println("\n¿Que operacion bancaria desea realizar?");
            System.out.println("\n1) Crear cuenta");
            System.out.println("2) Acceder a cuenta mediante PIN");
            System.out.println("3) Mostrar cuentas");
            System.out.println("4) Salir");
            opc = CapturaEntrada.capturarInt();
            switch(opc){
                case 1:
                    banco.newCuenta();
                    bandera=1;
                break;

                case 2:
                    if(bandera==1){
                        banco.modificarCuenta();
                    }
                    else{
                        System.out.println("\nPrimero crea una cuenta");
                    }
                break;
                
                case 3:
                    if(bandera==1){
                        banco.mostrarCuentas();
                    }
                    else{
                        System.out.println("\nEl banco no tiene cuentas registradas");
                    }
                break;

                case 4:
                    salir = true;
                break;

                default:
                    System.out.println("\nSelecciona una opcion del 1 al 3");
                break;
            }
        }
	}
}