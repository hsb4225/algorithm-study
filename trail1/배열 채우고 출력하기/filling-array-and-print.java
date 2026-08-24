import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        } 
        String result = "";
        for(int i = 9; i >= 0; i--) {
            result += arr[i];
        }
        System.out.print(result);
    }
}