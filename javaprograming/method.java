import java.util.Scanner;

public class method{
    static int logic(int a, int b){
int c;
if(a>b){
    c=a+b;
}
else{
    c=(a+b)*5;
}
return c;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number x:");
        int x= sc.nextInt();
        System.out.println("enter the number y:");
        int y= sc.nextInt();
        int z=logic(x, y);
        System.out.println("the result is:");
        System.out.println(z);
      
    }
}