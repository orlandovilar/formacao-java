package listaDeExercicios1.Model;

import listaDeExercicios1.Service.ControleRemotoService;

import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Televisao {
    private Integer volumeSom;
    private List<Integer> canais;
    private ControleRemotoService controle;
    private Integer canalAtual;

    public Televisao(Integer volumeSom, List<Integer> canais, ControleRemotoService controle, Integer canalAtual) {
        this.volumeSom = volumeSom;
        this.canais = canais;
        this.controle = controle;
        this.canalAtual = canalAtual;
    }

    public Integer getVolumeSom() {
        return volumeSom;
    }

    public List<Integer> getCanais() {
        return canais;
    }

    public ControleRemotoService getControle() {
        return controle;
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

    public void setControle(ControleRemotoService controle) {
        this.controle = controle;
    }

    public void setCanalAtual(Integer canalAtual) {
        this.canalAtual = canalAtual;
    }
}
