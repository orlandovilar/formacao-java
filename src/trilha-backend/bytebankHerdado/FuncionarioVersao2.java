package bytebankHerdado;

public class FuncionarioVersao2 {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; //Funcionario comum = 0, Gerente = 1, Diretor = 2

    public double getBonificacao() {

        if(this.tipo == 0) { //Funcionário comum
            return this.salario * 0.1;
        }else if(this.tipo == 1) { //Gerente
            return this.salario;
        }else if(this.tipo == 2) { //Diretor
            return this.salario + 1000.0;
        }
        return this.salario * 0.1;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }



}
