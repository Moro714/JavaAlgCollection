import java.util.Scanner;

public class cifmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti numarul (nu are voie sa fie mai mare de 10 caractere)");
        int n = scanner.nextInt();
        int m = n;
        int max = 0;
        int p = 0;
        if(n != 0){

            while(n != 0){
                if(n % 10 > max){
                    max = n % 10;
                }
                n = n / 10;
            }

            while(m != 0){
                if(m % 10 == max){
                    p++;
                }
                m = m / 10;
            }
            System.out.println("cea mai mare cifra este " + max + " si are " + p +" aparitie");
        }else{
            System.out.println("cea mai mare cifra este 0 si are 1 aparitie");
        }
        
        scanner.close();
    }
}