package enumsUsage.enums;

import enumsUsage.factory.Circle;
import enumsUsage.factory.Shape;
import enumsUsage.factory.Square;

public enum ShapeFactory {
    CIRCLE {
        @Override
        public Shape createShape() {
            return new Circle();
        }
    },
    SQUARE {
        @Override
        public Shape createShape() {
            return new Square();
        }
    };

    public abstract Shape createShape();
}
