class ekclass{
    int a;
    public int geta(){
        return a;
    }
  
    ekclass(int a){
       this.a= a;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("I am a constructor");
    }

}
public class this_super {
    public static void main(String[] args) {
        doclass d= new doclass(5);
        ekclass e= new ekclass(56);
        System.out.println(e.geta());
   
    }
    
}
