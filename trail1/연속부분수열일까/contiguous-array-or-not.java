import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for(int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        boolean found = false;

        for(int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for(int j = 0; j < n2; j++) {
                if(a1[i + j] != a2[j]) {
                    match = false;
                    break;
                }
            }
            if(match) {
                found = true;
            }
        }
        System.out.print(found ? "Yes" : "No");
    }
}