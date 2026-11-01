import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(min > arr[i]) {
                min = arr[i];
            } 
        }
        for(int a : arr) {
            if(a == min) {
                count++;
            }
        }
        System.out.printf(min + " " + count);
    }
}