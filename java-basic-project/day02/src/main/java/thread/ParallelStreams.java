package thread;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStreams {
    public static void main(String[] args) {
        //forkJoinExample();
        parallelStreamExample();
    }

    private static void parallelStreamExample() {
        LongStream ls=LongStream.range(1,10L);
        ls
                .parallel()
                .filter(e->{
            System.out.println("Filter " + e + " on " + MyThreadUtil.getName());
            return e%2==0;
        })
                .forEach(System.out::println);
    }

    private static void forkJoinExample() {
        ForkJoinPool fjp = new ForkJoinPool(80);

        LongStream numbers = LongStream.range(1, 100L);

        fjp.submit(() -> {
            numbers
                    .parallel()
                    .filter(e -> {
                        System.out.println("Filter " + e + " on " + MyThreadUtil.getName());
                        return e % 2 == 0;
                    })
                    .forEach(System.out::println);

        });
        MyThreadUtil.sleep(1000);
    }
}
