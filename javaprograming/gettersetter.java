class cylinder{
    int radius;
    int height;
    public void setradius(){
       int R= radius;
    }
    public int getradius(){
        return radius;
    }
    public void setheigth(){
        int H=height;
    }
    public int getheight(){
        return height;
    }

}


public class gettersetter {
    public static void main(String[] args) {
        cylinder cylinder= new cylinder();
        cylinder.height=24;
        cylinder.radius=5;
        System.out.println(cylinder.getheight());
        System.out.println(cylinder.getradius());
    }
    
}
