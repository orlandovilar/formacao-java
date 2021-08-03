package Collections.GerenciadorDeCursos.br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de Listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.remove(0);

        //imprimindo a lista diretamente dentro do println
        System.out.println(aulas);

        //imprimindo a lista com um foreach laço
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //imprimindo a lista com Stream
        aulas.stream().forEach(aula -> System.out.println("Aula: " + aula));

        aulas.add("Aumentando nosso conhecimento");

        //imprimindo a lista com forEach método
        aulas.forEach(aula -> System.out.println("Aula: " + aula));


        Collections.sort(aulas);
        System.out.println("Depois da ordenação:");
        System.out.println(aulas);

    }
}
