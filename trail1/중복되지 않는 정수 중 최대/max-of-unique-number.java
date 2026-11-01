import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[1001];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        int max = -1;
        for(int i = 0; i < n; i++) {
            if(max < arr[i] && count[arr[i]] == 1) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}