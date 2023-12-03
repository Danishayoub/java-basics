import java.util.Scanner;

public class elseif {
    public static void main(String[] args){
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        age=sc.nextInt();
        if(age>58){
            System.out.println("you are experinced");
        }
        else if(age>46){
            System.out.println(" you are semi experinced ");

        }
        else if(age>30){
            System.out.println("you are semi semi experinced");
        }
        else{
            System.out.println("you are not experinced");
        }
    }
    
}
