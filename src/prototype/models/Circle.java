package prototype.models;

import prototype.styles.FillStyle;

public class Circle extends Shape {
    protected int radius;
    protected FillStyle fillStyle;

    public Circle() {
        super();
    }

    public Circle(Circle circle) {
        super(circle);
        System.out.println("Deep Copying Circle...");
        this.radius = circle.radius;
        this.fillStyle = new FillStyle(circle.fillStyle);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle (%s, %s).\n", super.toString(), this.toString());
    }

    @Override
    String type() {
        return "Circle";
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public FillStyle getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", " + fillStyle;
    }
}
