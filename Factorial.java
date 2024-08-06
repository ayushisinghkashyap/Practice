import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {
public static void main(String[] args) {
    int fact=1;
    int i=1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Factorial of ");
    int n = sc.nextInt();
    while (i<=n){
        fact=fact*i;
        i=i+1;

    }
    System.out.print("is "+fact);
}
    
}