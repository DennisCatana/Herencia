public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;


    //Constructor
    public EmpleadoPublico(){
        super();
    }
    public EmpleadoPublico(int CI, String nombre, String apellido, String direccion, int telefono, String signo, int edad, String puesto, String cargo) {
        super(CI, nombre, apellido, direccion, telefono, signo, edad);
        this.puesto = puesto;
        this.cargo = cargo;
    }


    //Setters and Getters
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    //
    public void tramitar(){
        System.out.println("Este es el método examinar");
    }

}
