import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        for(int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
        }
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    
    }
}