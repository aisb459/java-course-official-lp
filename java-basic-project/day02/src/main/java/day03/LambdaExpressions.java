package day03;

public class LambdaExpressions {
    public static void main(String[] args) {
        Greetings greet=new GreetingsImpl();
        System.out.println(greet.hi("Aishwarya"));

        Greetings greetintermediatestye=new Greetings() {
            @Override
            public String hi(String name) {
                return "hi"+name;
            }
            public void dosomething(){
                System.out.println("something");
            }
        };
        System.out.println(greetintermediatestye.hi("AishIntermediateStyle"));
        //greetintermediatestye.dosomething();

        Greetings greetModern=name->"HI Aishwarya modern"+name;
        System.out.println(greetModern.hi("welcome"));

        Greetings greet2=name->{
            return "Aishwarya inside anonymous block"+ name;
        };
        System.out.println(greet2.hi("!!!"));

    }
}

interface Greetings{
    String hi(String name);

}
class GreetingsImpl implements Greetings{

    @Override
    public String hi(String name) {
        return "hi"+name;
    }
}
