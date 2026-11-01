import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String[] symtom = new String[3];
        int[] temp = new int[3];
        int[] results = new int[4];
        for(int i = 0; i < 3; i++) {
            symtom[i] = sc.next();
            temp[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++) {
            if(symtom[i].equals("Y") && temp[i] >= 37) {
                results[0]++;
            } else if(symtom[i].equals("N") && temp[i] >= 37) {
                results[1]++;
            } else if(symtom[i].equals("Y") && temp[i] < 37) {
                results[2]++;
            } else {
                results[3]++;
            }
        }
        
        for(int n : results) {
            System.out.printf(n + " ");
        }
        
        if(results[0] >= 2) {
            System.out.print("E");
        }
    }
}