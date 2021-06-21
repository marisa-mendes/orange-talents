package orange.talents.gerenciador.model;

import orange.talents.gerenciador.entities.Veiculos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuarios implements Serializable {

    private static  final long serialVersionUID = 1L;

    private String cpf;
    private String email;
    private String nome;
    private LocalDate DataNascimento;
    private List<Veiculos> veiculos = new ArrayList<>();

    public Usuarios(){
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculos> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuarios)) return false;
        Usuarios usuarios = (Usuarios) o;
        return getCpf().equals(usuarios.getCpf()) && getEmail().equals(usuarios.getEmail()) && getNome().equals(usuarios.getNome()) && getDataNascimento().equals(usuarios.getDataNascimento()) && getVeiculos().equals(usuarios.getVeiculos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getEmail(), getNome(), getDataNascimento(), getVeiculos());
    }
}
