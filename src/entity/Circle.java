package entity;

public class Circle {
    private double radius;
    private String color ;
    //2 .hàm Tạo

    public Circle() {
        this.radius=2;
        this.color="red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color="red";
    }
    //Phương Thức

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}