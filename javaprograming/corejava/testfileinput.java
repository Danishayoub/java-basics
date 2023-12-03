package corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class testfileinput {
public static void main(String[] args) {
    
    try{
        FileInputStream fin=new FileInputStream("abc.txt");
        int x=0;
        String data="";
        while((x=fin.read())!=-1){
            data=data+(char)x;
        }
        FileOutputStream fout=new FileOutputStream("danish.txt", true);
        byte dan[]=data.getBytes();
        fout.write(dan);
        fout.close();
        System.out.println("kam ho gaya");

    }
    catch(Exception e){
        System.out.println(e);
    }
}
    
}
