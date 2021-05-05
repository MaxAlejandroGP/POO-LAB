public class torneo{

    String nombre, region;
    int numeroParticipantes, partidosJugados, partidosPendientes;
    equipo[] equipo;


    /*
    public torneo(String nombre, String region, int numeroParticipantes, int partidosJugados, int partidosPendientes){
        this.nombre = nombre;
        this.region = region;
        this.numeroParticipantes = numeroParticipantes;
        this.partidosJugados = partidosJugados;
        this.partidosPendientes = partidosPendientes;

    }    
    */

    public equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(int numeroParticipantes){
        equipo = new equipo[numeroParticipantes];

        for(int i=0; i<equipo.length; i++){
            equipo[i] = new equipo();
            equipo[i].setNombreEquipo(CapturaEntrada.capturarString("\nNombre del equipo "+(i+1)+": "));
            equipo[i].setNumJug(CapturaEntrada.capturarInt("Numero de jugadores: "));
            equipo[i].setDivision(CapturaEntrada.capturarString("Division del equipo: "));
            equipo[i].setNombreEntrenador(CapturaEntrada.capturarString("Nombre del entrenador: "));
            equipo[i].setTorneosParticipacion(CapturaEntrada.capturarInt("Torneos participados: "));
            equipo[i].setTorneosGanados(CapturaEntrada.capturarInt("Torneos ganados: "));
            equipo[i].setTorneosPerdidos(CapturaEntrada.capturarInt("Torneos perdidos: "));
            equipo[i].setJugador(equipo[i].getNumJug());
        }
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRegion(){
        return region;
    }
    
    public void setRegion(String region){
        this.region = region;
    }
    
    public int getNumeroParticipantes(){
        return numeroParticipantes;
    }
    
    public void setNumeroParticipantes(int numeroParticipantes){
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getPartidosJugados(){
        return partidosJugados;
    }
    
    public void setPartidosJugados(int partidosJugados){
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes(){
        return partidosPendientes;
    }
    
    public void setPartidosPendientes(int partidosPendientes){
        this.partidosPendientes = partidosPendientes;
    }

    public void mostrarDatos(){
        for(int i=0; i<equipo.length; i++){
            System.out.println("\nNombre del equipo: "+equipo[i].getNombreEquipo());
            System.out.println("\nDivision: "+equipo[i].getDivision());
            equipo[i].mostrarDatos();
        }
    }

}