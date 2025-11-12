import java.util.*;

class NumericSum {
    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(Arrays.asList(1, 2, 3, 4)));
        System.out.println(sumNumbers(Arrays.asList(1.2, 3.4, 5.6)));
    }
}

