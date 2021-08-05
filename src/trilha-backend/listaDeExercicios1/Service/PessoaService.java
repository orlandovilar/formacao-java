package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Pessoa;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public String imprimirDados() throws ParseException {
        String estruturaDataDeNascimento;
        if(getDataNascimento() != null) {
            estruturaDataDeNascimento = "Data de Nascimento: " + getDataNascimento();
            calcularIdade();
        }else {
            estruturaDataDeNascimento = "Data de Nascimento: não informado.";
        }
        String estruturaDadosPessoa = "Nome: " + getNome()
                + "\n"
                + estruturaDataDeNascimento
                + "\n"
                + "Altura: " + new BigDecimal(getAltura()).setScale(2, RoundingMode.HALF_UP)
                + "\n"
                + "Idade: " + getIdade()
                + "\n";

        System.out.println(estruturaDadosPessoa);

        return estruturaDadosPessoa;
    }

    public int calcularIdade() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();
        Calendar calendarioDataAniversario = Calendar.getInstance();
        calendarioDataAniversario.setTime(formato.parse(getDataNascimento()));
        LocalDate aniversario = LocalDate.of(calendarioDataAniversario.get(Calendar.YEAR), calendarioDataAniversario.get(Calendar.MONTH) + 1, calendarioDataAniversario.get(Calendar.DATE));
        Period periodo = Period.between(aniversario, hoje);
        setIdade(periodo.getYears());

        return getIdade();
    }
}
