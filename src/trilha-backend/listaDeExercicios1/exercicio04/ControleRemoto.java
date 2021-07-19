package listaDeExercicios1.exercicio04;

/**
 * @author José Orlando R. Vilar
 */
public class ControleRemoto {

    public void aumentarVolume(Televisao televisao) {
        if(televisao.getVolumeSom() < 10) {
            televisao.setVolumeSom(televisao.getVolumeSom() + 1);
            System.out.println("Volume da Televisão aumentou para " + televisao.getVolumeSom());
        }else {
            System.out.println("O Volume da Televisão já está no máximo!");
        }
    }

    public void diminuirVolume(Televisao televisao) {
        if(televisao.getVolumeSom() > 0) {
            televisao.setVolumeSom(televisao.getVolumeSom() - 1);
            System.out.println("Volume da Televisão diminiu para " + televisao.getVolumeSom());
        }else {
            System.out.println("O Volume da Televisão já está no mínimo!");
        }
    }

    public void aumentarCanal(Televisao televisao) {
        if(televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1 == televisao.getCanais().size()) {
            televisao.setCanalAtual(televisao.getCanais().get(0));
            System.out.println("Canal da Televisão aumentou para " + televisao.getCanalAtual());
        }else {
            televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) + 1));
            System.out.println("Canal da Televisão aumentou para " + televisao.getCanalAtual());
        }
    }

    public void diminuirCanal(Televisao televisao) {
        if(televisao.getCanais().indexOf(televisao.getCanalAtual()) == 0) {
            televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().size() - 1));
            System.out.println("Canal da Televisão diminuiu para " + televisao.getCanalAtual());
        }else {
            televisao.setCanalAtual(televisao.getCanais().get(televisao.getCanais().indexOf(televisao.getCanalAtual()) - 1));
            System.out.println("Canal da Televisão diminuiu para " + televisao.getCanalAtual());
        }
    }

    public void trocarCanal(Integer canal, Televisao televisao) {
        if(televisao.getCanais().contains(canal)) {
            televisao.setCanalAtual(canal);
            System.out.println("Canal da Televisão mudou para " + televisao.getCanalAtual());
        }else {
            System.out.println("Este Canal não foi configurado na Televisão!");
        }
    }

    public void consultarVolume(Televisao televisao) {
        System.out.println("O Volume Atual da Televisão é: " + televisao.getVolumeSom());
    }

    public void consultarCanal(Televisao televisao) {
        System.out.println("O Canal Atual da Televisão é: " + televisao.getCanalAtual());
    }
}