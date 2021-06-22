package orange.talents.gerenciador.controller;

import orange.talents.gerenciador.controller.dto.RetornoApiDTO;
import orange.talents.gerenciador.entities.Veiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros/marcas")
public class VeiculosController {

    @Autowired
    private ServicoExternoservice service;

    @GetMapping
    public ResponseEntity exemplo(Veiculos veiculos){
        RetornoApiDTO retorno = service.chamarApiExterna(veiculos);
        return ResponseEntity.ok(retorno);


    }
}