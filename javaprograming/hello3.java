import java.util.Scanner;

public class hello3 {
    public static void main(String[] args) {
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        for(i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(j==n/2+1 || j==n/2+1-i ||j==n/2+1+i){
                    System.out.print(0);
                }
                else{
                System.out.print("*");
                }
            }
            System.out.print("*");
            System.out.println();
        }

    }
    
}
