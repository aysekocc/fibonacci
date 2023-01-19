
package fibonaccisayisi;

import java.util.Scanner;

public class Fibonaccisayisi {

    public static void main(String[] args) {
Scanner scan = new Scanner ( System.in );
        System.out.print("Bir Sayı Giriniz: ");
int num = scan.nextInt();
int t1=0,t2=1;
        System.out.print(num + "Sayısının Fibonacci Sayıları: ");
        for(int i =1;i<=num;++i){
            System.out.print(t1+" , ");
            int toplam= t1+t2;
            t1=t2;
            t2=toplam;
         }
    }
}