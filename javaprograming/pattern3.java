import java.util.Scanner;

public class pattern3 {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("The pattern is:");
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
    
}
