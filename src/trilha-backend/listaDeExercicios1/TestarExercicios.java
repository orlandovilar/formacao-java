package listaDeExercicios1;

import listaDeExercicios1.exercicio01.Pessoa;
import listaDeExercicios1.exercicio02.Agenda;
import listaDeExercicios1.exercicio03.Elevador;
import listaDeExercicios1.exercicio04.ControleRemoto;
import listaDeExercicios1.exercicio04.Televisao;
import listaDeExercicios1.exercicio05.Caminhao;
import listaDeExercicios1.exercicio05.Selecao;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author José Orlando R. Vilar
 */
public class TestarExercicios {

    public static void main(String[] args) throws ParseException, IOException {
        // Testes para 1ª Questão
        System.out.println("> 1ª Questão - Pessoa:\n");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataNascimento = Calendar.getInstance();

        dataNascimento.setTime(formato.parse("25/03/1993"));
        Pessoa pessoa1 = new Pessoa("José Orlando", dataNascimento.getTime(), 1.74);
        pessoa1.imprimirDados();

        dataNascimento.setTime(formato.parse("06/11/1978"));
        Pessoa pessoa2 = new Pessoa("Gustavo Ghastine", dataNascimento.getTime(), 1.88);
        pessoa2.imprimirDados();

        dataNascimento.setTime(formato.parse("03/10/1994"));
        Pessoa pessoa3 = new Pessoa("Rayssa", dataNascimento.getTime(), 1.53);
        pessoa3.imprimirDados();

        dataNascimento.setTime(formato.parse("10/12/1995"));
        Pessoa pessoa4 = new Pessoa("Tayse", dataNascimento.getTime(), 1.72);
        pessoa4.imprimirDados();

        dataNascimento.setTime(formato.parse("02/02/1996"));
        Pessoa pessoa5 = new Pessoa("Mácio", dataNascimento.getTime(), 1.76);
        pessoa5.imprimirDados();

        dataNascimento.setTime(formato.parse("01/01/1999"));
        Pessoa pessoa6 = new Pessoa("Fabrície", dataNascimento.getTime(), 1.68);
        pessoa6.imprimirDados();

        // Testes para 2ª Questão
        System.out.println(">> 2ª Questão - Agenda:");
        Agenda agenda = new Agenda(new ArrayList<>());

        agenda.adicionarPessoa(null);
        agenda.adicionarPessoa(pessoa1);
        agenda.imprimirPessoa(1);
        agenda.adicionarPessoa(pessoa2);
        agenda.imprimirPessoa(2);
        agenda.imprimirAgenda();
        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa(pessoa3);
        agenda.adicionarPessoa(pessoa4);
        agenda.adicionarPessoa(pessoa5);
        agenda.adicionarPessoa(pessoa6);
        agenda.adicionarPessoa("Pamela", 30, 1.60);
        agenda.removerPessoa("pamela");
        agenda.removerPessoa("Pamel");
        agenda.imprimirPessoa(agenda.buscarPessoa("Pamel"));
        agenda.imprimirPessoa(agenda.buscarPessoa("pamela"));
        agenda.imprimirPessoa(agenda.buscarPessoa("Pamela"));
        agenda.adicionarPessoa("João", 30, 1.60);
        agenda.adicionarPessoa("Renato", 30, 1.60);
        agenda.adicionarPessoa("Teresa", 30, 1.60);
        agenda.imprimirAgenda();
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.removerPessoa("Teresa");
        agenda.removerPessoa("Ana");
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.adicionarPessoa("Ana", 30, 1.60);
        agenda.imprimirPessoa(0);
        agenda.imprimirPessoa(9);
        agenda.imprimirPessoa(10);
        agenda.imprimirAgenda();
        agenda.removerPessoa("Ana");
        agenda.removerPessoa("Renato");
        agenda.removerPessoa("Thiago");
        agenda.removerPessoa("Pamela");
        agenda.removerPessoa("Fabrície");
        agenda.removerPessoa("João");
        agenda.removerPessoa("Tayse");
        agenda.removerPessoa("Rayssa");
        agenda.imprimirAgenda();
        agenda.removerPessoa("Gustavo Ghastine");
        agenda.removerPessoa("José Orlando");
        agenda.imprimirPessoa(2);
        agenda.removerPessoa("José Orlando");
        agenda.imprimirPessoa(0);
        agenda.imprimirAgenda();

        // Testes para 3ª Questão
        System.out.println("\n>>> 3ª Questão - Elevador:");
        Elevador elevador = new Elevador();

        elevador.inicializar(5, 8);

        elevador.entrar(pessoa1);
        elevador.entrar(pessoa2);
        elevador.sair(pessoa1);
        elevador.sair(pessoa2);
        elevador.entrar(pessoa1);
        elevador.entrar(pessoa2);
        elevador.entrar(pessoa3);
        elevador.entrar(pessoa4);
        elevador.entrar(pessoa5);
        elevador.entrar(pessoa6);
        elevador.sair(pessoa6);
        elevador.sair(pessoa1);
        elevador.entrar(pessoa6);
        elevador.sair(pessoa2);
        elevador.sair(pessoa3);
        elevador.sair(pessoa4);
        elevador.sair(pessoa5);
        elevador.sair(pessoa6);
        elevador.sair(pessoa6);
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        // Testes para 4ª Questão
        System.out.println("\n>>>> 4ª Questão - Televisão:\n");

        List<Integer> canais = Arrays.asList(3, 4, 6, 7, 9, 11, 13);

        Televisao televisao = new Televisao(9, canais, new ControleRemoto(), 4);

        televisao.getControle().aumentarVolume(televisao);
        televisao.getControle().aumentarVolume(televisao);
        televisao.getControle().aumentarVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);
        televisao.getControle().diminuirVolume(televisao);

        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().aumentarCanal(televisao);

        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);

        televisao.getControle().consultarVolume(televisao);
        televisao.getControle().consultarCanal(televisao);

        televisao.getControle().trocarCanal(13, televisao);
        televisao.getControle().trocarCanal(3, televisao);
        televisao.getControle().trocarCanal(5, televisao);

        televisao.getControle().aumentarCanal(televisao);
        televisao.getControle().diminuirCanal(televisao);

        televisao.getControle().consultarVolume(televisao);
        televisao.getControle().consultarCanal(televisao);

        // Testes para 5ª Questão
        System.out.println("\n>>>>> 5ª Questão - Pluviômetros:");

        Map<Double, String> pluviometrosLista = new HashMap<>();
        pluviometrosLista.put(81.1, "Sem Funil");
        pluviometrosLista.put(165.1, "Com Funil");
        pluviometrosLista.put(181.3, "Squitter");
        pluviometrosLista.put(200.0, "Hellmann");
        pluviometrosLista.put(471.1, "Texas");
        pluviometrosLista.put(500.0, "Ville de Paris");

        List<Caminhao> caminhoes = Selecao.inserirCaminhoes(pluviometrosLista);
        Selecao.selecionarCaminhaoMaisApto(caminhoes);


    }
}
