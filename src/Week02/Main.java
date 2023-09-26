package Week02;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1= new Rectangle(12,8 ,4,6);
        Rectangle rect2= new Rectangle(10,4,5,6 );
        Rectangle minRect= rect1.minimumArea(rect1,rect2);

        double area1=rect1.area();
        System.out.println( "area of first rectangle is " + area1);
        System.out.println( "circumference of first rectangle is " +rect1.circumference());


        System.out.println( "circumference of second rectangle is " +rect2.circumference());
        System.out.println( "area of second rectangle is " +rect2.area());


        System.out.println( "minimum rectangle is :" + minRect);
        System.out.println( "The minimum rectangle have area :" +minRect.area());

        rect1.overlap(rect1,rect2);
    }
}