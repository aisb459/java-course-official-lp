package lambdastreams;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class lab06 {
    public static void main(String[] args) {
        Calc add=(num1,num2)-> num1+num2;
        Calc subtract=(num1,num2)->num1-num2;
        Calc multiply=(num1,num2)->num1*num2;

        System.out.println(add.calculate(10,5));
        System.out.println(subtract.calculate(10,5));
        System.out.println(multiply.calculate(10,5));

        operate((num1,num2)->{
            lab06 obj=new lab06();
            obj.testMethod2();
            testMethod();
            return num1+num2;
        });
        operate((num1,num2)->num1-num2);
        operate((num1,num2)->num1*num2);

        System.out.println("====================================================================");

        //BuiltIn Functional Interfaces
        //Function
        BiFunction<Integer,Integer,Integer> addUsingFunction=(num1,num2)->num1+num2;
        System.out.println(addUsingFunction.apply(10,5));

        BiFunction<Integer,Integer,Integer> subUsingFunction=(num1,num2)->num1-num2;
        System.out.println(subUsingFunction.apply(10,5));

        BiFunction<Integer,Integer,Integer> multiplyUsingFunction=(num1,num2)->num1*num2;
        System.out.println(multiplyUsingFunction.apply(10,5));

        operateUsingFunction((num1,num2)->num1+num2);

        //Predicate
        //usernamevalidator
        String un="aaaaaaaaaa";
        Predicate<String> usernamePredicateGt6=userName->userName.length()>6;
        Predicate<String> usernamePredicateLt12=userName->userName.length()<12;
        Boolean isUserNameValidlength=usernamePredicateGt6.and(usernamePredicateLt12).test(un);

        Predicate<String> usernamePredicateNotEmpty=userName->userName.isEmpty();
        Boolean isnotempty=usernamePredicateNotEmpty.negate().test(un);

        Predicate<String> usernamePredicateNotBlank=userName->userName.isBlank();
        Boolean isnotblank=usernamePredicateNotBlank.negate().test(un);

        Predicate<String> usernamePredicateNotNull=userName->userName==null;
        Boolean isnotnull=usernamePredicateNotNull.negate().test(un);
        System.out.println(isUserNameValidlength+"==="+isnotempty+"==="+isnotblank+"==="+isnotnull);
        Boolean isUserNameValid=false;
        if(isUserNameValidlength && isnotempty && isnotblank && isnotnull){
            isUserNameValid=true;
        }
        System.out.println("userNameValidation==="+isUserNameValid);

        //passwordvalidator
        String pw="aaaaaaaaA1";
        Predicate<String> pwPredicateGt6=password->password.length()>8;
        Predicate<String> pwPredicateLt12=password->password.length()<14;
        Boolean isPWValidlength=pwPredicateGt6.and(pwPredicateLt12).test(pw);

        Predicate<String> pwPredicateNotEmpty=password->password.isEmpty();
        Boolean isPWnotempty=pwPredicateNotEmpty.negate().test(pw);

        Predicate<String> pwPredicateNotBlank=password->password.isBlank();
        Boolean isPWnotblank=pwPredicateNotBlank.negate().test(pw);

        Predicate<String> pwPredicateNotNull=password->password==null;
        Boolean isPWnotnull=pwPredicateNotNull.negate().test(pw);

        Predicate<String> pwPredicateOneUPPER=password->{
            for(int i=0;i<password.length();i++){
                if(Character.isUpperCase(password.charAt(i))){
                        return true;
                }
            }
            return false;
        };
        Boolean hasUPPER=pwPredicateOneUPPER.test(pw);

        Predicate<String> pwPredicateOneDigit=password->{
            for(int i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i))){
                    return true;
                }
            }
            return false;
        };

        Boolean hasDigit=pwPredicateOneDigit.test(pw);

        System.out.println(isPWValidlength+"=="+isPWnotempty+"=="+isPWnotblank+"==="+isPWnotnull+"=="+hasUPPER+"=="+hasDigit);

        Boolean isPWValid=false;
        if(isPWValidlength && isPWnotempty && isPWnotblank && isPWnotnull && hasUPPER && hasDigit){
            isPWValid=true;

        }

        System.out.println("PW valid==="+isPWValid);














//        Boolean isUserNameValid2=usernamePredicateGt6.and(usernamePredicateLt12).test("ajbjb");
//
//        System.out.println(isUserNameValid2);
//        Predicate<Integer> isGt10 = num -> num > 10;
//        System.out.println(isGt10.test(15));
    }

    static void operate(Calc calc){
        System.out.println(calc.calculate(10,5));
    }
    void testMethod2(){

    }

    static void testMethod(){

    }
    static void operateUsingFunction(BiFunction<Integer,Integer,Integer> bifunc){
        System.out.println(bifunc.apply(10,5));
    }
}
interface Calc {
    int calculate(int num1,int num2);
        }
