import java.io.IOException;
import java.util.Scanner;


// GONZALEZ PIMENTEL MAX ALEJANDRO 1272584 G541

public class practica3{
    
    public static void main(String[] args) throws IOException, InterruptedException{

        Scanner sc = new Scanner(System.in);


        Persona persona[] = new Persona[3];
        for (int i = 0; i <  3 ; i++){
            persona[i] = new Persona();
        }
        
        // PERSONA 1 (SOLO CURP)
        System.out.println("\n  PERSONA 1 (SOLO CURP)");

        persona[0].setNombre(CapturaEntrada.capturarString("\nNombre"));
        persona[0].setApellidopaterno(CapturaEntrada.capturarString("Apellido paterno"));
        persona[0].setApellidomaterno(CapturaEntrada.capturarString("Apellido materno"));
        persona[0].setSexo(CapturaEntrada.capturarString("Sexo (H para hombre, M para mujer)"));
        System.out.println("\nIngresa la clave de tu estado, por ejemplo Baja California (CLAVE: BC)");
        persona[0].setEntidad(CapturaEntrada.capturarString("Entidad"));
        System.out.println("\nIngresa tu fecha de nacimiento de forma AA//MM/DD por ejemplo: 98/07/01");
        persona[0].setFechanacimiento(CapturaEntrada.capturarString("Fecha de nacimiento"));

        System.out.println("\n  GENERANDO CURP");
        persona[0].getCurp();
        persona[0].mostrarCurp();
        
        // PERSONA 2 (SOLO RFC)
        System.out.println("\n  PERSONA 2 (SOLO RFC)");

        persona[1].setNombre(CapturaEntrada.capturarString("\nNombre"));
        persona[1].setApellidopaterno(CapturaEntrada.capturarString("Apellido paterno"));
        persona[1].setApellidomaterno(CapturaEntrada.capturarString("Apellido materno"));
        System.out.println("\nIngresa tu fecha de nacimiento de forma AA//MM/DD por ejemplo: 98/07/01");
        persona[1].setFechanacimiento(CapturaEntrada.capturarString("Fecha de nacimiento"));

        System.out.println("\n  GENERANDO RFC");
        persona[1].getRfc();
        persona[1].mostrarRfc();

        // PERSONA 3 (CURP Y RFC)
        System.out.println("\n  PERSONA 3 (RFC Y CURP)");

        persona[2].setNombre(CapturaEntrada.capturarString("\nNombre"));
        persona[2].setApellidopaterno(CapturaEntrada.capturarString("Apellido paterno"));
        persona[2].setApellidomaterno(CapturaEntrada.capturarString("Apellido materno"));
        persona[2].setSexo(CapturaEntrada.capturarString("Sexo (H para hombre, M para mujer)"));
        System.out.println("\nIngresa la clave de tu estado, por ejemplo Baja California (CLAVE: BC)");
        persona[2].setEntidad(CapturaEntrada.capturarString("Entidad"));
        System.out.println("\nIngresa tu fecha de nacimiento de forma AA//MM/DD por ejemplo: 98/07/01");
        persona[2].setFechanacimiento(CapturaEntrada.capturarString("Fecha de nacimiento"));

        System.out.println("\n  GENERANDO CURP Y RFC");
        persona[2].getCurp();
        persona[2].mostrarCurp();
        persona[2].getRfc();
        persona[2].mostrarRfc();

        
        
   }
}
