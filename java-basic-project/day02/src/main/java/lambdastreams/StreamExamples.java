package lambdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C#", "JavaScript", "Scala");
        Stream<String> languagesStream=languages.stream();
        languagesStream.forEach(e-> System.out.println(e));
        //stream cannot be reused
        //languagesStream.forEach(e-> System.out.println(e));

    }
}
