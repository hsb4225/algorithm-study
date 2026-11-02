import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[2][4];
        int total_sum = 0;
        int total = 0;
        double total_avg = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = sc.nextInt();
                total_sum += numbers[i][j];
                total++;
            }
        }
        total_avg = (double) total_sum / total;

        for(int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for(int j = 0; j < numbers[0].length; j++) {
                sum += numbers[i][j];
            }
            double avg = (double) sum / numbers[0].length;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        for(int i = 0; i < numbers[0].length; i++) {
            int sum = 0;
            for(int j = 0; j < numbers.length; j++) {
                sum += numbers[j][i];
            }
            double avg = (double)sum / numbers.length;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();
        System.out.printf("%.1f", total_avg);
    }
}