class myemployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id= i;
     }
    public int getId(){
    return id;
    }

}
public class accessmodifier {
  
    public static void main(String[] args) {
        myemployee shayan= new myemployee();
        shayan.setName("shayan haider");
        shayan.setId(1);
        System.out.println( shayan.getId());
      System.out.println  (shayan.getName());
      
       
        
    }
    
}
