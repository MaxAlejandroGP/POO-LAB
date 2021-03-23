import java.util.Scanner;

public class CapturaEntrada {

    public static String capturarString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int capturarInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static float capturarFloat(){
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}