package main;
import java.util.*;

public class MathUtils {
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }

    public static int product(List<Integer> list) {
        int product = 1;
        for (int i: list) {
            product *= i;
        }
        return product;
    }
}
