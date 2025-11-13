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
        for (Operation operation : Operation.values()){
            System.out.printf("%d %s %d = %d%n", x, operation.name(), y, operation.apply(x, y));
        }
    }
}
