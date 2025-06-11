package repodeprueba;

import java.util.Scanner;

public class Suma {

    public void sumaNumero(int numUno, int numDos) {
        int resultado = numUno + numDos;
        System.out.println("La suma de los dos numeros es: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Suma objSuma = new Suma();

        System.out.println("Ingresa el primer numero: ");
        int numUno = scanner.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int numDos = scanner.nextInt();

        objSuma.sumaNumero(numUno, numDos);
    }
}
