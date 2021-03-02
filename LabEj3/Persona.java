import java.util.Random;

public class Persona{
    String nombre, apellidopaterno, apellidomaterno, sexo, entidad,fechanacimiento;
    String curp, rfc;

    public void setNombre(String nom){
        nombre = nom.toUpperCase();
    }

    public void setApellidopaterno(String apepa){
        apellidopaterno = apepa.toUpperCase();
    }

    public void setApellidomaterno(String apema){
        apellidomaterno = apema.toUpperCase();
    }

    public void setSexo(String sex){
        sexo = sex.toUpperCase();
    }

    public void setEntidad(String ent){
        entidad = ent.toUpperCase();
    }

    public void setFechanacimiento(String fnac){
        fechanacimiento = fnac.replace("/","");
    }

    public String getNombre(){
        return nombre;
    } 

    public String getApellidopaterno(){
        return apellidopaterno;
    } 

    public String getApellidomaterno(){
        return apellidomaterno;
    } 

    public String getSexo(){
        return sexo;
    } 

    public String getEntidad(){
        return entidad;
    } 
        

    public String getFechanacimiento(){
        return fechanacimiento;
    } 

    public String getCurp(){

        curp = new String();
        curp += apellidopaterno.charAt(0);

        for (int i = 1; i < apellidopaterno.length(); i++) {
            if((apellidopaterno.charAt(i) == 'A')||(apellidopaterno.charAt(i) == 'E') || (apellidopaterno.charAt(i) == 'I') || (apellidopaterno.charAt(i) =='O')|| (apellidopaterno.charAt(i) == 'U')){
                curp += apellidopaterno.charAt(i);
                break;
            }
        }
        
        curp += apellidomaterno.charAt(0);
        curp += nombre.charAt(0);
        curp += fechanacimiento;
        curp += sexo;
        curp += entidad;

        for (int i = 1; i < apellidopaterno.length(); i++) {
            if((apellidopaterno.charAt(i) != 'A')&&(apellidopaterno.charAt(i) != 'E') && (apellidopaterno.charAt(i) != 'I') && (apellidopaterno.charAt(i) !='O')&& (apellidopaterno.charAt(i) != 'U')){
                curp += apellidopaterno.charAt(i);
                break;
            }
        }

        for (int i = 1; i < apellidomaterno.length(); i++) {
            if((apellidomaterno.charAt(i) != 'A')&&(apellidomaterno.charAt(i) != 'E') && (apellidomaterno.charAt(i) != 'I') && (apellidomaterno.charAt(i) !='O')&& (apellidomaterno.charAt(i) != 'U')){
                curp += apellidomaterno.charAt(i);
                break;
            }
        }

        for (int i = 1; i < nombre.length(); i++) {
            if((nombre.charAt(i) != 'A')&&(nombre.charAt(i) != 'E') && (nombre.charAt(i) != 'I') && (nombre.charAt(i) !='O')&& (nombre.charAt(i) != 'U')){
                curp += nombre.charAt(i);
                break;
            }
        }

        Random rng = new Random();
        char c = (char) ('A' + rng.nextInt(26));
        
        curp += c;

        int rng1= rng.nextInt(10);

        curp += rng1;

        return curp;
    }

    public String getRfc(){
        rfc = new String();

        rfc += apellidopaterno.charAt(0);

        for (int i = 1; i < apellidopaterno.length(); i++) {
            if((apellidopaterno.charAt(i) == 'A')||(apellidopaterno.charAt(i) == 'E') || (apellidopaterno.charAt(i) == 'I') || (apellidopaterno.charAt(i) =='O')|| (apellidopaterno.charAt(i) == 'U')){
                rfc += apellidopaterno.charAt(i);
                break;
            }
        }

        rfc += apellidomaterno.charAt(0);
        rfc += nombre.charAt(0);
        rfc += fechanacimiento;

        Random rnd = new Random();
        int rnd1= rnd.nextInt(10);
        rfc += rnd1;

        char ch = (char) ('A' + rnd.nextInt(26));
        rfc += ch;

        char ch1 = (char) ('A' + rnd.nextInt(26));
        rfc += ch1;


        return rfc;
    }

    public void mostrarCurp(){
        System.out.println("\nCURP: "+curp);
    }

    public void mostrarRfc(){
        System.out.println("\nRFC: "+rfc);
    }
}