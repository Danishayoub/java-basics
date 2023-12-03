package corejava;
import java.io.FileOutputStream;

import java.util.Scanner;

public class testfileoutput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        try{
System.out.println("Enter the msg:");
String data=sc.nextLine();
FileOutputStream fout= new FileOutputStream("abc.txt");
byte msg[]=data.getBytes();
fout.write(msg);
fout.close();
System.out.println("kam ho gaya");

        }   
        catch(Exception e){

        }

    }
    
}
