public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Executing in: " + Thread.currentThread());
        System.out.println("Hello from runnable");
    }
}
