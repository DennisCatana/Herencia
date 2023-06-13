public class Persona {
    private int CI;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String signo;
    private int edad;


    //Constructor
    public Persona(){
        super();
    }
    public Persona(int CI, String nombre, String apellido, String direccion, int telefono, String signo, int edad) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.signo = signo;
        this.edad=edad;
    }


    //Getters and Setters

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //
    public void caminar(){
        System.out.println("Este es el método de caminar que pertenece a persona");
    }
    public void trabajar(){
        System.out.println("Este es el método de trabajar que pertenece a persona");
    }
}
