package listaDeExercicios1.Model;

import listaDeExercicios1.Service.ControleRemotoService;

import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Televisao {
    private Integer volumeSom;
    private List<Integer> canais;
    private Integer canalAtual;

    public Televisao(Integer volumeSom, List<Integer> canais, Integer canalAtual) {
        this.volumeSom = volumeSom;
        this.canais = canais;
        this.canalAtual = canalAtual;
    }

    public Integer getVolumeSom() {
        return volumeSom;
    }

    public List<Integer> getCanais() {
        return canais;
    }

    public Integer getCanalAtual() {
        return canalAtual;
    }

    public void setVolumeSom(Integer volumeSom) {
        this.volumeSom = volumeSom;
    }

    public void setCanais(List<Integer> canais) {
        this.canais = canais;
    }

    public void setCanalAtual(Integer canalAtual) {
        this.canalAtual = canalAtual;
    }
}
