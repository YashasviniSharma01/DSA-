import java.util.Scanner;
public class countNumber {
    //naive approach
    public static int countNum1(int n) {
        if (n==0) return 1;
        if(n<0) n=Math.abs(n);
        int count=0;
        while(n != 0){
            count++;
            n=n/10;
        }
        return count;
    }
    //optimal approach
    public static int countNum2(int n) {
        if (n==0) return 1;
        if(n<0) n=Math.abs(n);
        return (int) (Math.log10(n) + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //    int count = countNum1(n);
        int count = countNum2(n);
        System.out.println(count);
        sc.close();
    }
}
