package listaDeExercicios1.exercicio01;

import java.text.ParseException;
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

    public Pessoa(){}

    public void imprimirDados() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + this.nome);
        if(this.dataNascimento != null) {
            System.out.println("Data de Nascimento: " + formato.format(this.dataNascimento.getTime()));
            calcularIdade();
        }else {
            System.out.println("Data de Nascimento: não informado.");
        }
        System.out.println("Altura: " + this.altura);
        System.out.println("Idade: " + this.idade);
        System.out.printf("\n");
    }

    public void calcularIdade() {
        Calendar calendarioDataAtual = Calendar.getInstance();
        Calendar calendarioDataAniversario = Calendar.getInstance();
        calendarioDataAniversario.setTime(this.dataNascimento);

        if(calendarioDataAtual.get(Calendar.MONTH) > calendarioDataAniversario.get(Calendar.MONTH)) {
            this.idade = calendarioDataAtual.get(Calendar.YEAR) - calendarioDataAniversario.get(Calendar.YEAR);
        }else if(calendarioDataAtual.get(Calendar.MONTH) == calendarioDataAniversario.get(Calendar.MONTH)) {
            if(calendarioDataAtual.get(Calendar.DATE) >= calendarioDataAniversario.get(Calendar.DATE)) {
                this.idade = calendarioDataAtual.get(Calendar.YEAR) - calendarioDataAniversario.get(Calendar.YEAR);
            }else {
                this.idade = calendarioDataAtual.get(Calendar.YEAR) - calendarioDataAniversario.get(Calendar.YEAR) - 1;
            }
        }else {
            this.idade = calendarioDataAtual.get(Calendar.YEAR) - calendarioDataAniversario.get(Calendar.YEAR) - 1;
        }
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
