public class equipo{

    String nombreEquipo, division, nombreEntrenador;
    int torneosParticipacion, torneosGanados, torneosPerdidos;
    jugador[] jugador;

    int numJug;

    
    /*
    public equipo(String nombre, String division, String nombreEntrenador, int torneosParticipacion, int torneosGanados, int torneosPerdidos){
        this.nombre = nombre;
        this.division = division;
        this.nombreEntrenador = nombreEntrenador;
        this.torneosParticipacion = torneosParticipacion;
        this.torneosGanados = torneosGanados;
        this.torneosPerdidos = torneosPerdidos;

    }    
    */

    public jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(int numJug){
        jugador = new jugador[numJug];
        
        int flag1;
        
        for (int i = 0; i < numJug; i++){
            jugador[i]= new jugador();
            System.out.println("\nJugador "+(i+1));
            jugador[i].setNombre(CapturaEntrada.capturarString("Nombre del jugador: "));
            if(i==0){
                flag1=1;
            }
            else{
                flag1=0;
            }
            do{
                jugador[i].setNumUniforme(CapturaEntrada.capturarInt("Numero del uniforme: "));
                for(int j=0; j<i; j++){
                    if(jugador[i].getNumUniforme()==jugador[j].getNumUniforme()){
                        System.out.println("\nNo se permiten numeros de uniforme repetidos entre equipo");
                        break;
                    }
                    else{
                        flag1=1;
                    }
                }
            }while(flag1!=1);
            jugador[i].setPuntosAnotados(CapturaEntrada.capturarInt("Puntos anotados: "));
            jugador[i].setPosicion(CapturaEntrada.capturarString("Posicion: "));
            jugador[i].setEstatura(CapturaEntrada.capturarDouble("Estatura:"));

        }
      } 

    public int getNumJug() {
        return numJug;
    }

    public void setNumJug(int numJug) {
        this.numJug = numJug;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    public String getDivision(){
        return division;
    }
    
    public void setDivision(String division){
        this.division = division;
    }

    public String getNombreEntrenador(){
        return nombreEntrenador;
    }
    
    public void setNombreEntrenador(String nombreEntrenador){
        this.nombreEntrenador = nombreEntrenador;
    }
    
    public int getTorneosParticipacion(){
        return torneosParticipacion;
    }
    
    public void setTorneosParticipacion(int torneosParticipacion){
        this.torneosParticipacion = torneosParticipacion;
    }

    public int getTorneosGanados(){
        return torneosGanados;
    }
    
    public void setTorneosGanados(int torneosGanados){
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos(){
        return torneosPerdidos;
    }
    
    public void setTorneosPerdidos(int torneosPerdidos){
        this.torneosPerdidos = torneosPerdidos;
    }

    public int registro(jugador[] jugador){
        int registrados;
        registrados=jugador.length;
        return registrados;
    }

    public int puntosTotales(jugador[] jugador){
        int puntosTotales=0;
        for (int  i=0; i<jugador.length; i++){
            puntosTotales=puntosTotales+jugador[i].getPuntosAnotados();
        }
        return puntosTotales;
    }

    public void mostrarDatos(){
        for(int i=0; i<jugador.length; i++){
            System.out.println("\nJugador "+(i+1));
            System.out.println("Nombre: "+jugador[i].getNombre());
            System.out.println("Numero de uniforme: "+jugador[i].getNumUniforme());
        }
        System.out.println("\nJugadores registrados en el equipo: "+registro(jugador));
        System.out.println("Suma de los puntos totales anotados por los jugadores: "+puntosTotales(jugador));
    }
}