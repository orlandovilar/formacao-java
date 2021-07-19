package listaDeExercicios1.exercicio05;

import java.io.IOException;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author José Orlando R. Vilar
 */
public class Selecao extends Controle {

    public static List<Caminhao> inserirCaminhoes(Map<Double, String> pluviometrosLista) throws IOException {
        List<Caminhao> caminhoes = new ArrayList<Caminhao>();
        String tipoCaminhao = null;
        Integer totalPluviometros = 0;
        List<String> pluviometrosCaminhao = new ArrayList<String>();
        Double capacidadeTotal = 0.0;
        Boolean existeTipoPluviometro;
        String pluviometro;
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
                do {
                    System.out.printf("Informe o Tipo do pluviômetro " + pluviometrosLista.values() + ": " );
                    pluviometro = lerString();
                    existeTipoPluviometro = pluviometrosLista.containsValue(pluviometro);
                    if(!existeTipoPluviometro) {
                        System.out.println("Tipo de Pluviômetro inválido!\n");
                    }else {
                        pluviometrosCaminhao.add(pluviometro);
                        for(Map.Entry<Double, String> pluviometroEntry : pluviometrosLista.entrySet()) {
                            if(pluviometroEntry.getValue().matches(pluviometro)) {
                                capacidadeTotal += pluviometroEntry.getKey();
                            }
                        }
                    }
                }while(!existeTipoPluviometro);

                index--;
            }

            if(totalPluviometros != 0) {
                caminhao = new Caminhao(tipoCaminhao, totalPluviometros, pluviometrosCaminhao, capacidadeTotal);
                caminhoes.add(caminhao);
            }

            capacidadeTotal = 0.0;
            pluviometrosCaminhao = new ArrayList<String>();

            do {
                System.out.printf("\nInforme o Tipo do Caminhão: ");
                tipoCaminhao = lerString();
                if(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim")) {
                    System.out.println("Tipo do Caminhão só poder ser 'Alfa' ou 'Beta'. Digite 'Fim' para sair.");
                }
            }while(!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim"));
        }

        return caminhoes;
    }

    public static void selecionarCaminhaoMaisApto(List<Caminhao> caminhoes) {
        Caminhao caminhaoMaisApto = null;
        Stream<Caminhao> stream;

        if(caminhoes != null && !caminhoes.isEmpty()) {
            Comparator<Caminhao> maisApto = (caminhao1, caminhao2) -> {
                if (caminhao1.getCapacidadeTotal() > caminhao2.getCapacidadeTotal()) return 1;
                if (caminhao1.getCapacidadeTotal() < caminhao2.getCapacidadeTotal()) return -1;
                return 0;
            };

            caminhaoMaisApto = caminhoes.stream().max(maisApto).get();

            System.out.println("\n>>>>> Caminhão Mais Apto:\n");
            System.out.println("Tipo do Caminhão: " + caminhaoMaisApto.getTipo());
            System.out.println("Quantidade de Pluviômetros: " + caminhaoMaisApto.getTotalPluviometros() + " pluviômetros");
            System.out.printf("Pluviômetros transportados:\n");
            caminhaoMaisApto.getPluviometros().stream().forEach(p -> System.out.println("> " + p));
            System.out.println("Capacidade Total de carga em cm²: " + caminhaoMaisApto.getCapacidadeTotal());
        }else {
            System.out.println("Nenhum Caminhão foi cadastrado!");
        }
    }
}
