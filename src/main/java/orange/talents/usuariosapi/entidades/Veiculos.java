package orange.talents.usuariosapi.entidades;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@Builder
public class Veiculos {

    @Column(nullable = false)
    private String marcas;

    @Column(nullable = false)
    private String modelos;

    @Column(nullable = false)
    private Integer anos;
}
