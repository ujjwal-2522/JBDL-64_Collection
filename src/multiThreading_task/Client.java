package multiThreading_task;

public class Client {
    public static void main(String[] args) {
        System.out.println("Thread name is "+ Thread.currentThread());
        Task task=new Task();
        Thread thread =new Thread(task);
        thread.start() ;

    }
}
