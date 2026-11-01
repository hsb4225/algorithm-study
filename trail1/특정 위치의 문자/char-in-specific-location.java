import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;
        char find = sc.next().charAt(0);

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == find) {
                idx = i;
            }
        }
        if(idx != -1) {
            System.out.print(idx);
        } else {
            System.out.print("None");
        }
        
    }
}