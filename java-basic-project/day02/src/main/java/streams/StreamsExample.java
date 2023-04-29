package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        countStringLengthMoreThan3();
        countNumberOfStringStartsWith("d");
        removeAllEmptyStringsFromList();
        createListWithStringMoreThan2Characters();
        //Convert String to uppercase and Join them with coma
        conStrtoUpperAndJoinWithComa();
        //Create a List of the square of all distinct numbers
        CreateListOfSqr();
    }

    private static void CreateListOfSqr() {
        List<Integer> intList=Arrays.asList(1,2,1);
        List<Integer> result=intList
                .stream()
                .map(e->e*e)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Create a List of the square of all distinct numbers");
        result.forEach(System.out::println);

    }

    private static void conStrtoUpperAndJoinWithComa() {
        List<String> strList=Arrays.asList("abc","ac","def");
        String s=strList
                .stream()
                .map(e->e.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println("Convert String to uppercase and Join them with coma"+s);
    }

    private static void createListWithStringMoreThan2Characters() {
        List<String> strList=Arrays.asList("abc","ac","def","");
        List<String> result=strList
                .stream()
                .filter(e->e.length()>2)
                .collect(Collectors.toList());
        System.out.println("createListWithStringMoreThan2Characters");
        result.forEach(System.out::println);
    }

    private static void removeAllEmptyStringsFromList() {
        List<String> strList=Arrays.asList("abc","","def");
        List<String> result=strList
                .stream()
                .filter(e-> !e.isEmpty())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }

    private static void countNumberOfStringStartsWith(String a) {
        List<String> strList=Arrays.asList("abc","","def","adf");
        Long count=strList
                .stream()
                .filter(e->e.startsWith(a))
                .count();
        System.out.println(count);
    }

    private static void countStringLengthMoreThan3() {
        List<String> strList= Arrays.asList("Books","","egg","ac");
        Long count=strList
                .stream()
                .filter(e->e.length()>3)
                .count();
        System.out.println(count);
    }
}
