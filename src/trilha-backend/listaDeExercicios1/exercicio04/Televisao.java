package listaDeExercicios1.exercicio04;

import java.util.List;

public class Televisao {
    Integer volumeSom;
    List<Integer> canais;

    public Televisao(Integer volumeSom, List<Integer> canais) {
        this.volumeSom = volumeSom;
        this.canais = canais;
    }

    public Integer getVolumeSom() {
        return volumeSom;
    }

    public List<Integer> getCanais() {
        return canais;
    }

    public void setVolumeSom(Integer volumeSom) {
        this.volumeSom = volumeSom;
    }

    public void setCanais(List<Integer> canais) {
        this.canais = canais;
    }
}
