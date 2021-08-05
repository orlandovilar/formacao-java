package listaDeExercicios1.Service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {

    @BeforeAll
    static void inicializar() {
        System.out.println("Inicializando os testes da Lista de Exercícios - Formação Java\n");
    }

    @AfterAll
    static void finalizar() {
        System.out.println("Finalizando os testes da Lista de Exercícios - Formação Java");
    }

    @Test
    void deveImprimirDadosDaPessoaComDataDeNascimento() throws ParseException {
        PessoaService pessoaService = new PessoaService("José Orlando", 1.74, "25/03/1993");
        String retorno = pessoaService.imprimirDados();
        String estruturaDadosPessoa = "Nome: " + pessoaService.getNome()
                + "\n"
                + "Data de Nascimento: " + pessoaService.getDataNascimento()
                + "\n"
                + "Altura: " + new BigDecimal(pessoaService.getAltura()).setScale(2, RoundingMode.HALF_UP)
                + "\n"
                + "Idade: " + pessoaService.getIdade()
                + "\n";

        assertEquals(estruturaDadosPessoa, retorno);
    }

    @Test
    void deveImprimirDadosDaPessoaSemDataDeNascimento() throws ParseException {
        PessoaService pessoaService = new PessoaService("Pamela", 30, 1.60);
        String retorno = pessoaService.imprimirDados();
        String estruturaDadosPessoa = "Nome: " + pessoaService.getNome()
                + "\n"
                + "Data de Nascimento: não informado."
                + "\n"
                + "Altura: " + new BigDecimal(pessoaService.getAltura()).setScale(2, RoundingMode.HALF_UP)
                + "\n"
                + "Idade: " + pessoaService.getIdade()
                + "\n";

        assertEquals(estruturaDadosPessoa, retorno);
    }

    @Test
    void calcularIdadeDePessoaComDataDeNascimentoValida() throws ParseException {
        PessoaService pessoaService = new PessoaService("José Orlando", 1.74, "25/03/1993");
        pessoaService.calcularIdade();

        assertEquals(28, pessoaService.getIdade());
    }

    @Test
    void calcularIdadeDePessoaComDataDeNascimentoNull() throws ParseException {
        PessoaService pessoaService = new PessoaService("José Orlando", 1.74, null);
        pessoaService.calcularIdade();

        assertEquals(0, pessoaService.getIdade());
    }
}