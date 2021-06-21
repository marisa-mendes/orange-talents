package orange.talents.gerenciador.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Veiculos {

    @Column(nullable = false)
    private String marcas;

    @Column(nullable = false)
    private String modelos;

    @Column(nullable = false)
    private Integer anos;
}
