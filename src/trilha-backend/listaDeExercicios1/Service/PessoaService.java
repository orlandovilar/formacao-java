package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Pessoa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author José Orlando R. Vilar
 */
public class PessoaService {

    public void imprimirDados(Pessoa pessoa) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + pessoa.getNome());
        if(pessoa.getDataNascimento() != null) {
            System.out.println("Data de Nascimento: " + formato.format(pessoa.getDataNascimento().getTime()));
            calcularIdade(pessoa);
        }else {
            System.out.println("Data de Nascimento: não informado.");
        }
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("\n");
    }

    public void calcularIdade(Pessoa pessoa) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();
        Calendar calendarioDataAniversario = Calendar.getInstance();
        calendarioDataAniversario.setTime(pessoa.getDataNascimento());
        LocalDate aniversario = LocalDate.of(calendarioDataAniversario.get(Calendar.YEAR), calendarioDataAniversario.get(Calendar.MONTH) + 1, calendarioDataAniversario.get(Calendar.DATE));
        Period periodo = Period.between(aniversario, hoje);
        pessoa.setIdade(periodo.getYears());

    }
}
