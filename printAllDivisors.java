package DSA;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class printAllDivisors {
    public static void pad(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int sq = (int) Math.sqrt(n);
        for (int i = 1; i <= sq ; i++) {
            if(n%i==0) {
                list.add(i);
                if(i != n/i) list.add(n/i);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pad(n);
    }
}
