package repodeprueba;

import java.util.Scanner;

public class EjemploArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de edades que deseas ingresar: ");
        int edad = scanner.nextInt();

        int[] numeros = new int[edad];

        for (int i = 0; i < edad; i++) {
            System.out.print("Ingresa la edad: " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los edades ingresadas son:");
        for (int numero : numeros) {
            if (numero >= 18) {

                System.out.println("Eres mayor de edad" + " y tu edad es: " + numero);
            } else {
                if (numero <= 18) {
                    System.out.println("Eres menor de edad" + " y tu edad es: " + numero);
                }
            }
        }

        scanner.close();
    }
}