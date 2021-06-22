package orange.talents.gerenciador.entities;

import javax.persistence.*;


import java.time.LocalDate;
import java.util.Objects;

public class Usuarios  {

    private Long id;
    private String cpf;
    private String email;
    private String nome;
    private LocalDate datanascimento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuarios)) return false;
        Usuarios usuarios = (Usuarios) o;
        return id.equals(usuarios.id) && cpf.equals(usuarios.cpf) && email.equals(usuarios.email) && Objects.equals(nome, usuarios.nome) && Objects.equals(datanascimento, usuarios.datanascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, email, nome, datanascimento);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }
}
