import java.util.Scanner;

public class pattern2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
             if(j==n/2+1){
                System.out.print("*");
             }  
             System.out.print("0");            
            }
            System.out.println();
        }
        
    }
    
}