package listaDeExercicios1.Model;

import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Elevador {
    private Integer andarAtual;
    private Integer capacidade;
    private Integer totalAndares;
    private Integer quantPessoas;
    private List<Pessoa> pessoas;

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public Integer getQuantPessoas() {
        return quantPessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(Integer totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public void setQuantPessoas(Integer quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
