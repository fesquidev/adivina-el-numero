import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int maxIntentos = 10;
        boolean acertado = false;

        System.out.println("Bienvenido al juego de adivinar el número secreto.");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinar el número secreto.");

        while (intentos < maxIntentos) {
            System.out.print("Introduce tu intento (entre 1 y 100): ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                acertado = true;
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        if (acertado) {
            System.out.println("¡Felicidades! ¡Has adivinado el número secreto en " + intentos + " intentos!");
        } else {
            System.out.println("Lo siento, has agotado tus " + maxIntentos + " intentos. El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}
