import java.util.Scanner;

public class EntradaUsuario {
    private static final Scanner scanner = new Scanner(System.in);

    public static int lerOpcao() {
        while (!scanner.hasNextInt()) {
            System.out.println("Digite um número válido:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double lerValor() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Digite um valor válido:");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static void fecharScanner() {
        scanner.close();
    }
}
