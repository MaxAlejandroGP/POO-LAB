import java.util.Scanner;

public class CapturaEntrada{

	public static String capturarString(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+"");
		return (sc.nextLine());
	}

	public static int capturarInt(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ "");
		return (sc.nextInt());
	}

    public static double capturarDouble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ "");
		return (sc.nextDouble());
	}

    public static float capturarFloat(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ "");
		return (sc.nextFloat());
	}

    public static boolean capturarBoolean(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+ msg+ "");
		return (sc.nextBoolean());
	}
}