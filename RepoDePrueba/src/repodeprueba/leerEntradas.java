package repodeprueba;

public class leerEntradas {

    public class usuario {

        String nombre;
        String apellido;
        String email;
        int edad;

        public usuario() {
            // Contructor vacío
        }

        // Constructor de la clase usuario
        public usuario(String nombre, String apellido, String email, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.edad = edad;
        }

        public void leerEntradas() {
            System.out.println("Ingresa tu nombre:");
            this.nombre = System.console().readLine();
            System.out.println("Ingresa tu apellido:");
            this.apellido = System.console().readLine();
            System.out.println("Ingresa tu email:");
            this.email = System.console().readLine();
            System.out.println("Ingresa tu edad:");
            String edadStr = System.console().readLine();
            try {
                this.edad = Integer.parseInt(edadStr);
            } catch (NumberFormatException e) {
                System.out.println("Edad inválida, se establecerá a 0.");
                this.edad = 0;
            }
        }

    }

    public static void main(String[] args) {


        
    }
}
