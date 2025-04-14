package br.ulbra.util;

import br.ulbra.entity.endereco;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ViaCepService {

    public static endereco buscarEnderecoPorCep(String cep) {
        endereco endereco = new endereco();
        try {
            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject obj = new JSONObject(response.toString());

            if (!obj.has("erro")) {
                endereco.setCep(obj.getString("cep"));
                endereco.setLogradouro(obj.getString("logradouro"));
                endereco.setBairro(obj.getString("bairro"));
                endereco.setLocalidade(obj.getString("localidade"));
                endereco.setUf(obj.getString("uf"));
            } else {
                System.out.println("CEP não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar endereço: " + e.getMessage());
        }

        return endereco;
    }
}
