import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("factorial of "+n+"is:"+fact);

    }
    
}
