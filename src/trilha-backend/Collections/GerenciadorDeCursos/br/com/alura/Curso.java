package Collections.GerenciadorDeCursos.br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas); // Entrega uma lista "read only"
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for(Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;

        return aulas.stream().mapToInt(aula -> aula.getTempo()).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " +
                "nome: " + nome +
                ", tempo total: " + getTempoTotal() +
                ", aulas: " + aulas +
                ']';
    }
}