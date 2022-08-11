package th1;

public class Rectangle extends Shape{
    protected   double width ;
    protected double height =1  ;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getheight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth() + " and height=" + getheight() + ", which is a subclass of " + super.toString();
    }
}
