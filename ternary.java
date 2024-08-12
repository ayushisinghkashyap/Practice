import java.util.Scanner;

public class ternary {
    public static void checkEvenOdd(int n){
        String num = (n%2==0?"Even": "Odd");
        System.out.println(num);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n =sc.nextInt();

        checkEvenOdd(n);

        sc.close();
    }
}
