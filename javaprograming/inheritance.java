class base{
    int x;
    public void setx(int x){
        System.out.println("i am in base setting the x");
        this.x=x;

    }
    public int getx(){
        return x;
    }
    public void printme(){
        System.out.println("i am a constructor");

    }
}
class derived extends base{
    int y;
    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        return y;
    }

}
public class inheritance {
    public static void main(String[] args) {
derived dr=new derived();
dr.setx(24);
dr.sety(40);

System.out.println(dr.getx());
System.out.println(dr.gety());
dr.printme();
        
    }
    
}
