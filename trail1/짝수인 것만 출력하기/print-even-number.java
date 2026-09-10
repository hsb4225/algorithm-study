import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                cnt++;
            }
        }

        int[] arr_result = new int[cnt];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 ==0) {
                arr_result[idx++] = arr[i];
            }
        }
        for(int i = 0; i < arr_result.length; i++) {
            System.out.printf("%d ", arr_result[i]);
        }
    }
}