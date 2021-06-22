package orange.talents.gerenciador.entities;


import io.swagger.annotations.ApiModelProperty;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Component
@Table(name = "veiculos")
public class Veiculos implements Serializable {

    private static final long serialVersionUID = 9125277018717732648L;

    private Long id;
    private String marcas;
    private String modelos;
    private Integer anos;

    public Veiculos(){ }


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @ApiModelProperty(value = "Object")
//    private Long id;

//    @Column(nullable = false)
//    private String marcas;

//    @Column(nullable = false)
//    private String modelos;
//
//    @Column(nullable = false)
//    private Integer anos;
}
