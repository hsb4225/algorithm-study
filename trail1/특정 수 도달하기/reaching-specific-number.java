import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        double avg = 0;
        int cnt = 0;
        for(int a : arr) {
            if(a < 250) {
                sum += a;
                cnt++;
                continue;
            }
            break;
        }
        avg = (cnt > 0) ? (double) sum / cnt : 0.0;

        System.out.printf("%d" + " " + "%.1f", sum, avg);
    }
}