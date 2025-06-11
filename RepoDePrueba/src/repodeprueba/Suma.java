package repodeprueba;

import java.util.Scanner;

class Multi {

    public void multiplicacionNumero(int numUno, int numDos) {
        int resultado = numUno * numDos;
        System.out.println("La multiplicacion de los dos numeros son: " + resultado);
    }
}

class Division {

    public void divisionNumeros(int numUno, int numDos) {
        if (numDos == 0) {
            System.out.println("Error: No se puede dividir entre cero");
        } else {
            int resultado = numUno / numDos;
            System.out.println("La division es: " + resultado);
        }
    }
}

class Resta {

    public void restaNumeros(int numUno, int numDos) {
        int resultado = numUno - numDos;
        System.out.println("La resta es: " + resultado);
    }
}

public class Suma {

    public void sumaNumero(int numUno, int numDos) {
        int resultado = numUno + numDos;
        System.out.println("La suma de los dos numeros es: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suma objSuma = new Suma();
        Multi objMulti = new Multi();
        Division objDiv = new Division();
        Resta objResta = new Resta();
        int opcion = 0;
        do {

            System.out.println("1. Suma");
            System.out.println("2. Multiplicacion");
            System.out.println("3. Division");
            System.out.println("4. Resta");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer numero: ");
                    int numUno = scanner.nextInt();
                    System.out.println("Ingresa el segundo numero: ");
                    int numDos = scanner.nextInt();
                    objSuma.sumaNumero(numUno, numDos);
                    break;
                case 2:
                    System.out.println("Ingresa un numero: ");
                    numUno = scanner.nextInt();
                    System.out.println("Ingresa otro numero");
                    numDos = scanner.nextInt();
                    objMulti.multiplicacionNumero(numUno, numDos);
                    break;
                case 3:
                    System.out.println("Ingresa un numero: ");
                    numUno = scanner.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    numDos = scanner.nextInt();
                    objDiv.divisionNumeros(numUno, numDos);
                    break;
                case 4:
                    System.out.println("Ingresa un numero: ");
                    numUno = scanner.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    numDos = scanner.nextInt();
                    objResta.restaNumeros(numUno, numDos);
                    break;
                case 5:
                    scanner.nextLine(); // limpiar buffer
                    System.out.println("¿Quieres seguir en el menú? (si/no): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        opcion = 0; // para que el ciclo siga
                    } else {
                        System.out.println("Saliste del programa");
                        opcion = 5; // para salir del ciclo
                    }
                    break;
            }
        } while (opcion != 5);
    }
}
