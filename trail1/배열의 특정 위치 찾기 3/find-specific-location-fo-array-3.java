import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int idx = 0;
        int sum = 0;
        while(true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }
            numList.add(num);
            idx++;
        }
        for(int i = idx - 3; i < idx; i++) {
            sum += numList.get(i);
        }
        System.out.print(sum);
    }
}