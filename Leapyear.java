import java.util.Scanner;

public class Leapyear {
    public static String checkLeapYear(long y){

        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    return "Leap Year";
                }

                else{
                    return " Not Leap Year";
                }
            }

            else{
                return "Not Leap Year";
            }
        }
        return "Not Leap Year";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        long year = sc.nextLong();

        System.out.println(checkLeapYear(year));

        sc.close();
    }
}
