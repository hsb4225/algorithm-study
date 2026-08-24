import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        double avg = 0;
        int cnt = 0;
        for(int i = 1; i < 10; i +=2) {
            sum1 += arr[i];
        }
        for(int i = 2; i < 10; i +=3) {
            cnt++;
            sum2 += arr[i];
        }
        avg = (double) sum2 / cnt;
        System.out.printf("%d" + " " + "%.1f" , sum1, avg);
    }
}