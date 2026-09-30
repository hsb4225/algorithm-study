import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            int ten = n / 10;
            if(ten >= 1 && ten <= 9) {
                arr[ten]++;
            }
        }
        for(int i = 1; i < 10; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }
}