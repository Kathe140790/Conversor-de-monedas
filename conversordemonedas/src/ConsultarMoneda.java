import com.google.gson.Gson;

import modelo.MonedaAPI;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public MonedaAPI buscarMoneda(String monedaBase, String monedaObjetivo){

        String apiKey = "4d68c38479b3b4fedd1f3a0c";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase +"/"+ monedaObjetivo+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                              .uri(direccion)
                              .build();

        try {
            //respuesta
            HttpResponse<String> response =  client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            return new Gson().fromJson(json,MonedaAPI.class);

        } catch (Exception e) {
            throw new RuntimeException(" No encontre la moneda que quieres convertir");
        }
    }
}
