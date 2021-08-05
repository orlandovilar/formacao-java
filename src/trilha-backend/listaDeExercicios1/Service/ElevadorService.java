package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Elevador;
import listaDeExercicios1.Model.Pessoa;
import java.util.ArrayList;

/**
 * @author José Orlando R. Vilar
 */
public class ElevadorService extends Elevador {

    public void inicializar(Integer capacidade, Integer totalAndares) {
        setAndarAtual(0);
        setCapacidade(capacidade);
        setTotalAndares(totalAndares);
        setQuantPessoas(0);
        setPessoas(new ArrayList<>());
    }

    public void entrar(Pessoa pessoa) {
        if(pessoa != null) {
            if (!getPessoas().contains(pessoa)) {
                if (getCapacidade() > getQuantPessoas()) {
                    getPessoas().add(pessoa);
                    setQuantPessoas(getQuantPessoas() + 1);
                    System.out.println("\n" + pessoa.getNome() + " entrou no Elevador.");
                } else {
                    System.out.println("\n" + pessoa.getNome() + " não pôde entrar. Elevador cheio!");
                }
            } else {
                System.out.println("\n" + pessoa.getNome() + " já está dentro do Elevador!");
            }
        }else {
            System.out.println("\n>>> Pessoa inválida!");
        }
    }

    public void sair(Pessoa pessoa) {
        if(pessoa != null) {
            if (!getPessoas().isEmpty()) {
                if (getPessoas().contains(pessoa)) {
                    getPessoas().remove(pessoa);
                    setQuantPessoas(getQuantPessoas() - 1);
                    System.out.println("\n" + pessoa.getNome() + " saiu no Elevador.");
                } else {
                    System.out.println("\n" + pessoa.getNome() + " não está dentro do Elevador!");
                }
            } else {
                System.out.println("\nO Elevador está vazio!");
            }
        }else {
            System.out.println("\n>>> Pessoa inválida!");
        }
    }

    public void subir() {
        if(getAndarAtual() != getTotalAndares()) {
            setAndarAtual(getAndarAtual() + 1);
            System.out.println("\nO Elevador subiu um andar e encontra-se no " + getAndarAtual() + "º andar.");
        }else {
            System.out.println("\nO Elevador já está no último andar!");
        }
    }

    public void descer() {
        if(getAndarAtual() > 0) {
            setAndarAtual(getAndarAtual() - 1);
            if(getAndarAtual() == 0) {
                System.out.println("\nO Elevador desceu um andar e encontra-se no térreo.");
            }else {
                System.out.println("\nO Elevador desceu um andar e encontra-se no " + getAndarAtual()+ "º andar.");
            }
        }else {
            System.out.println("\nO Elevador já está no térreo!");
        }
    }
}
