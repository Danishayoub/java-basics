class employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
   
    public String getname(){
        return name;
    }
    public void setname(String n){
       name=n; 
    }
}
class cellphone{
    public void ring(){
        System.out.println("ring");
    }
    public void vibrate(){
        System.out.println("vibrat");
    }
    public void callfriend(){
        System.out.println("calling saif");
    }
}

public class object2 {
    public static void main(String[] args) {
        employee1 shayan = new employee1();
        shayan.setname("shayanhaider");
        shayan.salary=40000;
        System.out.println(shayan.getsalary());
        
        System.out.println(shayan.getname());
        System.out.println();
        cellphone vivo=new cellphone();
        vivo.callfriend();
        vivo.vibrate();
        vivo.ring();
        
    }
    
}
