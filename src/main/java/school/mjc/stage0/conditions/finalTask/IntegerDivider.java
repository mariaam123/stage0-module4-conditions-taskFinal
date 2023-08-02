package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
        }
        else {
            int value = dividend / divider;
            if(value * divider != dividend)
                System.out.println("cannot be divided completely");
            else System.out.println("can be divided completely");
            }
    }
}