package listaDeExercicios1;

import listaDeExercicios1.Model.Elevador;
import listaDeExercicios1.Model.ControleRemoto;
import listaDeExercicios1.Model.Televisao;
import listaDeExercicios1.Model.Caminhao;
import listaDeExercicios1.Model.Selecao;
import listaDeExercicios1.Service.AgendaService;
import listaDeExercicios1.Service.ElevadorService;
import listaDeExercicios1.Service.PessoaService;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

/**
 * @author José Orlando R. Vilar
 */
public class ExerciciesApplication {

    public static void main(String[] args) throws ParseException, IOException {
        // Testes para 1ª Questão
        System.out.println("> 1ª Questão - Pessoa:\n");

        PessoaService pessoa1 = new PessoaService("José Orlando", "25/03/1993", 1.74);
        pessoa1.imprimirDados(pessoa1);

        PessoaService pessoa2 = new PessoaService("Gustavo Ghastine", "06/11/1978", 1.88);
        pessoa2.imprimirDados(pessoa2);

        PessoaService pessoa3 = new PessoaService("Rayssa", "03/10/1994", 1.53);
        pessoa3.imprimirDados(pessoa3);

        PessoaService pessoa4 = new PessoaService("Tayse", "10/12/1995", 1.72);
        pessoa4.imprimirDados(pessoa4);

        PessoaService pessoa5 = new PessoaService("Mácio", "02/02/1996", 1.76);
        pessoa5.imprimirDados(pessoa5);

        PessoaService pessoa6 = new PessoaService("Fabrície", "01/01/1999", 1.68);
        pessoa6.imprimirDados(pessoa6);

        // Testes para 2ª Questão
        System.out.println(">> 2ª Questão - Agenda:");
        AgendaService agenda = new AgendaService(new ArrayList<>());

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
        ElevadorService elevador = new ElevadorService();

        elevador.inicializar(5, 8);
        elevador.entrar(null);
        elevador.entrar(pessoa1);
        elevador.entrar(pessoa2);
        elevador.sair(null);
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

        televisao.getControle().aumentarVolume(null);
        televisao.getControle().diminuirVolume(null);
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

        televisao.getControle().aumentarCanal(null);
        televisao.getControle().diminuirCanal(null);
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

        televisao.getControle().consultarVolume(null);
        televisao.getControle().consultarCanal(null);
        televisao.getControle().consultarVolume(televisao);
        televisao.getControle().consultarCanal(televisao);


        televisao.getControle().trocarCanal(1,null);
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
