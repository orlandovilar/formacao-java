package TestesJUnit.main.java.br.com.alura.tdd.service;

import TestesJUnit.main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService bs = new BonusService();

        assertThrows(IllegalArgumentException.class,
                () -> bs.calcularBonus(new Funcionario("Orlando", LocalDate.now(), new BigDecimal("25000"))));
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService bs = new BonusService();
        BigDecimal bonus = bs.calcularBonus(new Funcionario("Orlando", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
        BonusService bs = new BonusService();
        BigDecimal bonus = bs.calcularBonus(new Funcionario("Orlando", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}