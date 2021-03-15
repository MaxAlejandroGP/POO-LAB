public class pajaros extends pajaro{

String ataque;
String color;

    public pajaros(String nombre, String tamaño, String estado, int edad, String color, String ataque){
    super(nombre,tamaño,estado,edad);
    this.color=color;
    this.ataque=ataque;
    }
    
    
    public void setColor(String color){
    this.color = color;
    }

    public void setAtaque(String ataque){
    this.ataque = ataque;
        
    }

    public String getColor(){
        return color;
    }

    public String getAtaque(){
        return ataque;
    }
}
//fin subclase/clase pajaros (clase hija)