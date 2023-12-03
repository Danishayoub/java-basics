package corejava;

public class mythread extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){}
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        mythread obj=new mythread();
        mythread obj2=new mythread();
        mythread obj3=new mythread();
        obj.start();
        try{
            obj.join();
        }
        catch(Exception e){}
        obj2.start();
        try{
            obj2.join();
        }
        catch(Exception e){}
        obj3.start();

    }
    
}
