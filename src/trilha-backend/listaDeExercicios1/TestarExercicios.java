package listaDeExercicios1;

import listaDeExercicios1.exercicio01.Pessoa;
import java.text.ParseException;

/**
 * @author José Orlando R. Vilar
 */
public class TestarExercicios {

    public static void main(String[] args) throws ParseException {
        Pessoa pessoa1 = new Pessoa("José Orlando", "25/03/1993", 1.74);
        pessoa1.imprimirDados();

        Pessoa pessoa2 = new Pessoa("Gustavo Ghastine", "06/11/1978", 1.88);
        pessoa2.imprimirDados();
    }
}
