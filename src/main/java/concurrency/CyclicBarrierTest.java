package concurrency;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        int count = 100;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count);
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++)
            executorService.execute(new CyclicBarrierTest().new Task(cyclicBarrier));
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    class Task implements Runnable {
        private CyclicBarrier cyclicBarrier;

        public Task(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run() {
            try {
                cyclicBarrier.await();
                System.out.println("做点什么" + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
