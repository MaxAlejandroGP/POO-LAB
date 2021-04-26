public class RobotAyudanteManosCalientes extends Robot implements cocinarPlatillo{
    int controlTemperatura;

    public RobotAyudanteManosCalientes(String nombre, int bateria, int identificacion, int controlTemperatura){
        super(nombre,bateria,identificacion);
        this.controlTemperatura = controlTemperatura;
    }

    public int getControlTemperatura(){
        return controlTemperatura;
    }

    public void setControlTemperatura(int controlTemperatura){
        this.controlTemperatura = controlTemperatura;
    }

    public void cocinarGuiso() {
        System.out.println("El robot ayudante de manos calientes esta cocinando el guiso de carne y verduras");
        bateria = bateria - 5;
        controlTemperatura = controlTemperatura + 25;
    }
}