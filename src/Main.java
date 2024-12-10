import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        MaxNumber maxObj = new MaxNumber();
        int maxi = maxObj.testMax(num1, num2, num3);
        System.out.println("Maximum number is " + maxi);
        sc.close();
    }
}

class MaxNumber {
    public int testMax(int num1, int num2, int num3) {
        Integer maxx = Integer.valueOf(num1);

        if (Integer.valueOf(num2).compareTo(maxx) > 0) {
            maxx = Integer.valueOf(num2);
        }

        if (Integer.valueOf(num3).compareTo(maxx) > 0) {
            maxx = Integer.valueOf(num3);
        }

        return maxx.intValue();
    }
}
