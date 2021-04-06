public class Animal{
    String especie;
    String nombre;
    int edad;
    String genero;
    boolean vacunado;

        public Animal(String especie, String nombre, int edad, String genero, boolean vacunado){
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.vacunado = vacunado;
        }
        

        public void Dormir(){
            System.out.println(nombre + ": duerme" );	
        }
        
        public void comer(){
            System.out.println(nombre + ": esta comiendo" );	
        }

        public void accion(){
            System.out.println(nombre + ": esta realizando una acción!" );	
        }
        
        public String getEspecie(){
            return especie;
        }
        
        public void setEspecie(String especie){
            this.especie = especie;
        }

        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getEdad(){
            return edad;
        }

        public void setEdad(int edad){
            this.edad = edad;
        }

        public String getGenero(){
            return genero;
        }
        
        public void setGenero(String genero){
            this.genero = genero;
        }

        public boolean getVacunado(){
            return vacunado;
        }
        
        public void setVacunado(Boolean vacunado){
            this.vacunado = vacunado;
        }

    }