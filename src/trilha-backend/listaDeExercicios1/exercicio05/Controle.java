package listaDeExercicios1.exercicio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer inteiro = 0;
        String string = st.nextToken();

        if(string.matches("-?\\d+")) {
            inteiro = Integer.parseInt(string);
        }else {
            System.out.println("Não é um número válido!");
        }

        return inteiro;
    }
}
