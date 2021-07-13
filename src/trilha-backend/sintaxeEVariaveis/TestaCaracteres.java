package sintaxeEVariaveis;

public class TestaCaracteres {

    public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String frase = "alura cursos online de tecnolgia";
        frase = frase + " 2021!";
        System.out.println(frase);
    }
}
