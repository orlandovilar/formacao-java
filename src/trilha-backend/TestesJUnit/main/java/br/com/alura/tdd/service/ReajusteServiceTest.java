package TestesJUnit.main.java.br.com.alura.tdd.service;

import TestesJUnit.main.java.br.com.alura.tdd.modelo.Desempenho;
import TestesJUnit.main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        ReajusteService rs = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForABom() {
        ReajusteService rs = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForOtimo() {
        ReajusteService rs = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        rs.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
