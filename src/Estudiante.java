public class Estudiante extends Persona{
    private int  codigo;
    private String correo;
    private String carrera;
    private String semestre;
    private int edad;


    //Constructor
    public Estudiante(){
        super();
    }
    public Estudiante(int CI, String nombre, String apellido, String direccion, int telefono,
                      int codigo, String correo, String carrera,String semestre,int edad) {
        super();

        //atributos propios
        this.codigo=codigo;
        this.correo=correo;
        this.carrera=carrera;
        this.semestre=semestre;
        this.edad=edad;
    }


    //Setters and Getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //
    public void estudiar(){
        System.out.println("Este es el método estudiar que pertenece a estudiante");
    }
    public void leer(){
        System.out.println("Este es el método leer ");
    }
    public void memorizar(){
        System.out.println("Este es el método memorizar que pertenece a estudiante");
    }
}
