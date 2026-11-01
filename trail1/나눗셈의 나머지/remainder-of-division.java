import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] count = new int[10];

        while(a > 1) {
            int mod = a % b;
            count[mod]++;
            a = a / b;
        }
        int result = 0;
        for(int c : count) {
            result += c * c;
        }
        System.out.print(result);
    }
}