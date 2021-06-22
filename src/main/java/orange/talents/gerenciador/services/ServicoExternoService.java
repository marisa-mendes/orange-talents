package orange.talents.gerenciador.services;

import orange.talents.gerenciador.controller.dto.RetornoApiDTO;
import orange.talents.gerenciador.entities.Veiculos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicoExternoService {

    private static final String URI = "https://parallelum.com.br/fipe/api/v1/carros/marcas";

    public RetornoApiDTO chamarApiExterna(Veiculos veiculos){
        RestTemplate rest = new RestTemplate();
        RetornoApiDTO retorno = rest.getForEntity(URI, RetornoApiDTO.class);

        return retorno;
    }
}
