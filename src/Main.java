import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = sc.nextLine();

        MaxString maxObj = new MaxString();
        String maxi = maxObj.testMax(str1, str2, str3);
        System.out.println("Maximum string is " + maxi);
        sc.close();
    }
}

class MaxString {
    public String testMax(String str1, String str2, String str3) {
        String maxStr = str1;

        if (str2.compareTo(maxStr) > 0) {
            maxStr = str2;
        }

        if (str3.compareTo(maxStr) > 0) {
            maxStr = str3;
        }

        return maxStr;
    }
}