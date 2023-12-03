class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int a){
        System.out.println("I am a overloaded constructor with the value is :" + a);
    }
}
class derived1 extends base1{
    derived1(){
        
       
        System.out.println("I am a derived class constructor");

}
derived1(int a , int b){
    super(a);
    System.out.println("I am a overloaded constructor with value of b:"+b);
}
}
class derived2 extends derived1{
    derived2(){
        
        
        System.out.println("I am a derived2 constructor");
    }
    derived2(int a ,int b,int c){
        super(a,b);
        System.out.printf("i am overloaded constructor of derived2 with value of c:"+ c   );
    }
}
public class constructorinheritance {
    public static void main(String[] args) {
        derived2 b= new derived2(2,3,7);


    }
    
}
