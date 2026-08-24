import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }
        for(int i = numbers.length - 1; i >=0; i--) {
            if(numbers[i] % 2 == 0) {
                System.out.printf("%d ", numbers[i]);
            }
        }
    }
}