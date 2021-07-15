package listaDeExercicios1.exercicio01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Double altura;

    public Pessoa(String nome, Date dataNascimento, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void imprimirDados() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nDados da Pessoa:");
        System.out.println("Nome: " + this.nome);
        System.out.println(this.dataNascimento.getTime());
        System.out.println("Data de Nascimento: " + formato.format(this.dataNascimento.getTime()));
        System.out.println("Altura: " + this.altura);
    }

    public void calcularEImprimirIdade() {
        Date dataAtual = new Date();
        int idade = 0;

        if(dataAtual.getMonth() >= this.dataNascimento.getMonth()) {
            if(dataAtual.getDate() >= this.dataNascimento.getDate()) {
                idade = dataAtual.getYear() - this.dataNascimento.getYear();
            }else {
                idade = dataAtual.getYear() - this.dataNascimento.getYear() - 1;
            }
        }else {
            idade = dataAtual.getYear() - this.dataNascimento.getYear() - 1;
        }

        System.out.println("A idade de " + this.nome + " é: " + idade + " anos.");
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
