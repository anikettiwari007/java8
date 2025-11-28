package enumsUsage;


import enumsUsage.enums.Operation;

/**
 * when to use it:
 *      when you have several algorithms or behaviors that can be interchanged.
 *      when you want to eliminate large switch-case or if-else blocks.
 * */
public class EnumBasedStrategyPattern {
    public static void main(String[] args) {
        int x = 10, y=5;
        Operation operation = fromString("add");
        System.out.println(operation.apply(x, y));
    }

    public static Operation fromString(String operationName) {
        try {
            return Operation.valueOf(operationName.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("unsupported operation: " + operationName);
        }
    }
}
