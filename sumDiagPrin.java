package C3;
import java.util.Scanner;

public class sumDiagPrin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduceti numarul de linii si de coloane");
        int n = scanner.nextInt();
        System.out.println("introduceti numarul ");

        int[][] a = new int[n][n] ;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        System.out.println("numerele adunate sunt:");
        for(int i=0;i<n;i++){
            System.out.println(a[i][i]);
            sum = a[i][i]+sum;
        }
        System.out.println("rezultatul este : " + sum);

        scanner.close();
    }
}