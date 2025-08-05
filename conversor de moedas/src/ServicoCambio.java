import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoCambio {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/884f797f2e2a5888955d837b/latest/USD";

    public static void conversor(String de, String para) throws IOException, InterruptedException {
        double taxa = obterTaxaCambio(de, para);

        System.out.print("Digite o valor a ser convertido: ");
        double valor = EntradaUsuario.lerValor();
        double resultado = valor * taxa;

        System.out.printf("Resultado: %.2f %s%n", resultado, para);
    }

    private static double obterTaxaCambio(String m1, String m2) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject taxas = json.getAsJsonObject("conversion_rates");

        double taxa1 = taxas.get(m1).getAsDouble();
        double taxa2 = taxas.get(m2).getAsDouble();

        return taxa2 / taxa1;
    }
}