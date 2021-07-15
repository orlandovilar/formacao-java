package bytebankHerdado;

public class SistemaInterno {

    private int senha = 2222;

    public void autenticar(Autenticavel funcionario) {
        boolean autenticou = funcionario.autenticar(this.senha);

        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        }else {

            System.out.println("Acesso não permitido! Senha incorreta!");
        }
    }
}
