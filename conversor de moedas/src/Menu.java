public class Menu {
    public static void exibir() {
        System.out.println("\n ----------------- CONVERSOR DE MOEDAS ---------------");
        System.out.println("1. Dólar para Real");
        System.out.println("2. Real para Dólar");
        System.out.println("3. Dólar para Peso Argentino");
        System.out.println("4. Peso Argentino para Dólar");
        System.out.println("5. Dólar para Peso Colombiano");
        System.out.println("6. Peso Colombiano para Dólar");
        System.out.println("7. Sair");
        System.out.print("\nEscolha uma opção válida: ");
    }

    public static String[] obterMoedas(int opcao) {
        return switch (opcao) {
            case 1 -> new String[]{"USD", "BRL"};
            case 2 -> new String[]{"BRL", "USD"};
            case 3 -> new String[]{"USD", "ARS"};
            case 4 -> new String[]{"ARS", "USD"};
            case 5 -> new String[]{"USD", "COP"};
            case 6 -> new String[]{"COP", "USD"};
            default -> throw new IllegalStateException("Opção inválida");
        };
    }
}
