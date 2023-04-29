package thread;

public class ThreadStrategy {
    public static void main(String[] args) {
        int numOfCores=Runtime.getRuntime().availableProcessors();
        System.out.println(numOfCores);
    }
}
