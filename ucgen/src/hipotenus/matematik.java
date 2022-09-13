package hipotenus;
import java.util.Scanner;
public class matematik {
    public static void main (String[] args){
        int a, b;

        Scanner kenarlar = new Scanner(System.in);
        System.out.print("İlk Kenarı giriniz: ");
        a = kenarlar.nextInt();

        System.out.print("İkinci Kenarı Giriniz: ");
        b = kenarlar.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs Uzunluğu: " + c);

    }
}
