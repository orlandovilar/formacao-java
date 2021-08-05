package listaDeExercicios1.Model;

import java.util.Optional;

/**
 * @author José Orlando R. Vilar
 */
public class ControleRemoto {

    public void aumentarVolume(Televisao televisao) {
        System.out.println(
            Optional.ofNullable(televisao).
                    map(tv -> {
                        if (tv.getVolumeSom() < 10) {
                            tv.setVolumeSom(tv.getVolumeSom() + 1);
                            return "Volume da Televisão aumentou para " + tv.getVolumeSom();
                        }
                        return "O Volume da Televisão já está no máximo!";
                    }).orElse(">>>> Televisão inválida, não pode ser nulo!!!")
        );
    }

    public void diminuirVolume(Televisao televisao) {
        if(televisao != null) {
            if (televisao.getVolumeSom() > 0) {
                televisao.setVolumeSom(televisao.getVolumeSom() - 1);
                System.out.println("Volume da Televisão diminiu para " + televisao.getVolumeSom());
            } else {
                System.out.println("O Volume da Televisão já está no mínimo!");
            }
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }

    public void aumentarCanal(Televisao televisao) {
        if(televisao != null) {
            if (televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1 == televisao.getCanais().size()) {
                televisao.setCanalAtual(televisao.getCanais().get(0));
                System.out.println("Canal da Televisão aumentou para " + televisao.getCanalAtual());
            } else {
                televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1));
                System.out.println("Canal da Televisão aumentou para " + televisao.getCanalAtual());
            }
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }

    public void diminuirCanal(Televisao televisao) {
        if(televisao != null) {
            if (televisao.getCanais().indexOf(televisao.getCanalAtual()) == 0) {
                televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().size() - 1));
                System.out.println("Canal da Televisão diminuiu para " + televisao.getCanalAtual());
            } else {
                televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) - 1));
                System.out.println("Canal da Televisão diminuiu para " + televisao.getCanalAtual());
            }
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }

    public void trocarCanal(Integer canal, Televisao televisao) {
        if(televisao != null) {
            if (televisao.getCanais().contains(canal)) {
                televisao.setCanalAtual(canal);
                System.out.println("Canal da Televisão mudou para " + televisao.getCanalAtual());
            } else {
                System.out.println("Este Canal não foi configurado na Televisão!");
            }
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }

    public void consultarVolume(Televisao televisao) {
        if(televisao != null) {
            System.out.println("O Volume Atual da Televisão é: " + televisao.getVolumeSom());
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }

    public void consultarCanal(Televisao televisao) {
        if(televisao != null) {
            System.out.println("O Canal Atual da Televisão é: " + televisao.getCanalAtual());
        }else {
            System.out.println(">>>> Televisão inválida, não pode ser nulo!");
        }
    }
}