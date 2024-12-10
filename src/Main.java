import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 strings: ");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        MaxValue<String> stringMax = new MaxValue<>(s1, s2, s3);
        System.out.println("Max String: " + stringMax.testMaximum());

        System.out.print("Enter 3 integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        MaxValue<Integer> intMax = new MaxValue<>(n1, n2, n3);
        System.out.println("Max Integer: " + intMax.testMaximum());

        System.out.print("Enter 3 floats: ");
        float f1 = sc.nextFloat(), f2 = sc.nextFloat(), f3 = sc.nextFloat();
        MaxValue<Float> floatMax = new MaxValue<>(f1, f2, f3);
        System.out.println("Max Float: " + floatMax.testMaximum());

        sc.close();
    }
}

class MaxValue<T extends Comparable<T>> {
    private T a, b, c;

    public MaxValue(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return MaxValue.testMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
}
