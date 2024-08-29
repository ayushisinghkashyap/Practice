import java.util.Scanner;

public class holtri2 {
    public static void HollowTriangle2(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print(" ");
                }
                if(i+j==7 || j==n || i==n){
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
    
        HollowTriangle2(n);

        sc.close();
    }
}
