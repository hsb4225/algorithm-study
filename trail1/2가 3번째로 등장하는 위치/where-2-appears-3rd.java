import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        int idx = -1;
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(array[i] == 2) {
                count++;
                if(count == 3) {
                    idx = i;
                }
            }
        }
        System.out.print(idx + 1);
    }
}