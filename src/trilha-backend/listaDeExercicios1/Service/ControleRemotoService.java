package listaDeExercicios1.Service;

import listaDeExercicios1.Model.Televisao;

import java.util.Optional;

/**
 * @author José Orlando R. Vilar
 */
public class ControleRemotoService {

    public void aumentarVolume(Televisao televisao) {
        System.out.println(
            Optional.ofNullable(televisao).
                    map(tv -> {
                        if (tv.getVolumeSom() < 10) {
                            tv.setVolumeSom(tv.getVolumeSom() + 1);
                            return "Volume da Televisão aumentou para " + tv.getVolumeSom();
                        }
                        return "O Volume da Televisão já está no máximo!";
                    }).orElse(">>>> Televisão inválida, não pode ser nulo.")
        );
    }

    public void diminuirVolume(Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> {
                            if (tv.getVolumeSom() > 0) {
                                tv.setVolumeSom(tv.getVolumeSom() - 1);
                                return "Volume da Televisão diminiu para " + tv.getVolumeSom();
                            }
                            return "O Volume da Televisão já está no mínimo!";
                        }).orElse(">>>> Televisão inválida, não pode ser nulo!")
        );
    }

    public void aumentarCanal(Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> {
                            if(televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1 == televisao.getCanais().size()) {
                                televisao.setCanalAtual(televisao.getCanais().get(0));
                                return "Canal da Televisão aumentou para " + televisao.getCanalAtual();
                            }
                            televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1));
                            return "Canal da Televisão aumentou para " + televisao.getCanalAtual();
                        }).orElse(">>>> Televisão inválida, não pode ser nulo!!")
        );
    }

    public void diminuirCanal(Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> {
                            if (televisao.getCanais().indexOf(televisao.getCanalAtual()) == 0) {
                                televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().size() - 1));
                                return "Canal da Televisão diminuiu para " + televisao.getCanalAtual();
                            }
                            televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) - 1));
                            return "Canal da Televisão diminuiu para " + televisao.getCanalAtual();
                        }).orElse(">>>> Televisão inválida, não pode ser nulo!!!")
        );
    }

    public void trocarCanal(Integer canal, Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> {
                            if (televisao.getCanais().contains(canal)) {
                                televisao.setCanalAtual(canal);
                                return "Canal da Televisão mudou para " + televisao.getCanalAtual();
                            }
                            return "Este Canal não foi configurado na Televisão!";
                        }).orElse(">>>> Televisão inválida, não pode ser nulo!!!!")
        );
    }

    public void consultarVolume(Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> "O Volume Atual da Televisão é: " + televisao.getVolumeSom())
                        .orElse(">>>> Televisão inválida, não pode ser nulo!!!!!")
        );
    }

    public void consultarCanal(Televisao televisao) {
        System.out.println(
                Optional.ofNullable(televisao).
                        map(tv -> "O Canal Atual da Televisão é: " + televisao.getCanalAtual())
                        .orElse(">>>> Televisão inválida, não pode ser nulo")
        );
    }
}
