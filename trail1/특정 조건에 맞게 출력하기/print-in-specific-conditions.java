import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int cnt = 0;
        

        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            arr[cnt] = n;
            cnt++;
        }

        for(int i = 0; i < cnt; i++) {
            if(arr[i] % 2 == 0) {
                System.out.printf("%d ", arr[i] / 2);
            } else {
                System.out.printf("%d ", arr[i] + 3);
            }
        }
    }
}