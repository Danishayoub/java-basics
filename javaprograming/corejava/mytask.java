package corejava;

public class mytask {
    public synchronized void task(){
        for(int i=1;i<=3;i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
            System.out.println(i);
        }
    }
    
}
