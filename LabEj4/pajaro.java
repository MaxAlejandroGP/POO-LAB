
public class pajaro{

String nombre, color, tamaño, estado;
int edad;

    public pajaro(String nombre, String tamaño, String estado, int edad){
        this.nombre=nombre;
        this.tamaño=tamaño;
        this.estado=estado;
        this.edad=edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }


    public void setTamaño(String tamaño){
        this.tamaño=tamaño;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getColor(){
        return color;
    }

    public String getTamaño(){
        return tamaño;
    }

    public String getEstado(){
        return estado;
    }

    public int getEdad(){
        return edad;
    }

}
//fin clase pajaro (superclase)