package day05streams;

import java.util.Arrays;
import java.util.List;

public class MoreMethodsOnStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        //sum of all numbers
        int sum=list
                .stream()
                .reduce(0,(total,current)->total+current)
                .intValue();
        System.out.println(sum);

        //sum of squares of all numbers
        int sumOfSquares=list
                .stream()
                .map(a->a*a)
                .reduce(0,(total,current)->total+current)
                .intValue();
        System.out.println(sumOfSquares);
    }
}
