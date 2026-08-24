import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[8];
        for(int i = 0; i < 8; i++) {
            grades[i] = sc.nextDouble();
        }
        double sum = 0;
        double avg = 0;
        for(double grade : grades) {
            sum += grade;
        }
        avg = sum / 8;
        System.out.printf("%.1f", avg);
    }
}