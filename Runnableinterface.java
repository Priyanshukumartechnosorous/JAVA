
public class Runnableinterface {
    public static void main(String[] args) {
        
    
    MyThread m = new MyThread();
    Thread t = new Thread(m);
    t.start();

    int i = 1;
    while(i<5) {
        System.out.println(i + "world");
    }
}

}
class MyThread implements Runnable {
    public void run() {
        int i = 1;
        while (i<5) {
            System.out.println(i + "hello");
            i++;
            
        }
    }
}