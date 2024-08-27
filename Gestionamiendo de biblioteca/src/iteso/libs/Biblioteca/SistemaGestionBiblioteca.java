package iteso.libs.Biblioteca;

import javax.swing.JOptionPane;

import java.util.ArrayList; /*Importa la clase ArrayList del paquete java.util,
que es una implementación de la interfaz List para almacenar y manipular una lista de elementos.*/

import java.util.List; /*Importa la interfaz List del paquete java.util,
 que define el comportamiento de una lista ordenada de elementos.*/


import java.util.Random;
import java.util.Scanner;  /* Importa la clase Scanner del paquete java.util,
que permite leer la entrada del usuario desde la consola.*/

import iteso.libs.Biblioteca.Libro;

public class SistemaGestionBiblioteca {

    //Atributos
    private List<Libro> libros; //lista llamada libros que almacenará objetos de tipo Libro.
    private List<Usuario> Usuarios;
    public static int i = 1;
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public SistemaGestionBiblioteca() {
        libros = new ArrayList<>();
        Usuarios = new ArrayList<>();
    } //Se encarga de inicializar la lista de libros y usuarios como un nuevo ArrayList.


    //Setters

    public void registrarLibro() {
        Scanner scanner = new Scanner(System.in); //Crea una instancia de la clase Scanner para leer la entrada del usuario desde la consola.

        System.out.println("Ingrese el Título del Libro:");
        String titulo = scanner.nextLine(); //Lee la línea de texto ingresada por el usuario y la asigna a la variable titulo.

        System.out.println("Ingrese el Autor del Libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el Género del Libro:");
        String genero = scanner.nextLine();

        System.out.println("Ingrese el Año de Publicación del Libro:");
        int añoPublicacion = scanner.nextInt();

        System.out.println("Ingrese el Precio de Renta:");
        int renta = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer de lectura (duda)

        // Crear una instancia de Libro con los datos ingresados
        Libro libro = new Libro(titulo, autor, añoPublicacion, genero, renta);

        // Agregar el libro a la lista de libros
        libros.add(libro);

        System.out.println("Libro Registrado Exitosamente.");
        System.out.printf("\n");
    }

    //Metodos

    /*
    El objetivo del siguente metodo es  recorre la lista de libros y mostrar  la información
    de cada uno de ellos en la consola,
     siempre y cuando haya libros registrados en la biblioteca
     */

    public void mostrarLibros() {
        if (libros.isEmpty()) { //Verifica si la lista de libros está vacía utilizando el método isEmpty()
            System.out.println("No hay Libros Registrados.");
            System.out.printf("\n");
        } else {
            System.out.println("Lista de Libros Registrados:");
            for (Libro libro : libros) {
                System.out.println(libro);

            }
        }
    }

    public void registrarUsuarios() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del Socio:");
        String nombre = scanner.nextLine();

        System.out.println("Apellidos del Socio:");
        String apellido = scanner.nextLine();

        System.out.println("Domicilio:");
        String domicilio = scanner.nextLine();

        System.out.println("Edad:");
        int edad = scanner.nextInt();

        System.out.println("Número de Expediente:");
        int expediente = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer de lectura (duda)

        // Crear una instancia de Usuario con los datos ingresados
        Usuario Usuario = new Usuario(nombre, apellido, domicilio, edad, expediente);

        // Agregar el usuario a la lista de usuarios
        Usuarios.add(Usuario);

        System.out.println("Usuario registrado exitosamente.");
        System.out.printf("\n");
    }

    public void rentarLibros() {
        if (libros.isEmpty()) { //Verifica si la lista de libros está vacía utilizando el método isEmpty()
            System.out.println("No hay libros para rentar.");
            System.out.printf("\n");
        } else {
            System.out.println("Lista de libros registrados:");
            for (Libro libro : libros) {
                System.out.println(libro);

            }
        }

    }

    public void devolucionLibros() {
        if (libros.isEmpty()) { //Verifica si la lista de libros está vacía utilizando el método isEmpty()
            System.out.println("No hay libros para rentar.");
            System.out.printf("\n");
        } else {
            System.out.println("Lista de libros registrados:");
            for (Libro libro : libros) {
                System.out.println(libro);

            }
        }

    }

    //Gestion de prestamo de libros
    public void registrarPrestamo() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles para prestar.");
        } else {
            System.out.println("Lista de libros disponibles:");
            mostrarLibros();

            System.out.println("Ingrese el número del libro que desea prestar:");
            int numeroLibro = scanner.nextInt();

            if (numeroLibro < 1 || numeroLibro > libros.size()) {
                System.out.println("Numero de libros prestado invalido");
            } else {
                Libro libro = libros.get(numeroLibro - 1);

                if (libro.isPrestado()) {
                    System.out.println("El libro se encuentra prestado.");
                } else {
                    System.out.println("Ingrese el nombre del cliente que realiza el préstamo:");
                    scanner.nextLine(); // Limpia el buffer de lectura
                    String nombreCliente = scanner.nextLine(); // Lee el nombre del cliente
                    libro.setPrestado(true); // Marca el libro como prestado
                    libro.setClientePrestamo(nombreCliente); // Asigna el cliente que realiza el préstamo al libro

                    System.out.println("Préstamo registrado exitosamente.");

                }
            }
        }
    }

    public void devolverlibro() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros para devolver");
        } else {
            System.out.println("Lista de libros prestados:");
            for (Libro libro : libros) {
                if (libro.isPrestado()) {
                    System.out.println(libro); // Muestra los libros que están prestados
                }
            }
            System.out.println("Ingrese el número del libro que desea devolver:");
            int numeroLibro = scanner.nextInt(); // Lee el número del libro que el usuario desea devolver

            if (numeroLibro < 1 || numeroLibro > libros.size()) {
                System.out.println("Número de libro inválido.");
            }
            else {
                Libro libro = libros.get(numeroLibro - 1); // Obtiene el libro seleccionado de la lista de libros

                if (!libro.isPrestado()) {
                    System.out.println("El libro seleccionado no está prestado.");
                }
                else
                    libro.setPrestado(false); // Marca el libro como no prestado
                libro.setClientePrestamo(null); // Borra el cliente asociado al libro

                System.out.println("Devolución realizada exitosamente.");


            }

        }
    }
}
