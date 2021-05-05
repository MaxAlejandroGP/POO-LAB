public class jugador{

    String nombre,posicion;
    int numUniforme, puntosAnotados;
    double estatura;

    /*
    public jugador(String nombre, int numUniforme, int puntosAnotados, int posicion, double estatura){
        this.nombre = nombre;
        this.numUniforme = numUniforme;
        this.puntosAnotados = puntosAnotados;
        this.posicion = posicion;
        this.estatura = estatura;

    }    
    */
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumUniforme(){
        return numUniforme;
    }
    
    public void setNumUniforme(int numUniforme){
        this.numUniforme = numUniforme;
    }

    public int getPuntosAnotados (){
        return puntosAnotados;
    }
    
    public void setPuntosAnotados(int puntosAnotados){
        this.puntosAnotados = puntosAnotados;
    }

    public String getPosicion (){
        return posicion;
    }
    
    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public Double getEstatura (){
        return estatura;
    }
    
    public void setEstatura(Double estatura){
        this.estatura = estatura;
    }

}