package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura");
        palavras.add("casa");
        palavras.add("caelum");

        // forma destrinchada
        Comparator<String> comparador = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        palavras.sort(comparador);

        //forma compacta
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        palavras.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1.length() < s2.length())
//                    return -1;
//                if(s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });

        System.out.println(palavras);

        // forma destrinchada
        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        //forma compacta
        palavras.forEach(s -> System.out.println(s));

//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
    }
}
