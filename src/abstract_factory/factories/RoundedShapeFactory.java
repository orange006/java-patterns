package abstract_factory.factories;

import abstract_factory.Shape;
import abstract_factory.classes.RoundedRectangle;
import abstract_factory.classes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
