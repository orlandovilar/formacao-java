package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Agenda;
import java.text.ParseException;
import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class AgendaService extends Agenda {

    public AgendaService(List<PessoaService> pessoas) {
        super(pessoas);
    }

    public void adicionarPessoa(PessoaService pessoa) {
        if(pessoa != null) {
            if (!getPessoas().stream().anyMatch(p -> p.getNome().matches(pessoa.getNome()))) {
                if (getPessoas().size() < 10) {
                    getPessoas().add(pessoa);
                    System.out.println("\n" + pessoa.getNome() + " foi adicionado à Agenda com sucesso.");
                } else {
                    System.out.println("\n" + pessoa.getNome() + " não pôde ser adicionado. Agenda cheia!");
                }
            } else {
                System.out.println("\n" + pessoa.getNome() + " já existe na Agenda!");
            }
        }else {
            System.out.println("\n>> Pessoa inválida!");
        }
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        PessoaService novaPessoa = new PessoaService(nome, idade, altura);

        if(!getPessoas().stream().anyMatch(p -> p.getNome().matches(novaPessoa.getNome()))) {
            if(getPessoas().size() < 10) {
                getPessoas().add(novaPessoa);
                System.out.println("\n" + novaPessoa.getNome() + " foi adicionado à Agenda com sucesso.");
            }else {
                System.out.println("\n" + novaPessoa.getNome() + " não pôde ser adicionado. Agenda cheia!");
            }
        }else {
            System.out.println("\n" + novaPessoa.getNome() + " já existe na Agenda!");
        }
    }

    public void removerPessoa(String nome) {
        boolean existe;
        if(!getPessoas().isEmpty()) {
            existe = getPessoas().stream().anyMatch(p -> p.getNome().matches(nome));
            if(existe) {
                getPessoas().remove(getPessoas().get(buscarPessoa(nome)));
                System.out.println("\n" + nome + " foi removido da Agenda com êxito.");
            }else {
                System.out.println("\n" + nome + " não foi encontrado na Agenda!");
            }
        }else {
            System.out.println("\nNão foi possível remover " + nome + ". A Agenda está vazia!");
        }
    }

    public int buscarPessoa(String nome) {
        if(getPessoas().stream().anyMatch(p -> p.getNome().matches(nome))) {
            getPessoas().stream().
                    filter(p -> p.getNome() == nome).
                    map(p -> getPessoas().indexOf(p)).forEach(p -> setIndex(p));
        }else {
            setIndex(-1);
        }
        return getIndex();
    }

    public void imprimirPessoa(int index) {
        if (!getPessoas().isEmpty()) {
            if (getPessoas().stream().anyMatch(p -> getPessoas().indexOf(p) == index)) {
                System.out.println("\nPosição " + (index + 1) + ":");
                getPessoas().stream().
                filter(p -> getPessoas().indexOf(p) == index).
                forEach(p -> {
                    try {
                        p.imprimirDados();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                });
            } else {
                System.out.println("\nPosição não encontrada na Agenda!");
            }
        } else {
            System.out.println("\nPosição não encontrada. A Agenda está vazia!");
        }
    }

    public void imprimirAgenda() {
        if(!getPessoas().isEmpty()) {
            System.out.println("\nDados da Agenda:\n");
            getPessoas().stream().forEach(p -> {
            System.out.println("Posição " + (getPessoas().indexOf(p) + 1) + ":");
                try {
                    p.imprimirDados();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        }else {
            System.out.println("\nA Agenda está vazia!");
        }
    }
}
