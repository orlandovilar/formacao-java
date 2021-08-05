package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Caminhao;
import listaDeExercicios1.Service.ControleService;

import java.io.IOException;
import java.util.*;

/**
 * @author José Orlando R. Vilar
 */
public class SelecaoService extends ControleService {
    private static Map<Double, String> pluviometrosLista = new HashMap<>();

    public static List<Caminhao> inserirCaminhoes() throws IOException {
        List<Caminhao> caminhoes = new ArrayList<>();
        String tipoCaminhao = "";
        Integer totalPluviometros = 0;
        List<String> pluviometrosCaminhao = new ArrayList<>();
        Double capacidadeTotal = 0.0;
        Boolean existeTipoPluviometro;
        String pluviometro;
        int index = 0;
        Caminhao caminhao;

        pluviometrosLista.put(81.1, "Sem Funil");
        pluviometrosLista.put(165.1, "Com Funil");
        pluviometrosLista.put(181.3, "Squitter");
        pluviometrosLista.put(200.0, "Hellmann");
        pluviometrosLista.put(471.1, "Texas");
        pluviometrosLista.put(500.0, "Ville de Paris");

        System.out.printf("\nInserindo Caminhões:\n");

        while (!tipoCaminhao.matches("Fim")) {
            do {
                System.out.println("\nTipos de Caminhão: [Alfa, Beta]");
                System.out.printf("\nInforme o Tipo do Caminhão ou digite 'Fim' para sair: ");
                tipoCaminhao = lerString();
                if (!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim")) {
                    System.out.println(">> O Tipo do Caminhão só poder ser 'Alfa' ou 'Beta', ou Digite 'Fim' para sair.");
                }
            } while (!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim"));

            if(!tipoCaminhao.matches("Fim")) {
                do {
                    System.out.printf("Informe a Quantidade de Pluviômetros do Caminhão: ");
                    totalPluviometros = lerInteiro();
                }while(totalPluviometros == 0);

                while (index < totalPluviometros) {
                    do {
                        if (index == 0) {
                            System.out.println("Tipos de Pluviômetro:");
                            for (Map.Entry<Double, String> pluviometros : pluviometrosLista.entrySet()) {
                                System.out.println("[" + pluviometros.getValue() + ": " + pluviometros.getKey() + "cm²]");
                            }
                        }
                        System.out.printf("Informe o Tipo do " + (index + 1) + "º pluviômetro: ");

                        pluviometro = lerString();
                        existeTipoPluviometro = pluviometrosLista.containsValue(pluviometro);
                        if (!existeTipoPluviometro) {
                            System.out.println(">> O Tipo de Pluviômetro informado não está cadastrado!\n");
                        } else {
                            pluviometrosCaminhao.add(pluviometro);
                            for (Map.Entry<Double, String> pluviometroEntry : pluviometrosLista.entrySet()) {
                                if (pluviometroEntry.getValue().matches(pluviometro)) {
                                    capacidadeTotal += pluviometroEntry.getKey();
                                }
                            }
                        }
                    } while (!existeTipoPluviometro);

                    index++;
                }
            }

            if(totalPluviometros != 0) {
                caminhao = new Caminhao(tipoCaminhao, totalPluviometros, pluviometrosCaminhao, capacidadeTotal);
                caminhoes.add(caminhao);
            }

            index = 0;
            capacidadeTotal = 0.0;
            pluviometrosCaminhao = new ArrayList<>();
        }

        return caminhoes;
    }

    public static void selecionarCaminhaoMaisApto(List<Caminhao> caminhoes) {
        Caminhao caminhaoMaisApto;

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
            caminhaoMaisApto.getPluviometros().forEach(p -> {
                for (Map.Entry<Double, String> pluviometros : pluviometrosLista.entrySet()) {
                    if(p.matches(pluviometros.getValue()))
                        System.out.println("> " + pluviometros.getValue() + ": " + pluviometros.getKey() + "cm²");
                }
            });
            System.out.println("Capacidade Total de carga: " + caminhaoMaisApto.getCapacidadeTotal() + "cm²");
        }else {
            System.out.println("Nenhum Caminhão foi cadastrado!");
        }
    }
}
