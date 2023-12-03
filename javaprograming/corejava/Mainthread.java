package corejava;

public class Mainthread {
    public static void main(String[] args) {
        
    
    mytask obj= new mytask();
    Mythread1 t1= new Mythread1(obj);
    Mythread2 t2= new Mythread2(obj);
    Mythread2 t3= new Mythread2(obj);
    t1.start();
    t2.start();
    t3.start();
    }
}
