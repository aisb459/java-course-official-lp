package lambdastreams;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        System.out.println(printStringExample("test"));
    }

    private static String printStringExample(String test) {
        Optional<String> optional=Optional.ofNullable(test);
        if(optional.isPresent()){
            return "test is of length "+test.length();
        }
        return "string is null";
    }
}
