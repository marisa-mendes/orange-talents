package orange.talents.gerenciador.controller;

import orange.talents.gerenciador.entities.Veiculos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class VeiculosController {

    @RequestMapping("https://parallelum.com.br/fipe/api/v1/carros/marcas")
    @ResponseBody
    public List<Veiculos> lista() {
       Veiculos veiculos = new Veiculos("Agrale", "AMAROK High.CD 2.0 16V TDI 4x4 Dies. Aut", 2014);
    return Arrays.asList(veiculos, veiculos, veiculos);

    }
}