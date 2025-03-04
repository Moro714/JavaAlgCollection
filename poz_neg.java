import java.util.Scanner;

public class poz_neg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();

        int neg = 0;
        int poz = 0;
        int[] a = new int[n] ;

        System.out.println("Introdu " + n + " numere");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();

            if(a[i] > 0){

                poz++;

            }else{

                if(a[i] < 0){

                    neg++;
                }
            }
        }
        System.out.println("nr poz: " + poz );
        System.out.println("nr neg: " + neg );
        System.out.println("nr zero: " + (n-poz-neg));
        scanner.close();
    
    } 
}
