package orange.talents.gerenciador.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("https://parallelum.com.br/fipe/api/v1/carros/marcas")
public class VeiculosController {

    @RequestMapping(value = "/veiculos/{marca}", method = RequestMethod.GET)
    @ResponseBody
    public String ConsultarVeiculos (@PathVariable String marcaVeiculos){
        return String.format( "A marca do veículo é %s", marcaVeiculos);
    }


}
