package listaDeExercicios1;

import listaDeExercicios1.Service.ControleRemotoService;
import listaDeExercicios1.Model.Televisao;
import listaDeExercicios1.Model.Caminhao;
import listaDeExercicios1.Service.SelecaoService;
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

        PessoaService pessoa1 = new PessoaService("José Orlando", 1.74, "25/03/1993");
        pessoa1.imprimirDados();

        PessoaService pessoa2 = new PessoaService("Gustavo Ghastine", 1.88, "06/11/1978");
        pessoa2.imprimirDados();

        PessoaService pessoa3 = new PessoaService("Rayssa", 1.53, "03/10/1994");
        pessoa3.imprimirDados();

        PessoaService pessoa4 = new PessoaService("Tayse", 1.72, "10/12/1995");
        pessoa4.imprimirDados();

        PessoaService pessoa5 = new PessoaService("Mácio", 1.76, "02/02/1996");
        pessoa5.imprimirDados();

        PessoaService pessoa6 = new PessoaService("Fabrície", 1.68, "01/01/1999");
        pessoa6.imprimirDados();

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
        elevador.entrar(pessoa1);
        elevador.entrar(pessoa2);
        elevador.sair(null);
        elevador.sair(pessoa1);
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

        Televisao televisao = new Televisao(9, canais, 4);
        ControleRemotoService controleRemoto = new ControleRemotoService();

        controleRemoto.aumentarVolume(null);
        controleRemoto.diminuirVolume(null);
        controleRemoto.aumentarVolume(televisao);
        controleRemoto.aumentarVolume(televisao);
        controleRemoto.aumentarVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);
        controleRemoto.diminuirVolume(televisao);

        controleRemoto.aumentarCanal(null);
        controleRemoto.diminuirCanal(null);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);
        controleRemoto.aumentarCanal(televisao);

        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);
        controleRemoto.diminuirCanal(televisao);

        controleRemoto.consultarVolume(null);
        controleRemoto.consultarCanal(null);
        controleRemoto.consultarVolume(televisao);
        controleRemoto.consultarCanal(televisao);


        controleRemoto.trocarCanal(1,null);
        controleRemoto.trocarCanal(13, televisao);
        controleRemoto.trocarCanal(3, televisao);
        controleRemoto.trocarCanal(5, televisao);

        controleRemoto.aumentarCanal(televisao);
        controleRemoto.diminuirCanal(televisao);

        controleRemoto.consultarVolume(televisao);
        controleRemoto.consultarCanal(televisao);

        // Testes para 5ª Questão
        System.out.println("\n>>>>> 5ª Questão - Pluviômetros:");

        List<Caminhao> caminhoes = SelecaoService.inserirCaminhoes();
        SelecaoService.selecionarCaminhaoMaisApto(caminhoes);


    }
}
