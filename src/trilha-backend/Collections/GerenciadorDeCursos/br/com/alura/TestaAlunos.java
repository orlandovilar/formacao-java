package Collections.GerenciadorDeCursos.br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        // HashSet é uma estrutura de espalhamento mais rápida de ser varrida
        // do que uma List
        alunos.add("José Orlando");
        alunos.add("Gustavo Ghastine");
        alunos.add("Tayse Maya");
        System.out.println(alunos);

        alunos.add("Rayssa Santos");
        alunos.add("João Drapala");
        System.out.println(alunos);

        boolean gustavoEstaMatriculado = alunos.contains("Gustavo");
        System.out.println(gustavoEstaMatriculado);

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos.size());

        List<String> alunosEmLista = new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
