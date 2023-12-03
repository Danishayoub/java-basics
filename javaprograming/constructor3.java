class cylinder2{
    private int radius;
    private int height;
    private int volumn;
  
    public cylinder2(int r,int h,int v){
        radius= r;
        height=h;
        volumn=v;
    }
        public int getradius(){
            return radius;
        }
        public void setradius(int n){
            radius=n;
        }
        public void setheight(int i){
            height= i;
         }
        public int getheight(){
        return height;
        }
        public int getvolunm(){
            return volumn;
        }
    
    
    

    }
 




public class constructor3 {
    public static void main(String[] args) {
        cylinder2 cylinder= new cylinder2(5,24 , 40);
        System.out.println(cylinder.getheight());
        System.out.println(cylinder.getradius());
        System.out.println(cylinder.getvolunm());
        
    }
    
}
