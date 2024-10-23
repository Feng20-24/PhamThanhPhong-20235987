import java.util.Scanner;
public class TriangleOfStar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = keyboard.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
