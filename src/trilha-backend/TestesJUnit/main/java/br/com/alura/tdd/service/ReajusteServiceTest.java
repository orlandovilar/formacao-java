package TestesJUnit.main.java.br.com.alura.tdd.service;

import TestesJUnit.main.java.br.com.alura.tdd.modelo.Desempenho;
import TestesJUnit.main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService rs = new ReajusteService();
    private Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

    @BeforeEach
    public void inicializar() {
        System.out.println("inicio");
        this.rs = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @AfterEach
    public void finalizar() {
        System.out.println("fim");
    }

    @BeforeAll
    public static void antesDeTodos() {
        System.out.println("Antes de tudo");
    }

    @AfterAll
    public static void depoisDeTodos() {
        System.out.println("Depois de tudo");
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        rs.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForABom() {
        rs.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForOtimo() {
        rs.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
