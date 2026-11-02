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
        int next_idx = n;

        while(next_idx > 0) {
            int max = 0;
            int max_idx = -1;

            for(int i = 0; i < next_idx; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    max_idx = i;
                }
            }
            System.out.printf(max_idx + 1 + " ");
            next_idx = max_idx;
        }
    }
}