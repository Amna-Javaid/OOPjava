package Week02;

public class Rectangle {
    private  double length;
    private double width;
    private int x;
    private int y;

    Rectangle(double length, double width ,int x ,int y) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >0) {
            this.length = length;
        }
        else
            System.out.println("length can't be negative");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0)
            this.width = width;
        else
            System.out.println("width can't be negative");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double area( ){
        return length*width;
    }

    public double circumference( ){
        return 2+(length*width);
    }

    public Rectangle minimumArea( Rectangle a,Rectangle b)
    {
        if (a.area()>b.area()){
            return b;
        }
        else {
            return a;
        }

    }

    public void overlap(Rectangle a, Rectangle b)
    {
        if (a.getX()+a.length > b.getX() && a.getY()+a.width> b.getY()){
            System.out.println("the string does not overlaps");
        }
        else {
            System.out.println("the rectangles  overlaps");
        }



    }



}





