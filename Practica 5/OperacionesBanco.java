public class OperacionesBanco{

    public static float depositoCuenta(float f){
        float deposito;
        System.out.println("\nDEPOSITOS");
        System.out.println("\nIngrese el deposito");
        deposito = CapturaEntrada.capturarFloat();
        deposito = f+deposito;
        
        System.out.println("\nOperacion exitosa");

        return deposito;
    }

    public static float retiroCuenta(float f){
        float retiro;
        System.out.println("\nRETIROS");
        System.out.println("\nIngrese el retiro");
        retiro = CapturaEntrada.capturarFloat();
        retiro = f-retiro;
        return retiro;
        
    }

}