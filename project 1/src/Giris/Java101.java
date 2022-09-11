package Giris;

import java.util.Scanner;

public class Java101 {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + tarih + turkce + muzik);
        double sonuc = (toplam/6);

        System.out.println("Ortalamanız: " + sonuc);


        boolean basarili = sonuc >= 60.0;
        boolean basarisiz = sonuc < 60.0;
        boolean karne = basarili || basarisiz;

        String srt =  karne ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(srt);



}}
