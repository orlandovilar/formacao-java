package listaDeExercicios1.exercicio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Controle {

    public static String lerString() throws IOException {
        String string = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        string = st.nextElement().toString();


        return string;
    }

    public static Integer lerInteiro() throws IOException {
        Integer inteiro = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        inteiro = Integer.parseInt(st.nextElement().toString());




        return inteiro;
    }
}
