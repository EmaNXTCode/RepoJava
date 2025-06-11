package repodeprueba;

import java.util.Scanner;

class Persona {

    private String nombre, apellido, direccion;
    private int edad;
    long telefono;

    public Persona(String nombre, String apellido, String direccion, int edad, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("La direccion es: " + direccion);
        System.out.println("La edad es: " + edad);
        System.out.println("El telefono es: " + telefono);
    }
}

public class PersonaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa el nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingresa el apellido: ");
            String apellido = scanner.nextLine();

            System.out.println("Ingresa la direccion: ");
            String direccion = scanner.nextLine();

            System.out.println("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.println("Ingresa el numero de telefono: ");
            long telefono = scanner.nextLong();
            scanner.nextLine(); // Limpiar buffer

            Persona persona = new Persona(nombre, apellido, direccion, edad, telefono);
            System.out.println("\nDatos ingresados:");
            persona.mostrarDatos();

            System.out.println("\n¿Quieres ingresar otra persona? (1=Sí, 2=No)");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

        } while (opcion == 1);

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
