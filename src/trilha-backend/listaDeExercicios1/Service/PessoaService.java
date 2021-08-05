package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

/**
 * @author José Orlando R. Vilar
 */
public class PessoaService extends Pessoa {

    public PessoaService(String nome, String dataNascimento, Double altura) {
        super(nome, dataNascimento, altura);
    }

    public PessoaService(String nome, Integer idade, Double altura) {
        super(nome, idade, altura);
    }

    public void imprimirDados(Pessoa pessoa) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + pessoa.getNome());
        if(pessoa.getDataNascimento() != null) {
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
            calcularIdade(pessoa);
        }else {
            System.out.println("Data de Nascimento: não informado.");
        }
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("\n");
    }

    public void calcularIdade(Pessoa pessoa) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();
        Calendar calendarioDataAniversario = Calendar.getInstance();
        calendarioDataAniversario.setTime(formato.parse(pessoa.getDataNascimento()));
        LocalDate aniversario = LocalDate.of(calendarioDataAniversario.get(Calendar.YEAR), calendarioDataAniversario.get(Calendar.MONTH) + 1, calendarioDataAniversario.get(Calendar.DATE));
        Period periodo = Period.between(aniversario, hoje);
        pessoa.setIdade(periodo.getYears());
    }
}
