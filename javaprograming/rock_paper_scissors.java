import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the choice:\n 0 for rock\n 1 for paper\n 2 for scissor");
        System.out.println(" enter your number");
        int userinput =sc.nextInt();
     
        Random random=new Random();
        int computerinput= random.nextInt(3);

        if(userinput==computerinput){
            System.out.println("draw");
        }
        else if(userinput == 0 && computerinput==2 || userinput ==1 && computerinput==0 || userinput ==2 && computerinput==1){
            System.out.println("you win");
        }else {
            System.out.println("computer win");
        }
        System.out.println("computer choice :"+computerinput);

       

    }
    
}
