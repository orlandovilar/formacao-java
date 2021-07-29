package Collections.GerenciadorDeCursos.br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando as coleções", 22));

        Aluno a1 = new Aluno("José Orlando", 22551);
        Aluno a2 = new Aluno("Gustavo Ghastine", 24631);
        Aluno a3 = new Aluno("Tayse Maya", 34789);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Listando todos os alunos:");
        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.print("O aluno a1 está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno a4 = new Aluno("Gustavo Ghastine", 24631);
        System.out.print("O aluno a1 está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a4));

    }
}
