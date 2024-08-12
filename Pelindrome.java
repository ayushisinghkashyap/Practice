import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        
        int rev = 0;
        int i=1000;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 4-digit number : ");
        int n =sc.nextInt();

        int orig = n;

        while(n>0){
            int rem = n % 10;
            rev = rev+rem*i;
            n=n / 10;
            i=i/10;
        }
        if(rev == orig){
            System.out.println(orig+" is Pelindrome Number.");
        }
        else{
            System.out.println(orig+" not Pelindrome Number");
        }
        sc.close();
    }
}
