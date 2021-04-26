public class RobotAyudanteCuchillos extends Robot implements cortarIngredientes{
    int corte;

    public RobotAyudanteCuchillos(String nombre, int bateria, int identificacion, int corte){
        super(nombre,bateria,identificacion);
        this.corte = corte;
    }

    public int getCorte(){
        return corte;
    }

    public void setCorte(int corte){
        this.corte = corte;
    }

    public void cortarCarne() {
        System.out.println("El robot ayudante de cuchillos esta cortando la carne");
        bateria = bateria - 5;
        corte = corte +1;
    }

    public void cortarVerduras() {
        System.out.println("El robot ayudante de cuchillos esta cortando las verduras");
        bateria = bateria - 5;
        corte = corte +1;
    }

}