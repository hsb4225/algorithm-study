import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++) {
            int w = sc.nextInt();
            int a = sc.nextInt();
            if(w == 3) {
                int b = sc.nextInt();
                for(int j = a - 1; j < b; j++) {
                    System.out.printf(array[j] + " ");
                }
                System.out.println();
            } else if(w == 1) {
                System.out.println(array[a - 1]);
            } else if(w == 2) {
                int idx = -1;
                for(int j = 0; j < array.length; j++) {
                    if(array[j] == a) {
                        idx = j;
                        break;
                    }
                }
                if(idx != -1) {
                    System.out.println(idx + 1);
                } else {
                    System.out.println(0);
                }
            }
        
        }
    }
}