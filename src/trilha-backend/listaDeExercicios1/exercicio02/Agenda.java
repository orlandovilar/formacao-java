package listaDeExercicios1.exercicio02;

import listaDeExercicios1.exercicio01.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Agenda {
    private Integer index;
    private List<Pessoa> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if(!this.pessoas.stream().anyMatch(p -> p.getNome().matches(pessoa.getNome()))) {
            if(this.pessoas.size() < 10) {
                this.pessoas.add(pessoa);
                System.out.println("\n" + pessoa.getNome() + " foi adicionado à Agenda com sucesso.");
            }else {
                System.out.println("\n" + pessoa.getNome() + " não pôde ser adicionado. Agenda cheia!");
            }
        }else {
            System.out.println("\n" + pessoa.getNome() + " já existe na Agenda!");
        }
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        if(!this.pessoas.stream().anyMatch(p -> p.getNome().matches(pessoa.getNome()))) {
            if(this.pessoas.size() < 10) {
                this.pessoas.add(pessoa);
                System.out.println("\n" + pessoa.getNome() + " foi adicionado à Agenda com sucesso.");
            }else {
                System.out.println("\n" + pessoa.getNome() + " não pôde ser adicionado. Agenda cheia!");
            }
        }else {
            System.out.println("\n" + pessoa.getNome() + " já existe na Agenda!");
        }
    }

    public void removerPessoa(String nome) {
        boolean existe;
        if(!this.pessoas.isEmpty()) {
            existe = this.pessoas.stream().anyMatch(p -> p.getNome().matches(nome));
            if(existe) {
                this.pessoas.remove(this.pessoas.get(buscarPessoa(nome)));
                System.out.println("\n" + nome + " foi removido da Agenda com êxito.");
            }else {
                System.out.println("\n" + nome + " não foi encontrada na Agenda!");
            }
        }else {
            System.out.println("\nNão foi possível remover " + nome + ". A Agenda está vazia!");
        }
    }

    public int buscarPessoa(String nome) {
        if(this.pessoas.stream().anyMatch(p -> p.getNome().matches(nome))) {
           this.pessoas.stream().
                   filter(p -> p.getNome() == nome).
                   map(p -> this.pessoas.indexOf(p)).forEach(p -> this.index = p);
        }else {
            this.index = -1;
        }
        return this.index;
    }

    public void imprimirPessoa(int index) {
        if (!this.pessoas.isEmpty()) {
            if (this.pessoas.stream().anyMatch(p -> this.pessoas.indexOf(p) == index - 1)) {
                System.out.println("\nPosição " + index + ":");
                this.pessoas.stream().
                        filter(p -> this.pessoas.indexOf(p) == index - 1).
                        forEach(p -> p.imprimirDados());
            } else {
                System.out.println("\nPosição não encontrada na Agenda!");
            }
        } else {
            System.out.println("\nPosição não encontrada. A Agenda está vazia!");
        }
    }

    public void imprimirAgenda() {
        if(!this.pessoas.isEmpty()) {
            System.out.println("\nDados da Agenda:\n");
            this.pessoas.stream().forEach(p -> {
                System.out.println("Posição " + (this.pessoas.indexOf(p) + 1) + ":");
                p.imprimirDados();
            });
        }else {
            System.out.println("\nA Agenda está vazia!");
        }
    }

    public Integer getIndex() {
        return index;
    }
}
