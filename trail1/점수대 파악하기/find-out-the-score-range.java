import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[11];

        while(true) {
            int score = sc.nextInt();
            if(score == 0) {
                break;
            }

            int n = score / 10;
            if(n >= 1 && n <= 10) {
                scores[n]++;
            }
        }
        for(int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + scores[i]);
        }
    }
}