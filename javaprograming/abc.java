  
    public class abc{
        int id ;
        String name;
        public void printDetails(){
            System.out.println("my id is" +id);
            System.out.println(name);
        }
    
   
    public static void main(String[] args) {
        System.out.println("this is customer");
        abc harry= new abc();
        harry.id=12;
        harry.name="code";
        harry.printDetails();
    }
    
}
