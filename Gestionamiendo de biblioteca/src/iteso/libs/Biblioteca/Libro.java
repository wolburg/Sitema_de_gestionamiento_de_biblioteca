package iteso.libs.Biblioteca;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;
    private int renta;
    //Prestamo de libros
    private boolean prestado;
    private String clientePrestamo;

    //Constructores
    public Libro(String titulo, String autor, int añoPublicacion, String genero, int renta) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.renta = renta;

    }

    @Override
    public String toString() {
        String estadoPrestamo = prestado ? "Prestado a: " + clientePrestamo : "Disponible";
        return "Libro [ Título = " + titulo + ", Autor = " + autor + ", Año = "
                + añoPublicacion + ", Género = " + genero + ", Precio de Renta = "+renta
                + ", Estado de prestamo =" + estadoPrestamo + "]";
    }

    //Setters de prestamos
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setClientePrestamo(String clientePrestamo) {
        this.clientePrestamo = clientePrestamo;
    }

    //Getters de prestamo
    public boolean isPrestado() {
        return prestado;}

    public String getClientePrestamo() {
        return clientePrestamo;
    }
}
