package listaDeExercicios1.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author José Orlando R. Vilar
 */
public class ControleService {

    public static String lerString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static Integer lerInteiro() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inteiro = 0;
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
