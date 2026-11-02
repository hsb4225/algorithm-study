import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int min = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - min > profit) {
                profit = prices[i] - min;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }

        if(profit <= 0) {
            System.out.print(0);
        } else {
            System.out.print(profit);
        }

    }
}