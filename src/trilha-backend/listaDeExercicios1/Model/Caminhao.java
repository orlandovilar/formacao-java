package listaDeExercicios1.Model;

import java.util.List;

/**
 * @author José Orlando R. Vilar
 */
public class Caminhao {
    private String tipo;
    private Integer totalPluviometros;
    private List<String> pluviometros;
    private Double capacidadeTotal;

    public Caminhao(String tipo, Integer totalPluviometros, List<String> pluviometros, Double capacidadeTotal) {
        this.tipo = tipo;
        this.totalPluviometros = totalPluviometros;
        this.pluviometros = pluviometros;
        this.capacidadeTotal = capacidadeTotal;
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

    public Double getCapacidadeTotal() {
        return capacidadeTotal;
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

    public void setCapacidadeTotal(Double capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
}
