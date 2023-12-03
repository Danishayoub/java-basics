package corejava;

public class Mythread3 extends Thread{
    mytask obj;
    public Mythread3(mytask obj){
        this.obj=obj;

    }
    @Override
    public void run(){
        obj.task();
    }
    
    
}
