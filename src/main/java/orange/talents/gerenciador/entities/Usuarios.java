package orange.talents.gerenciador.entities;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 9125277018717732648L;

    private Long id;

    private String cpf;

    private String email;

    private String nome;

    private LocalDate datanascimento;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Veiculos> veiculos = new ArrayList<>();

    public Usuarios(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id; }

    @Column(name = "cpf", nullable = false, unique = true)
    public  String getCpf(){return cpf;}

    @Column(name = "email", nullable = false, unique = true)
    public String getEmail(){return email;}

    @Column(name = "nome", nullable = false)
    public String getNome(){return nome;}

    @Column(name = "datanascimento", nullable = false)
    public LocalDate getDataNascimento(){return datanascimento;}


}
