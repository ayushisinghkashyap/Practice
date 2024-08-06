import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int f1=0;
        int f2=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of Fibonacci Series : ");
        int n = sc.nextInt();
        System.out.println(f1);
        System.out.println(f2);
        for(int i=0;i<n;i++){
            int f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;

        }

    }
}
