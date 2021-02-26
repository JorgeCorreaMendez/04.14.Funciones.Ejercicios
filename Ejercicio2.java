import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero positivo: ");
        int factorial = errores(0);

        
        int factorialIterativo = factorialIterativo(factorial);
        System.out.println(factorial + "! = " + factorialIterativo + " (modo iterativo)");
        int factorialRecursivo = factorialRecursivo(factorial);
        System.out.println(factorial + "! = " + factorialRecursivo + " (modo recursivo)");
    }

    public static int factorialIterativo(int x) {
        int factorialIterativo = 1;

        for (int i = 1; i < x; i++) {
            factorialIterativo += factorialIterativo * i;
        }

        return factorialIterativo;
    }

    public static int factorialRecursivo(int x) {
        int factorialRecursivo = 1;

        for (int i = 1; i <= x; i++) {
            factorialRecursivo = factorialRecursivo * i;
        }

        return factorialRecursivo;
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

            if(x < 0){
                System.out.println("Error, no has introducido un número positivo ");
                System.out.println("Vuelva a intentarlo: ");
                error = true;
            } 
        } while (error);

        return x;
    }
}
