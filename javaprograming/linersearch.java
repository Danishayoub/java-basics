public class linersearch {
    public static int getlargest(int number[]){
        int largest= number[0];
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5,10,209,309};
        System.out.println("largest number is:"+getlargest(number));
    }
    
}
