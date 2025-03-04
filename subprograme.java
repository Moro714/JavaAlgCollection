package C4;
import java.util.Scanner;
public class subprograme{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul n");
        int n = scanner.nextInt();  
        int suma =0;
        int[]a = new int [n];
        System.out.println("intrtodu termenii");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            // if(verifpar(a[i])){
            //     suma = sum(a[i],suma);
            // }
        }

        // System.out.println(suma);

        
        System.out.println("Intro numarul cautat");
        int h = scanner.nextInt();
        if(cautareb(h,n,a) == -1){
            System.out.println("Nu exista numarul");
        }else{
            System.out.println("numarul este " + cautareb(h,n,a) );
        }
       
        scanner.close();

    }
    // public static int sum(int a , int b){
    //     return a+b;
    // }    
    // public static boolean verifpar(int a){
    //     if(a%2==0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    // public static int imp(int a){
    //     return a/2+1;
    // }
    public static int cautareb (int h,int n, int[]a){
        boolean verif = false;
        int left=0,right=n-1,middle;
        int rez;
        while(verif == false){
            middle = (left+right)/2;
            System.out.println("stanga " + left + " mijloc " + middle + " dreapta " + right);
            if(a[middle] == h){
                System.out.println(" pozitia nr este " + middle);
                verif = true;
            }
            if(h>a[middle+1]){
                left = middle;

            }
            if(h==a[middle+1]){
                verif = true;
                rez = middle+1;
            }
            if(h<a[middle-1]){
                right = middle;
            }

            if(h==a[middle-1]){
                verif = true;
                rez = middle-1;
            }
            if(left==right+1){
                verif = true;
                rez = -1;
            }
        }
        return rez;
        
    }
   
}
