package listaDeExercicios1;

import listaDeExercicios1.exercicio01.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author José Orlando R. Vilar
 */
public class TestarExercicios {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataNascimento = Calendar.getInstance();

        dataNascimento.setTime(formato.parse("25/03/1993"));
        Pessoa pessoa1 = new Pessoa("José Orlando", dataNascimento.getTime(), 1.74);
        pessoa1.imprimirDados();

        dataNascimento.setTime(formato.parse("06/11/1978"));
        Pessoa pessoa2 = new Pessoa("Gustavo Ghastine", dataNascimento.getTime(), 1.88);
        pessoa2.imprimirDados();

    }
}
