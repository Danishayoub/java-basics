public class overloading {
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning"+ a +"bro");
    }
    static void change(int a){
        a=89;
    }
    static void change2(int [] arr){
        arr[0]= 98;
    }
    static void telljocks(){
        System.out.println("I invented a new word!\n"+"plagriarism");
    }
    public static void main(String[] args){
        //telljocks();
        int [] marks ={23,45,36,58,93,45};
       change2(marks);
     System.out.println("the value of x after running change is:" +marks[0]);
foo();
foo(50);
foo(40);
foo();
foo(60);

    }
    
}
