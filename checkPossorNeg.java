import java.util.Scanner;

public class checkPossorNeg {
    public static String checknum(float n){
        if(n<0){
            return "Negative number";
        }
       return "Possitive";
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println(checknum(n));

        sc.close();
    }

}
