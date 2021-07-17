package listaDeExercicios1;

import listaDeExercicios1.exercicio01.Pessoa;
import listaDeExercicios1.exercicio02.Agenda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author José Orlando R. Vilar
 */
public class TestarExercicios {

    public static void main(String[] args) throws ParseException {
        // Testes para o Primeiro Quesito
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataNascimento = Calendar.getInstance();

        dataNascimento.setTime(formato.parse("25/03/1993"));
        Pessoa pessoa1 = new Pessoa("José Orlando", dataNascimento.getTime(), 1.74);
        pessoa1.imprimirDados();

        dataNascimento.setTime(formato.parse("06/11/1978"));
        Pessoa pessoa2 = new Pessoa("Gustavo Ghastine", dataNascimento.getTime(), 1.88);
        pessoa2.imprimirDados();

        // Testes para o Segundo Quesito
        Agenda agenda = new Agenda();

        agenda.adicionarPessoa(pessoa1);
        agenda.imprimirPessoa(1);
        agenda.adicionarPessoa(pessoa2);
        agenda.imprimirPessoa(2);
        agenda.imprimirAgenda();
        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa("Rayssa", 30, 1.60);
        agenda.adicionarPessoa("Tayse", 30, 1.60);
        agenda.adicionarPessoa("João", 30, 1.60);
        agenda.adicionarPessoa("Fabrície", 30, 1.60);
        agenda.adicionarPessoa("Pamela", 30, 1.60);
        agenda.adicionarPessoa("Thiago", 30, 1.60);
        agenda.adicionarPessoa("Renato", 30, 1.60);
        agenda.adicionarPessoa("Teresa", 30, 1.60);
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.removerPessoa("Teresa");
        agenda.removerPessoa("Ana");
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.imprimirPessoa(9);
        agenda.imprimirPessoa(10);
        agenda.imprimirAgenda();
        agenda.removerPessoa("Ana");
        agenda.removerPessoa("Renato");
        agenda.removerPessoa("Thiago");
        agenda.removerPessoa("Pamela");
        agenda.removerPessoa("Fabrície");
        agenda.removerPessoa("João");
        agenda.removerPessoa("Tayse");
        agenda.removerPessoa("Rayssa");
        agenda.imprimirAgenda();
        agenda.removerPessoa("Gustavo Ghastine");
        agenda.removerPessoa("José Orlando");
        agenda.imprimirPessoa(2);
        agenda.removerPessoa("José Orlando");
        agenda.imprimirPessoa(0);
        agenda.imprimirAgenda();

    }
}
