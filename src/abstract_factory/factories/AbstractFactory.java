package abstract_factory.factories;

import abstract_factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
