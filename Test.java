import java.util.Scanner;

public class Test {
    static void arraymultiply() {
        System.out.println(" Enter the value of test case between 1 to 100");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int product = 1;
            System.out.println("Enter the Size of array you want to create between 1 to 10");
            int n = scan.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter "+n+" values for array ");
            for (int j = 0; j <= n - 1; j++) {
                arr[j] = scan.nextInt();
                product = product * arr[j];
            }
            System.out.println("Array values after multiplying are");
            System.out.println(product);
        }
    }
    public static void main(String[] args){
            Test.arraymultiply();
    }
}