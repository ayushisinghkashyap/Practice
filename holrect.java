import java.util.Scanner;

/**
 * holrect
 */
public class holrect {

    public static void HollowRectangle(int row, int col){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==row || i==row || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HollowRectangle(n,m);
    }   
}