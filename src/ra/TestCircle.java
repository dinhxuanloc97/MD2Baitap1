package ra;

import entity.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1= new Circle();
        System.out.println("bán kính là: "+c1.getRadius());
        System.out.println("Diện tích là: "+c1.getArea());
    }
}