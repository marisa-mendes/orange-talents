package orange.talents.gerenciador.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Veiculos  {


    private Integer codigo;
    private String marcas;
    private String modelos;
    private Integer anos;
    private Usuarios usuarios;
    private List<Veiculos> veiculos = new ArrayList<>();

    public Veiculos(String marcas, String modelos, Integer anos) {
        this.marcas = marcas;
        this.modelos = modelos;
        this.anos = anos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculos)) return false;
        Veiculos veiculos1 = (Veiculos) o;
        return codigo.equals(veiculos1.codigo) && marcas.equals(veiculos1.marcas) && modelos.equals(veiculos1.modelos) && anos.equals(veiculos1.anos) && usuarios.equals(veiculos1.usuarios) && veiculos.equals(veiculos1.veiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, marcas, modelos, anos, usuarios, veiculos);
    }

    public Integer getId() {
        return codigo;
    }

    public void setId(Integer id) {
        this.codigo = id;
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculos> veiculos) {
        this.veiculos = veiculos;
    }
}




