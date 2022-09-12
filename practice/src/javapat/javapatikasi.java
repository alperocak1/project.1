package javapat;
import java.util.Scanner;

public class javapatikasi {
    public static void main (String[] args) {

        double tutar, kdvoran = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz : ");
        tutar = input.nextDouble();

        double kdvtutar = tutar * kdvoran;
        double kdvlitutar = tutar + kdvtutar;

        System.out.println("KDV'li fiyat :" + kdvlitutar );
    }
}
