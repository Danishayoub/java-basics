class mymainemployee{
    private int id;
    private String name;
    private int salary;
    public mymainemployee(){
        id=24;
        name="my name is here";
    }
    public mymainemployee(String myname,int myid,int mysalary){
        id=myid;
        name= myname;
        salary=mysalary;
    }
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
    public int getsalary(){
        return salary;
    }

}


public class constructor {
    public static void main(String[] args) {
       mymainemployee shayan = new mymainemployee("shayan",12,1000); 
       mymainemployee harry = new mymainemployee(); 
      System.out.println( shayan.getId());
    System.out.println(shayan.getName());
    System.out.println(shayan.getsalary());
    System.out.println(harry.getId());
    System.out.println(harry.getName());
    }
    
}
