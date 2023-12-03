package corejava;

public class garbage {
    @Override
        public void finalize(){
System.out.println("kaam ho gya!");
        }
    
    public static void main(String[] args) {
    //   new garbage();
    // garbage obj = new garbage();
    // obj=null;
    garbage obj1=new garbage();
    garbage obj2=new garbage();
    obj1=obj2;
      System.gc();  
    }
    
}
