package iteso.libs.Biblioteca;

public class Usuario {
    //Atributos
    private String nombre;
    private String apellido;
    private String domicilio;
    private int edad;
    private int expediente;

    //Constructores
    public Usuario(String nombre, String apellido, String domicilio, int edad, int expediente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.expediente = expediente;

    }
}
