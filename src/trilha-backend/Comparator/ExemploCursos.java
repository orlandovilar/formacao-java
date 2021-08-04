package Comparator;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 50));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println("> " + c.getNome()));

        System.out.println(cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum());

        Optional<Curso> optionalCurso = cursos.stream()
                .filter(c -> c.getAlunos() >= 600)
                .findAny();

        //Curso curso = optionalCurso.orElse(null);
        //System.out.println(curso.getNome());

        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        Map<String, Integer> map = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()));

        System.out.println(map);
    }
}
