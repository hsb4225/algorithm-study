import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.next().charAt(0);
                arr[i][j] = (char) (arr[i][j]- 32);
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}