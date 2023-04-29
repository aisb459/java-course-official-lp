package day05streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceOperator {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> squareRoot=(a,b)->{
            int aSq=a*a;
            int bSq=b*b;
            int twoAB=2*a*b;
            return aSq+bSq+twoAB;
        };
        System.out.println(squareRoot.apply(10,5));

        BiFunction<Integer,Integer,Integer> squareRootUsingMR=MethodReferenceOperator::computeSquareRoot;
        System.out.println(squareRootUsingMR.apply(10,5));

        Calc c=new Calc();
        BiFunction<Integer,Integer,Integer> computeEx=c::compute;
        System.out.println(computeEx.apply(10,5));

        List<Integer> list= Arrays.asList(1,2,3);
        list.forEach(System.out::println);
    }
    public static int computeSquareRoot(int a,int b){
        int aSq=a*a;
        int bSq=b*b;
        int twoAB=2*a*b;
        return aSq+bSq+twoAB;
    }
}
class  Calc{
    public int compute(int a,int b){
        return a*b;
        }
        }
