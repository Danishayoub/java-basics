import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<n+n;j++){
                if(j==n+1|| j==n-i+1|| j==n+i+1){
                    System.out.print("0");
                }else{
                System.out.print("*");
                }
            }
            System.out.println("*");
        }
    }
    
}
