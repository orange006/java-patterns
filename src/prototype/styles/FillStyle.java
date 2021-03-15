package prototype.styles;

import prototype.enums.Color;
import prototype.enums.FillPattern;

public class FillStyle {
    protected Color fillColor;
    protected FillPattern fillPattern;

    public FillStyle() {
        super();
    }

    public FillStyle(FillStyle fillStyle) {
        super();
        System.out.println("Deep Copying FillStyle...");
        this.fillColor = fillStyle.fillColor;
        this.fillPattern = fillStyle.fillPattern;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setFillPattern(FillPattern fillPattern) {
        this.fillPattern = fillPattern;
    }

    @Override
    public String toString() {
        return "fillColor=" + fillColor + ", fillPattern=" + fillPattern;
    }
}
