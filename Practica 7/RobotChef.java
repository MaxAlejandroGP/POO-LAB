public class RobotChef extends Robot implements servirPlatillo{
    
    public RobotChef(String nombre, int bateria, int identificacion){
        super(nombre,bateria,identificacion);
    }

    public void servirGuisoEnTazon() {
        System.out.println("El robot chef esta sirviendo el guiso en el tazón");
        bateria = bateria - 5;
    }

}