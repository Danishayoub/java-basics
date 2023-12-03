public class object {
    int logic( int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args){
        int a=10;
        int b=9;
        int c;
        object obj=new object();
        c=obj.logic(a,b );
        System.out.println(c);


    }
    
}
