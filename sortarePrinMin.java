package C2;
import java.util.Scanner;

public class sortarePrinMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int p;
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();
        System.out.println("introduceti numerele sirului");
        int[] a = new int[n] ;
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        
        for(int i=0;i<n;i++){
            p=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[p]){
                    p=j;
                }
            }
            int aux = a[i];
            a[i]=a[p];
            a[p]=aux;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        scanner.close();
    }
}