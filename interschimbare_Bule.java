package C2;
import java.util.Scanner;

public class interschimbare_Bule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();
        System.out.println("introduceti numerele sirului");
        int[] a = new int[n] ;
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
       
        boolean verif;
        do {
            verif = true;
            for (int i = 0; i < n - 1; i++) { 
                if (a[i] > a[i + 1]) {                    
                    int schimb = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = schimb;
                    verif = false;  
                }
            }
        } while (!verif);  


        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        scanner.close();
    }
}