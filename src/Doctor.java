public class Doctor extends Persona{
    private String especialidad;
    private String horario;
    private String codigo;

    //Constructor
    public Doctor(){
        super();
    }
    public Doctor(int CI, String nombre, String apellido, String direccion, int telefono, String especialidad,
                  String horario, String codigo) {
        super();

        //Atributos propios
        this.especialidad = especialidad;
        this.horario = horario;
        this.codigo = codigo;
    }


    //Setters and Getters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    //
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void examinar(){
        System.out.println("Este es el método examinar");
    }
    public void curar(){}

}

