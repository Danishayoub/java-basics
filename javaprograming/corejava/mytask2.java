package corejava;

public class mytask2 extends Thread{
    @Override
    public void run(){
        System.out.println("current thread :-"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        mytask2 t1= new mytask2();
        t1.setName("murli");
        t1.start();
    }
    
}
