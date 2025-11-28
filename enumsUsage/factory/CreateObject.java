package enumsUsage.factory;

import enumsUsage.enums.ShapeFactory;

public class CreateObject {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.CIRCLE.createShape();
        shape.draw();
        shape = ShapeFactory.SQUARE.createShape();
        shape.draw();
    }
}
