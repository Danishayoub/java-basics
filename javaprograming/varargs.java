public class varargs {
 static int sum(int...arr){
    int result =0;
    for(int a: arr){
        result +=a;

    }
    return result;

 }
 
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("The sum of 5 and 4 is " + sum(4,5));

        System.out.println("The sum of 5 ,3 and 4 is " + sum(4,5,3));
       System.out.println(sum(2,4,5,6,7,78));
    }

    
}
