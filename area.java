

class Rectangle{
    int length , width ;

Rectangle(int l , int w){
    length = l;
    width = w ;
}

Rectangle(int side){
    length=width = side;
    }
int area(){
    return length*width;
    }
}
public class area{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5);
        Rectangle r2 = new Rectangle(7);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}