package corejava;

public class Mythread1 extends Thread{
    mytask obj;
    public Mythread1(mytask obj){
        this.obj=obj;

    }
    @Override
    public void run(){
        obj.task();
    }
    
    
}
