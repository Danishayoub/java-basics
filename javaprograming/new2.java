public class new2 {
    private int radius;
    private int height;
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        this.height=h;
    }
    public int getradius(){
        return radius;
    }
    public void setradius(int r){
        this.radius=r;
    }
    double surfacearea(){
        return 2*3.14*radius*height + 2*3.14*radius*radius;
    }
    public static void main(String[] args) {
        new2 cl=new new2();
        cl.setheight(4);
        cl.setradius(12);
        System.out.println(cl.getheight());
        System.out.println(cl.getradius());
        System.out.println(cl.surfacearea());
    }
    
}
