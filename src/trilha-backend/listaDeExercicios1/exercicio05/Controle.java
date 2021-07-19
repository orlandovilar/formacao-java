package listaDeExercicios1.exercicio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author José Orlando R. Vilar
 */
public class Controle {

    public static String lerString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        return string;
    }

    public static Integer lerInteiro() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer inteiro = 0;
        String string = br.readLine();

        try {
            inteiro = Integer.parseInt(string);
        }catch(NumberFormatException excecaoFormatoNumero) {
            System.out.println("\nMensagem de Erro: " + excecaoFormatoNumero.getMessage());
            System.out.println(">> O número informado não é válido!");
        }

        return inteiro;
    }
}
