import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                sum += score;
            }
            if(sum >= 240) {
                result[i] = "pass";
                cnt++;
            } else {
                result[i] = "fail";
            }
        }
        for(String s : result) {
            System.out.println(s);
        }
        System.out.print(cnt);
        
    }
}