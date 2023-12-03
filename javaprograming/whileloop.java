import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int a=3;
       
        while(!(a==0)){
            
            System.out.println("Enter 1 for area of rectangle");
            System.out.println("Enter 2 for area of circle");
            System.out.println("Enter 0 for Exit");
              a=sc.nextInt();
            if(a==1){
                System.out.println("Enter the length of rectangle");
                int l=sc.nextInt();
                System.out.println("Enter the breadth of recatngle");
                int b=sc.nextInt();
                int areaofrectangle=l*b;
                System.out.println("The area of rectangle is:" +areaofrectangle);
            }
            if(a==2){
                System.out.println("Enter the radius of circle ");
                int r=sc.nextInt();
                double z=3.14*r*r;
                System.out.println("The area of circle is: "+z);

            }
            if(a==0){
                System.out.println("you are exited now");
            }
            

        }
    }
    
}
