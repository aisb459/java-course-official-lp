package thread;

public class MyThreadUtil {
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getName(){
        return Thread.currentThread().getName();
    }
}
