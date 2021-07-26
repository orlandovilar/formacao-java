package javaIO.br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeituraEscrita {

    public static void main(String[] args) throws IOException {
        //lerArquivo();
        //escreverArquivo();
        //lerEscreverArquivo();
        //criarArquivoFileWriter();
        criarArquivoPrintStream();
    }

    public static void lerArquivo() throws IOException {
        // Fluxo de Entrada com arquivo com Padrão de Projeto Decorator
        FileInputStream fis = new FileInputStream("lorem.txt"); // recebendo o
        // arquivo e criando o fluxo concreto, mas ainda binário
        InputStreamReader isr = new InputStreamReader(fis); // melhorando os dados binários
        // para caracteres
        BufferedReader br = new BufferedReader(isr);// trabalhando com os caracteres linha por linha
        String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }

    public static void escreverArquivo() throws IOException {
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        bw.newLine();
        //bw.newLine();
        bw.write("José Orlando Ramos Vilar");

        bw.close();
    }

    public static void lerEscreverArquivo() throws IOException {
        InputStream fis = System.in;
        //InputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out;
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }

    public static void criarArquivoFileWriter() throws IOException {
        FileWriter fw = new FileWriter("lorem3.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("José Orlando Ramos Vilar");
        bw.newLine();
        bw.newLine();
        bw.write("Estagiário");

        bw.close();
    }

    public static void criarArquivoPrintStream() throws FileNotFoundException {
        PrintStream ps = new PrintStream("lorem4.txt");

        ps.println("José Orlando");
        ps.println("Ramos Vilar");
        ps.println();
        ps.println();
        ps.println("28 anos.");

        ps.close();
    }
}
