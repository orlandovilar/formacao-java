package listaDeExercicios1.exercicio02;

import listaDeExercicios1.exercicio01.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Agenda {
    private Integer index;
    private List<Pessoa> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if(this.agenda.size() < 10) {
            if(!this.agenda.stream().anyMatch(p -> p.getNome().matches(pessoa.getNome()))) {
                this.agenda.add(pessoa);
                System.out.println(pessoa.getNome() + " foi adicionado à Agenda com êxito.");
            }else {
                System.out.println(pessoa.getNome() + " já existe na Agenda!");
            }
        }else {
            System.out.println("Usuário não pode ser adicionado. Agenda cheia!");
        }

    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        if(this.agenda.size() < 10) {
            if(!this.agenda.stream().anyMatch(p -> p.getNome().matches(pessoa.getNome()))) {
                this.agenda.add(pessoa);
                System.out.println(pessoa.getNome() + " foi adicionado à Agenda com sucesso.");
            }else {
                System.out.println(pessoa.getNome() + " já existe na Agenda!");
            }
        }else {
            System.out.println("Usuário não pode ser adicionado. A Agenda está cheia!");
        }

    }

    public void removerPessoa(String nome) {
        boolean existe;
        if(!this.agenda.isEmpty()) {
            existe = this.agenda.stream().anyMatch(p -> p.getNome().matches(nome));
            if(existe) {
                this.agenda.remove(this.agenda.get(buscarPessoa(nome)));
                System.out.println(nome + " foi removido da Agenda com êxito.");
            }else {
                System.out.println(nome + " não pertence à Agenda!");
            }
        }else {
            System.out.println("Não foi possível remover o usuário. A Agenda está vazia!");
        }

    }

    public int buscarPessoa(String nome) {
        if(this.agenda.stream().anyMatch(p -> p.getNome().matches(nome))) {
           this.agenda.stream().
                   filter(p -> p.getNome() == nome).
                   map(p -> this.agenda.indexOf(p)).forEach(p -> this.index = p);
        }else {
            this.index = -1;
        }
        return this.index;
    }

    public void imprimirPessoa(int index) {

        if(this.agenda.stream().anyMatch(p -> this.agenda.indexOf(p) == index)) {
            System.out.println("\nPessoa na posição " + index + " da Agenda:");
            this.agenda.stream().
                    filter(p -> this.agenda.indexOf(p) == index).
                    forEach(p -> p.imprimirDados());
        }else {
            System.out.println("Usuário não encontrado. A Agenda está vazia!");
        }

    }

    public void imprimirAgenda() {
        if(!this.agenda.isEmpty()) {
            System.out.println("Dados da Agenda:\n");
            this.agenda.stream().forEach(p -> p.imprimirDados());
        }else {
            System.out.println("Não foi possível imprimir, a Agenda está vazia!");
        }
    }

}
