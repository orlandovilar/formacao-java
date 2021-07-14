package bytebank;

public class Cliente {
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static int id = 1;
    private String nome;
    private String cpf;
    private String profissao;

    Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }
}
