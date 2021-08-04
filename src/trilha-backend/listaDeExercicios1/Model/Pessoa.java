package listaDeExercicios1.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author José Orlando R. Vilar
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Double altura;
    private Integer idade;

    public Pessoa(String nome, Date dataNascimento, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
