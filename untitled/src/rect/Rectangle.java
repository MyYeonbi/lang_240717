package rect;

import lang.User;

import java.util.Objects;

public class Rectangle {
public int width;
public int height;

public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
}

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }


}

