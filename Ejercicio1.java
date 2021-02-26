import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int n = errores(0);

        System.out.println("La suma de 1 a " + n + " es: " + suma1aN(n));
        System.out.println("El productorio de 1 a " + n + " es: " + producto1aN(n));
        System.out.println("El promedio de la suma de 1 a " + n + " es: " + promedio1aN(n));

    }

    public static int suma1aN(int x) {
        int sumaEnteros = 0;

        for (int i = 1; i <= x; i++) {
            sumaEnteros += i;
        }

        return sumaEnteros;
    }

    public static int producto1aN(int x) {
        int productoEnteros = 1;

        for (int i = 1; i < x; i++) {
            productoEnteros += productoEnteros * i;
        }

        return productoEnteros;
    }

    public static double promedio1aN(int x) {
        double promedioEnteros = suma1aN(x);
        promedioEnteros = promedioEnteros / x;

        return promedioEnteros;
    }

    public static int errores(int x) {
        Scanner leer = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                x = leer.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + e);
                System.out.println("Vuelva a intentarlo: ");
                leer.nextLine();
            }
        } while (error);

        return x;
    }
}