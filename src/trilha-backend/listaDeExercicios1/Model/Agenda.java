package listaDeExercicios1.Model;

import listaDeExercicios1.Service.PessoaService;
import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Agenda {
    private int index;
    private List<PessoaService> pessoas;

    public Agenda(List<PessoaService> pessoas) {
        this.pessoas = pessoas;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<PessoaService> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaService> pessoas) {
        this.pessoas = pessoas;
    }
}
