package th1;

public class TestRectanger {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", false, 2.5, 3.8);
        System.out.println(rectangle);
    }
}
