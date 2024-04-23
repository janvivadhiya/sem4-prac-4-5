class Counter {
    private int count = 0;

  
    public synchronized void increment() {
        count++;
    }

  
    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

   
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread[] threads = new IncrementThread[5];

     
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

 
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

       
        System.out.println("Final count: " + counter.getCount());
    }
}
