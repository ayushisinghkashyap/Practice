import java.util.Scanner;

public class Fevercheck {
    public static void temperature(double t){
        if(t>99){
            System.out.println("You Have Fever!");
        }
        else{
            System.out.println("You are healthy!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your Temperature in Feherenheit : ");
        double temp = sc.nextDouble();

        temperature(temp);

        sc.close();
    }

}
