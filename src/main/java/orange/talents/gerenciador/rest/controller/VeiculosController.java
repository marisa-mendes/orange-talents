package orange.talents.gerenciador.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class VeiculosController {

    @RequestMapping("https://parallelum.com.br/fipe/api/v1")
    @ResponseBody
    public String ConsultarVeiculos (@PathVariable String marcaVeiculos){
        return String.format( "A marca do veículo é %s", marcaVeiculos);
    }


}
