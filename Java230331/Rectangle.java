package Java230331;

import Java230331.test.Shape;

public class Rectangle extends Shape {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    @Override
    public void draw() {
        System.out.println("Rectangle Draw[" + width + "," + height + "]");
    }

}
