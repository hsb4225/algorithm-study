import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
                System.out.printf("%d ", result[i][j]);
            }
            System.out.println();
        }
    
    }
}