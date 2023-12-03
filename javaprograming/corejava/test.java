package corejava;

public class test {
    public static void main(String[] args) {
        String name=" Welcome to Ainwik Infotech Greater noida branch! ";
        System.out.println(name);
        System.out.println(name.replace("e", "k"));
        System.out.println(name.contains("Ainwik"));
        String value[]=name.split("e");
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]);
        }
        String data[]={"Brazil","Russia","India","China","South Africa"};
        System.out.println(String.join("*|*", data));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
         String value2=name.trim();
        System.out.println(name.length());
        System.out.println(value2.length());
        int x=10,y=20;
        System.out.println(x+y);
        System.out.println(String.valueOf(x)+ String.valueOf(y));
    } 
}
