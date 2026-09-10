import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0, idx = 0;;
        while(cnt < 2) {
            arr[idx] = n * (idx + 1);
            System.out.printf("%d ", arr[idx]);
            if(arr[idx] % 5 == 0) {
                cnt++;
            }
            idx++;
        }

    }
}