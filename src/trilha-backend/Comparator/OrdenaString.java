package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaString {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura");
        palavras.add("casa");
        palavras.add("caelum");

        // forma destrinchada
        Comparator<String> comparador1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        palavras.sort(comparador1);

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

        //forma compacta
        palavras.sort(Comparator.comparing(s -> s.length()));

        //forma mais compacta ainda
        palavras.sort(Comparator.comparing(String::length));

        //forma destrinchada
        Function<String, Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<String> comparador2 = Comparator.comparing(funcao);
        palavras.sort(comparador2);

        System.out.println(palavras);

        // forma destrinchada
        Consumer<String> impressor = System.out::println;
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
