package listaDeExercicios1.exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {
    private String tipo;
    private Integer totalPluviometros;
    private List<String> pluviometros;

    public Caminhao(String tipo, Integer totalPluviometros, List<String> pluviometros) {
        this.tipo = tipo;
        this.totalPluviometros = totalPluviometros;
        this.pluviometros = pluviometros;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getTotalPluviometros() {
        return totalPluviometros;
    }

    public List<String> getPluviometros() {
        return pluviometros;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTotalPluviometros(Integer totalPluviometros) {
        this.totalPluviometros = totalPluviometros;
    }

    public void setPluviometros(List<String> pluviometros) {
        this.pluviometros = pluviometros;
    }
}
