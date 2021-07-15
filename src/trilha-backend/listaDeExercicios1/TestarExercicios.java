package listaDeExercicios1;

import listaDeExercicios1.exercicio01.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestarExercicios {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Pessoa pessoa1 = new Pessoa("José Orlando", formato.parse("25/03/1993"), 1.74);
        pessoa1.setNome("Tulio Pereira");
        pessoa1.imprimirDados();
        pessoa1.calcularEImprimirIdade();

        Pessoa pessoa2 = new Pessoa("Gustavo Ghastine", formato.parse("06/11/1978"), 1.88);
        pessoa2.imprimirDados();
        pessoa2.calcularEImprimirIdade();
        
    }
}
