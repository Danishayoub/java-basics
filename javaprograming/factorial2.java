import java.util.*;
public class factorial2 {
    public static int factorial(int n){
        int  i=1;
        int fact=1;
        while (i<=n){
            fact=fact*i;
            i++;
        }
        return fact;

    }
    public static int factorial2(int n){
        if (n==1 || n==0) 
         return 1;
         int ans=n*factorial2(n-1);
         return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    int fact=factorial2(n);
    System.out.println("the factorial is given number through iteration ="+ fact);
}
  

    
}
