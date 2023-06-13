public class Menu {
    public static void main(String[] args) {
        Doctor Ana = new Doctor();
        EmpleadoPublico Pablo = new EmpleadoPublico();
        Futbolista Maritza = new Futbolista();
        Estudiante Melanie = new Estudiante();

        Ana.setNombre("Ana");
        Ana.setEdad(35);
        Ana.setSigno("Leo");
        System.out.println("\n"+Ana.getNombre()+" es Doctora");
        System.out.println("Tiene "+Ana.getEdad()+" años");
        System.out.println("Es de signo "+Ana.getSigno());
        Ana.examinar();

        Pablo.setNombre("\nPablo");
        Pablo.setTelefono(123456);
        System.out.println("\n"+Pablo.getNombre()+" es Empleado publico");
        System.out.println("Su teléfono es "+Pablo.getTelefono());
        Pablo.tramitar();

        Maritza.setNombre("\nMaritza");
        Maritza.setHoras(5);
        System.out.println(Maritza.getNombre()+" es Futbolista");
        System.out.println("Entrena "+Maritza.getHoras()+" horas diarias");
        Maritza.correr();

        Melanie.setNombre("\nMelanie");
        Melanie.setSemestre("Tercer");
        System.out.println(Melanie.getNombre()+" es Estudiante");
        System.out.println("Esta en "+Melanie.getSemestre()+" semestre");
        Melanie.memorizar();
    }
}