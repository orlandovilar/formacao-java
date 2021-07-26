package javaIO.br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com arquivo com Padrão de Projeto Decorator
        FileInputStream file = new FileInputStream("lorem.txt"); // recebendo o
        // arquivo e criando o fluxo concreto, mas ainda binário
        InputStreamReader isr = new InputStreamReader(file); // melhorando os dados binários
        // para caracteres
        BufferedReader br = new BufferedReader(isr);// trabalhando com os caracteres linha por linha

        String linha = br.readLine();

        System.out.println(linha);

        br.close();
    }
}
