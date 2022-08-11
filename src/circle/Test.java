package circle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập bán kính");
        double r1 = sc.nextDouble();
        Circle c1 = new Circle(r1,"red");
        System.out.println("thông tin của hình tròn có bán kính : "+ c1.getRadius()+ " có màu: "+c1.getColor()+ "có diện tích là: "+c1.Area());

        System.out.println("nhập chiều cao: ");
        double h1 = sc.nextDouble();
        Cylinder cy1 = new Cylinder(r1, "yellow",h1);
        System.out.println("thông tin của hình tròn có bán kính : "
                + cy1.getRadius()+ " có màu: "+cy1.getColor()
                + "có diện tích là: "+cy1.Area()
        + "có thể tích là : "+cy1.volume());
    }
}
