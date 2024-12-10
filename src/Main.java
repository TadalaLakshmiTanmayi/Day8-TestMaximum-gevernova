import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxValue maxFinder = new MaxValue();

        // Strings
        System.out.print("Enter 3 strings: ");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        System.out.println("Max String: " + maxFinder.findMax(s1, s2, s3));

        // Integers
        System.out.print("Enter 3 integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Max Integer: " + maxFinder.findMax(n1, n2, n3));

        // Floats
        System.out.print("Enter 3 floats: ");
        float f1 = sc.nextFloat(), f2 = sc.nextFloat(), f3 = sc.nextFloat();
        System.out.println("Max Float: " + maxFinder.findMax(f1, f2, f3));

        sc.close();
    }
}
class MaxValue {
    public <T extends Comparable<T>> T findMax(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
}
