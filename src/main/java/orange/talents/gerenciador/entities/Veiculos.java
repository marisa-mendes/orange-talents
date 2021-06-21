package orange.talents.gerenciador.entities;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Component
@Table(name = "veiculos")
public class Veiculos implements Serializable {

    private static final long serialVersionUID = 9125277018717732648L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Object")
    private Long id;

    @Column(nullable = false)
    private String marcas;

    @Column(nullable = false)
    private String modelos;

    @Column(nullable = false)
    private Integer anos;
}
