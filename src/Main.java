import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = sc.nextFloat();

        MaxNumber maxObj = new MaxNumber();
        float maxi = maxObj.testMax(num1, num2, num3);
        System.out.println("Maximum number is " + maxi);
        sc.close();
    }
}

class MaxNumber {
    public float testMax(float num1, float num2, float num3) {
        Float maxx = Float.valueOf(num1);

        if (Float.valueOf(num2).compareTo(maxx) > 0) {
            maxx = Float.valueOf(num2);
        }

        if (Float.valueOf(num3).compareTo(maxx) > 0) {
            maxx = Float.valueOf(num3);
        }

        return maxx.floatValue();
    }
}
