package listaDeExercicios1.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author José Orlando R. Vilar
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Double altura;
    private Integer idade;
    private SimpleDateFormat formato;

    public Pessoa(String nome, String dataNascimento, Double altura) throws ParseException {
        this.formato = new SimpleDateFormat("dd/MM/yyyy");
        this.nome = nome;
        this.dataNascimento = formato.parse(dataNascimento);
        this.altura = altura;
        this.idade = calcularIdade();
    }

    public void imprimirDados() {
        System.out.println("\nDados da Pessoa:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.formato.format(this.dataNascimento.getTime()));
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.idade);
    }

    public Integer calcularIdade() {
        Date dataAtual = new Date();
        int idade = 0;

        if(dataAtual.getMonth() > this.dataNascimento.getMonth()) {
            idade = dataAtual.getYear() - this.dataNascimento.getYear();
        }else if(dataAtual.getMonth() == this.dataNascimento.getMonth()) {
            if(dataAtual.getDate() >= this.dataNascimento.getDate()) {
                idade = dataAtual.getYear() - this.dataNascimento.getYear();
            }else {
                idade = dataAtual.getYear() - this.dataNascimento.getYear() - 1;
            }
        }else {
            idade = dataAtual.getYear() - this.dataNascimento.getYear() - 1;
        }

        return idade;
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
