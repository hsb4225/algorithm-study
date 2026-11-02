import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = 0;
        int min = 1001;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 500 && numbers[i] > max) {
                max = numbers[i];
            } else if(numbers[i] > 500 && numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.printf(max + " " + min);
    }
}