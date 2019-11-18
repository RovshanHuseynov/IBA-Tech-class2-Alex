package lesson14;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetRidOfVowels {

    public static void main(String[] args) {

        String str = "Hello Baku";

        String withoutVowels = filter(str);
        System.out.println(withoutVowels);
    }

    static String filter(String origin) {

        String vowels = "AOUIE";

        String collect = origin.chars().mapToObj(c -> (char) c)
                .filter(c -> !vowels.contains((Character.toUpperCase(c) + "")))
                .map(String::valueOf).collect(Collectors.joining());

        return collect;

        /*
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<origin.length(); i++) {
            if(!vowels.contains((origin.charAt(i)+"").toUpperCase())) {
                sb.append(origin.charAt(i));
            }
        }
        return sb.toString();*/
    }
}
