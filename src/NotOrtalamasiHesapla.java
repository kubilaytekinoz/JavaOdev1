import java.util.Scanner;
public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        // Değişkenleri oluştur

        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfı tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan notları iste
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + sonuc);

        // Geçip Kaldığını sorguluyoruz
        double gecmeNotu;
        gecmeNotu = 60;
        boolean gecmeDurumu = (sonuc >= gecmeNotu);

        String str = (gecmeDurumu) ? ("Tebrikler!Not Ortalamanız "+ sonuc + " Sınıfı Geçtiniz") : ("Malasef :( Not Ortalamanız :" + sonuc + " Sınıfta Kaldınız");
        System.out.println(str);
    }
}
