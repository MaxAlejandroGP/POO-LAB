public abstract class Robot{
    int bateria, identificacion;
    String nombre;

    public Robot(String nombre, int bateria, int identificacion){
        this.nombre = nombre;
        this.bateria = bateria;
        this.identificacion = identificacion;

    }    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getBateria(){
        return bateria;
    }

    public void setBateria(int bateria){
        this.bateria = bateria;
    }

    public int getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
}