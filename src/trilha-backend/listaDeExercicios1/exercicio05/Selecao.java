package listaDeExercicios1.exercicio05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Selecao extends Controle {
    List<Caminhao> caminhoes;

    public void inserirCaminhoes() throws IOException {
        this.caminhoes = new ArrayList<Caminhao>();
        String tipoCaminhao = null;
        Integer totalPluviometros = 0;
        List<String> pluviometros = new ArrayList<String>();
        Integer index = 0;
        Caminhao caminhao;

        System.out.printf("\nInserindo Caminhões:");

        do {
            System.out.printf("\nInforme o Tipo do Caminhão: ");
            tipoCaminhao = lerString();
            if(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim")) {
                System.out.println("Tipo do Caminhão só poder ser 'Alfa' ou 'Beta'. Digite 'Fim' para sair.");
            }
        }while(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim"));

        while(!tipoCaminhao.matches("Fim")) {
            System.out.printf("Informe a Capacidade Total de Pluviômetros do Caminhão: ");
            totalPluviometros = lerInteiro();
            index = totalPluviometros;

            while(index > 0) {
                System.out.printf("Informe o Tipo do pluviômetro: ");
                pluviometros.add(lerString());

                index--;
            }
            caminhao = new Caminhao(tipoCaminhao, totalPluviometros, pluviometros);
            this.caminhoes.add(caminhao);
            pluviometros = new ArrayList<String>();

            do {
                System.out.printf("\nInforme o Tipo do Caminhão: ");
                tipoCaminhao = lerString();
                if(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim")) {
                    System.out.println("Tipo do Caminhão só poder ser 'Alfa' ou 'Beta'. Digite 'Fim' para sair.");
                }
            }while(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim"));
        }

        selecionarCaminhaoMaisApto(caminhoes);
    }

    public static void selecionarCaminhaoMaisApto(List<Caminhao> caminhoes) {
        Caminhao caminhaoMaisApto = null;
        Stream<Caminhao> stream;

        if(caminhoes != null) {
            Comparator<Caminhao> maisApto = (caminhao1, caminhao2) -> {
                if(caminhao1.getTotalPluviometros() > caminhao2.getTotalPluviometros()) return 1;
                if(caminhao1.getTotalPluviometros() < caminhao2.getTotalPluviometros()) return -1;
                return 0;
            };

            caminhaoMaisApto = caminhoes.stream().max(maisApto).get();

            System.out.println("\nCaminhão Mais Apto:\n");
            System.out.println("Tipo do Caminhão: " + caminhaoMaisApto.getTipo());
            System.out.println("Capacidade de Carga: " + caminhaoMaisApto.getTotalPluviometros() + " pluviômetros");
            System.out.printf("Pluviômetros transportados:\n");
            caminhaoMaisApto.getPluviometros().stream().forEach(System.out::println);
        }
    }

    public List<Caminhao> getCaminhoes() {
        return caminhoes;
    }
}
