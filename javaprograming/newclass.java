
class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is :"+id);
        System.out.println("my name is :"+ name);
    }
    public int getsalary(){

    return salary;
    }
}
public class newclass{
    public static void main(String[] args) {
        employee danish=new employee();
        employee john = new employee();
        employee aman = new employee();
      
     //setting attribute
        danish.id=12;
        danish.name="danishayoub";
        danish.salary=500000;
       
        john.id=13;
        john.name="john abaraham";
        john.salary=40000;
        aman.id =14;
        aman.name ="aman akhtar";
        aman.salary=200000;
       // System.out.println(danish.id);
        //System.out.println(danish.name);
     danish.printdetails();
     int salary=danish.getsalary();
     System.out.println("The salary is:"+salary);
     john.printdetails();
     int salary2=john.getsalary();
     System.out.println("The salary is:"+salary2);
     aman.printdetails();
     int salary3=aman.getsalary();
     System.out.println("The salary is:"+salary3);
    

    }
    
}
