public class ConversorMoedas {
    public static void main(String[] args) {
        boolean rodar = true;

        while (rodar) {
            Menu.exibir();
            int opcao = EntradaUsuario.lerOpcao();

            if (opcao >= 1 && opcao <= 6) {
                String[] moedas = Menu.obterMoedas(opcao);
                try {
                    ServicoCambio.conversor(moedas[0], moedas[1]);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (opcao == 7) {
                System.out.println("Saindo...");
                rodar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        EntradaUsuario.fecharScanner();
    }
}

