public class Banco {
    
    int limite = 0;
    Cuenta cuenta[] = new Cuenta[100];

    public void newCuenta(){
    
        cuenta[limite] = new Cuenta();
        
        System.out.print("\nNombre: ");
        cuenta[limite].setNombre(CapturaEntrada.capturarString());
        System.out.print("\nPIN: ");
        cuenta[limite].setPin(CapturaEntrada.capturarInt());
        System.out.print("\nIngrese el primer deposito: ");
        cuenta[limite].setSaldo(CapturaEntrada.capturarInt());
        limite++;
    
    }

    public void modificarCuenta(){
        int flag,opciones;
        float deposito,retiro;

        boolean ops = false;

        System.out.println("\nIngresa el PIN");
        flag=CapturaEntrada.capturarInt();
        for (int i = 0; i < limite ; i++){
        if(flag==cuenta[i].getPin()){
            System.out.println("\nPIN CORRECTO");
            System.out.println("\nBienvenido "+cuenta[i].getNombre());
            while(!ops){
                System.out.println("\nSALDO: "+cuenta[i].getSaldo()+" pesos");
                System.out.println("1) Depositar");
                System.out.println("2) Retirar");
                System.out.println("3) Atras");
                opciones = CapturaEntrada.capturarInt();
                switch (opciones){
                    case 1:
                        deposito = OperacionesBanco.depositoCuenta(cuenta[i].getSaldo()); 
                        cuenta[i].setSaldo(deposito);
                    break;

                    case 2:
                        retiro = OperacionesBanco.retiroCuenta(cuenta[i].getSaldo()); 
                        if(retiro >= 0){
                            cuenta[i].setSaldo(retiro);
                            System.out.println("\nOperacion exitosa");    
                        }
                        else{
                            System.out.println("\nNo cuentas con saldo para realizar esta operacion");
                        }
                    break;

                    case 3:
                        ops=true;
                    break;
 
                    default:
                        System.out.println("\nSelecciona una opcion del 1 al 3");
                    break;
                }
            }
        }else{
            
            System.out.println("\nNota: Nunca olvides ingresar bien el PIN");
            }
        }
    }

    /*
    public float[] soloSaldo(){
        float[] soloSal = new float[cuenta.length];
        for (int i =0; i < cuenta.length; i++ ){
          soloSal[i]=cuenta[i].getSaldo();
        }
        return soloSal;
      }
    */

    public void mostrarCuentas(){

        for (int i = 0; i < limite ; i++){
            System.out.println("\nCuenta "+ i);
            System.out.println("Nombre "+ cuenta[i].getNombre());
            System.out.println("Saldo "+ cuenta[i].getSaldo());
        }
    }

}