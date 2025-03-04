import java.util.Scanner;
public class min_max_succesiv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti numarul de iteratii");
        int n = scanner.nextInt();

        int max = -500;
        int min =  500;
        int[] a = new int[n] ;

        System.out.println("Introdu " + n + " numere");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();

            if(a[i] > max){
                max = a[i];
            }
            
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Cel mai minc numar introdus este: " + min + " si cel mai mare numar introdus este: " + max);
        scanner.close();
    }
}
