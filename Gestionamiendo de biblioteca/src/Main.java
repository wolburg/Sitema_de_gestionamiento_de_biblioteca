import iteso.libs.Biblioteca.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGestionBiblioteca sistema = new SistemaGestionBiblioteca();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.printf("\n");
            System.out.println("Sistema de Gestión de Biblioteca");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Registrar usuario");
            System.out.println("4. Realizar préstamo");
            System.out.println("5. Realizar devolución");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de lectura

            switch (opcion) {
                case 1:
                    sistema.registrarLibro();
                    break;
                case 2:
                    sistema.mostrarLibros();
                    break;
                case 3:
                    sistema.registrarUsuarios();
                    break;
                case 4:
                    sistema.registrarPrestamo();
                    break;
                case 5:
                    sistema.devolverlibro();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
}
