import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[] dice = new int[10];
        int[] cnt = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            dice[i] = sc.nextInt();
        }
        for(int c : dice) {
            cnt[c]++;
        }
        for(int i = 1; i < 7; i++) {
            System.out.printf("%d " + "- " + "%d\n", i, cnt[i]);
        }
    }
}