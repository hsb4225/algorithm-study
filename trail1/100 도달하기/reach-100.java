import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        arr[0] = 1;
        arr[1] = n;
        int idx = -1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if(arr[i] > 100) {
                idx = i;
                break;
            }
        }
        for(int i = 0; i <= idx; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}