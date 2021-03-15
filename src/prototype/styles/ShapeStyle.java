package prototype.styles;

import prototype.enums.Color;
import prototype.enums.LinePattern;

public class ShapeStyle {
    protected Color lineColor;
    protected LinePattern linePattern;
    protected double lineThickness;

    public ShapeStyle() {
        super();
    }

    public ShapeStyle(ShapeStyle shapeStyle) {
        this();
        System.out.println("Deep Copying ShapeStyle...");
        this.lineColor = shapeStyle.lineColor;
        this.linePattern = shapeStyle.linePattern;
        this.lineThickness = shapeStyle.lineThickness;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public void setLinePattern(LinePattern linePattern) {
        this.linePattern = linePattern;
    }

    public void setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
    }

    @Override
    public String toString() {

        return "lineColor=" + lineColor +
                ", linePattern=" + linePattern +
                ", lineThickness=" + lineThickness;
    }
}
