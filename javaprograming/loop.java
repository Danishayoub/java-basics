import java.util.Scanner;



public class loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<=n;i++){  
            for(j=0;j<n;j++){
                if(j==n/2 || j==n/2-i){
                    System.out.print("*"); 
                } 
                else{
                System.out.print("0");
                }
                
            }
            System.out.println();

            }
            
        }
        
    }
    

