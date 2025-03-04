import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți a , b , c si d");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max = -100;

            if (a > max){
                max = a;
            };
            
            if (b > max){
                max = b;
            };
            
            if (c > max){
                max = c;
            };
            
            if (d > max){
                max = d;
            };

            System.out.println("Cel mai mare numar dintre " + a +" "+ b +" "+  c +" "+  d + " este " + max);
            scanner.close();
        }
}