package C2;
import java.util.Scanner;

public class sortare_prin_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -500;
        int p = 0;
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();
        System.out.println("introduceti numerele sirului");
        int[] a = new int[n] ;
        for(int i=0;i<n-1;i++){
            a[i] = scanner.nextInt();
            if(a[i]>max){
                max = a[i];
                p = i;
            }
        }
        a[p] = a[n-1];
        a[n] = max; 

        boolean verif;
        do {
            verif = true;
            max = -500;
            for (int i = 0; i < n - i; i++) { 
                if (a[n] > a[i] && max < a[i]) {

                    max = a[i];
                    p = i;
                    a[p] = a[n-i];
                    a[n-i] = max;
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