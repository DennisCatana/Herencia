public class Futbolista extends Persona {
    private String equipo;
    private String posicion;
    private int numCamisena;
    private String representante;
    private int horas;


    //Constructor
    public Futbolista(){
        super();
    }
    public Futbolista(int CI, String nombre, String apellido, String direccion, int telefono, String signo,
                      int edad, String equipo, String posicion, int numCamisena, String representante, int horas) {
        super(CI, nombre, apellido, direccion, telefono, signo, edad);
        this.equipo = equipo;
        this.posicion = posicion;
        this.numCamisena = numCamisena;
        this.representante = representante;
        this.horas = horas;
    }


//Setters and Getters

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumCamisena() {
        return numCamisena;
    }

    public void setNumCamisena(int numCamisena) {
        this.numCamisena = numCamisena;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


    //
    public void correr(){
        System.out.println("Este es el método correr");
    }
    public void defender(){}

}
