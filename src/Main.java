import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 strings: ");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        MaxValue<String> stringMax = new MaxValue<>(s1, s2, s3);
        stringMax.testMaximum();

        System.out.print("Enter 3 integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        MaxValue<Integer> intMax = new MaxValue<>(n1, n2, n3);
        intMax.testMaximum();

        System.out.print("Enter 3 floats: ");
        float f1 = sc.nextFloat(), f2 = sc.nextFloat(), f3 = sc.nextFloat();
        MaxValue<Float> floatMax = new MaxValue<>(f1, f2, f3);
        floatMax.testMaximum();

        sc.close();
    }
}

class MaxValue<T extends Comparable<T>> {
    private T[] values;

    @SafeVarargs
    public MaxValue(T... values) {
        this.values = values;
    }

    public void testMaximum() {
        T max = MaxValue.testMaximum(values);
        MaxValue.printMax(max);  // Calling printMax to print the maximum value
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1]; // After sorting, the largest value will be the last element
    }

    public static <T> void printMax(T max) {
        System.out.println("Max Value: " + max);
    }
}
