package cir;

public class circleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10);

        System.out.println(circle1.toString());
        System.out.println(circle2);

        System.out.println(circle1.equals(circle2));
    }
}
