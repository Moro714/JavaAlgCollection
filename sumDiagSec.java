package C3;
import java.util.Scanner;
    public class sumDiagSec {
        
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("introdu numarul de linii si de coloane");
            int n = scanner.nextInt();
            int [][] a = new int[n][n];

            System.out.println("Introdu numerele matricei");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = scanner.nextInt();
                }    
            }
            int sum = 0;
            System.out.println("numerele adunate sunt :");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j == n -1 ){
                        sum = sum +a[i][j];
                        System.out.println(a[i][j]);
                    }

                }    
            }
            System.out.println("suma este : " + sum);
            scanner.close();
            
        }
    }
