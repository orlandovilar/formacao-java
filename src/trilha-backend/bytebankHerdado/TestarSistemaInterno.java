package bytebankHerdado;

public class TestarSistemaInterno {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autenticar(gerente);
        si.autenticar(adm);
    }
}
