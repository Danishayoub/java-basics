package corejava;

public class test2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
    
    public static void main(String[] args) {
        test2 obj= new test2();
        obj.start();
        
    }

    
}
