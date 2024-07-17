package cir;

public class Circle {
    public int radius;
    private final double PI = 3.14159265358979323846;

    public Circle(int radius){
     this.radius = radius;

}

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", pi=" +  PI+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && PI == circle.PI;
    }


}
