package rectangle_test;
class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double paremeter() {
        return 2 * (length + breadth);

    }
   public boolean isSquare(){
    return length == breadth;
    }
  //public boolean isSquare(){
    //if(length == breadth){
       // return true;
    //}
   // else
    //    return false;
//}


}

public class rectangletst_01 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 10;
        System.out.println("the area of the rectangle is :" + r1.area());
        System.out.println("the paremeter of the rectangle is :" + r1.paremeter());
        System.out.println("is it a  square : "+r1.isSquare());
    }
}




