import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[100];
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            counts[number]++;
        }
        System.out.print(counts[m]);
    }
}