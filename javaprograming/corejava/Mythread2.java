package corejava;

public class Mythread2 extends Thread{
    mytask obj;
    public Mythread2(mytask obj){
        this.obj=obj;

    }
    @Override
    public void run(){
        obj.task();
    }
    
    
}
