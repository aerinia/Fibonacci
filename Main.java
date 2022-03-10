import java.util.Scanner;
public class Main {
    static int Fibo (int x) {
if (x==1 || x==2){
    return 1;
}
else
    return Fibo(x-1)+ Fibo(x-2);
    }
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.print("Adım sayınızı seçiniz:");
           int x=scan.nextInt();
           System.out.print("Sayı "+Fibo(x));
    }
}
