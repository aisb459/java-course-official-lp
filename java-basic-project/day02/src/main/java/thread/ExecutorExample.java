package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {


    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(()->{
            while(true){
                System.out.println("coding in java "+MyThreadUtil.getName());
                MyThreadUtil.sleep(1);
            }
        });
        es.submit(()->{
            int count=0;
            while(true){
                System.out.println("searching in stackoverflow  "+MyThreadUtil.getName());
                MyThreadUtil.sleep(3);
                count++;
            }
        });
        es.submit(()->{
            while(true){
                System.out.println("listening songs  "+MyThreadUtil.getName());
                MyThreadUtil.sleep(3);
            }
        });
    }

}
