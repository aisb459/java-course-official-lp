package lambdastreams;

import java.util.Arrays;
import java.util.List;

public class CommonOperationsOnStream {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C#", "JavaScript", "Scala");
        //begining with J
        languages.stream().filter(e->e.startsWith("J")).forEach(e-> System.out.println(e));
        System.out.println("==================================================");
        //>3 length
        languages.stream().filter(e->e.length()>3).forEach(e-> System.out.println(e));
        System.out.println("==================================================");
        //map
        languages.stream().map(e->e.toUpperCase()).forEach(e-> System.out.println(e));
        System.out.println("==================================================");
        //map with filter
        languages.stream().filter(e->e.length()>3).filter(e->e.startsWith("J")).map(e->e.toUpperCase()).forEach(e-> System.out.println(e));

    }
}
