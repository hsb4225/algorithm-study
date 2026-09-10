import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] cnt = new int[10];
        for(int a : arr) {
            for(int j = 1; j < 10; j++) {
                if(a == j) {
                    cnt[j - 1] += 1;
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            System.out.printf("%d\n", cnt[i]);
        }
    }
}