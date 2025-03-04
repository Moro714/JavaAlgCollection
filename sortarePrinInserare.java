package C2;
import java.util.Scanner;

public class sortarePrinInserare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();
        System.out.println("introduceti numerele sirului");
        int[] a = new int[n] ;
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            int aux = a[i];
            int j = i - 1;
            
            while (j >= 0 && a[j] > aux) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = aux;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        scanner.close();
    }
}