import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name:");
        String first_name=sc.next();
        String last_name=sc.next();
        System.out.println("enter the roll no:");
        int roll_no=sc.nextInt();
        System.out.println("ente the field of interestk");
        String field_of_interest=sc.next();
        System.out.println("name :"+first_name+" "+last_name);
        System.out.println("roll no: "+roll_no);
        System.out.println("field of ineterst: "+field_of_interest);

    }
    
}
