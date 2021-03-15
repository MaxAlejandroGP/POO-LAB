public class mipersonaje extends pajaro{

String ataque;
String color;
String usuario;

    public mipersonaje(String usuario, String nombre, String tamaño, String estado, int edad, String color, String ataque){
    super(nombre,tamaño,estado,edad);
    this.color=color;
    this.ataque=ataque;
    this.usuario=usuario;
    }
    
    
    public void setColor(String color){
    this.color = color;
    }

    public void setAtaque(String ataque){
    this.ataque = ataque;  
    }

    public void setUsuario(String usuario){
    this.usuario = usuario;  
    }

    public String getColor(){
        return color;
    }

    public String getAtaque(){
        return ataque;
    }

    public String getUsuario(){
        return usuario;
    }
    
}
//Fin sub-clase/clase mipersonaje (clase hija)