public class Thread1  extends Thread {
    @Override
    public void run() {
        System.out.println("I am in thread 1");
    }

    public static void main(String[] args) {
       Thread1 t1=new Thread1();
       t1.start();
    }
}