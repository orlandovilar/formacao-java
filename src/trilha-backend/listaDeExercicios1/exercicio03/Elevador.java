package listaDeExercicios1.exercicio03;

import listaDeExercicios1.exercicio01.Pessoa;
import java.util.ArrayList;
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

    public void inicializar(Integer capacidade, Integer totalAndares) {
        this.andarAtual = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.quantPessoas = 0;
        this.pessoas = new ArrayList<>();
    }

    public void entrar(Pessoa pessoa) {
        if(pessoa != null) {
            if (!this.pessoas.contains(pessoa)) {
                if (this.capacidade > this.quantPessoas) {
                    this.pessoas.add(pessoa);
                    this.quantPessoas++;
                    System.out.println("\n" + pessoa.getNome() + " entrou no Elevador.");
                } else {
                    System.out.println("\n" + pessoa.getNome() + " não pôde entrar. Elevador cheio!");
                }
            } else {
                System.out.println("\n" + pessoa.getNome() + " já está dentro do Elevador!");
            }
        }else {
            System.out.println("\n>> Pessoa inválida!");
        }
    }

    public void sair(Pessoa pessoa) {
        if(pessoa != null) {
            if (!this.pessoas.isEmpty()) {
                if (this.pessoas.contains(pessoa)) {
                    this.pessoas.remove(pessoa);
                    this.quantPessoas--;
                    System.out.println("\n" + pessoa.getNome() + " saiu no Elevador.");
                } else {
                    System.out.println("\n" + pessoa.getNome() + " não está dentro do Elevador!");
                }
            } else {
                System.out.println("\nO Elevador está vazio!");
            }
        }else {
            System.out.println("\n>> Pessoa inválida!");
        }
    }

    public void subir() {
        if(this.andarAtual != this.totalAndares) {
            this.andarAtual++;
            System.out.println("\nO Elevador subiu um andar e encontra-se no " + this.andarAtual + "º andar.");
        }else {
            System.out.println("\nO Elevador já está no último andar!");
        }
    }

    public void descer() {
        if(this.andarAtual > 0) {
            this.andarAtual--;
            if(this.andarAtual == 0) {
                System.out.println("\nO Elevador desceu um andar e encontra-se no térreo.");
            }else {
                System.out.println("\nO Elevador desceu um andar e encontra-se no " + this.andarAtual + "º andar.");
            }
        }else {
            System.out.println("\nO Elevador já está no térreo!");
        }
    }

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
