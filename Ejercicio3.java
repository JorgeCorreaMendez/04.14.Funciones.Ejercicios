import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número tipo long: ");
        long nPalindromo = erroresNumeros(0);

        long longpalindromo = esPalindromo(nPalindromo);

        if (longpalindromo == 1) {
            System.out.println("El número entero largo (long) " + nPalindromo + " es palíndromo");
        } else {
            System.out.println("El número entero largo (long) " + nPalindromo + " no es palíndromo");
        }

        System.out.println("----------------------------------");

        System.out.print("Introduzca una cadena: ");
        String cPalindromo = erroresCadena("");
        String cadenaPalindromo = esPalindromo(cPalindromo);

        System.out.println(cadenaPalindromo);

    }

    public static long esPalindromo(Long x) {
        long natural = x;
        String cadenaNatural = natural + "";
        String cadenanaturalInvertida = "";

        for (int i = cadenaNatural.length() - 1; i >= 0; i--) {
            cadenanaturalInvertida += cadenaNatural.charAt(i);
        }

        natural = Integer.parseInt(cadenaNatural);
        long natural_Invertida = Integer.parseInt(cadenanaturalInvertida);

        if (natural == natural_Invertida) {
            return 1;
        } else {
            return 2;
        }
    }

    public static String esPalindromo(String x) {
        String cadena = x;
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        if (cadena.equals(cadenaInvertida)) {
            return ("El número entero largo (long) " + x + " es palíndromo");
        } else {
            return ("El número entero largo (long) " + x + " no es palíndromo");
        }
    }

    public static int erroresNumeros(int x) {
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

    public static String erroresCadena(String x) {
        Scanner leer = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                x = leer.next();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido una cadena " + e);
                System.out.println("Vuelva a intentarlo: ");
                leer.nextLine();
            }
        } while (error);

        return x;
    }
}
