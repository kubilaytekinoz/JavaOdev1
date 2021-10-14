import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int turkce,matematik,kimya,fizik,muzik;
        double avg;
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan bilgileri alalım
        System.out.println("Sınıf Geçme Durumu İçin Notlarınızı Giriniz");
        System.out.print("Türkçe Notu : ");
        turkce = inp.nextInt();
        System.out.print("Kimya Notu : ");
        kimya = inp.nextInt();
        System.out.print("Fizik Notu : ");
        fizik = inp.nextInt();
        System.out.print("Müzik Notu : ");
        muzik = inp.nextInt();
        System.out.print("Matematik Notu :");
        matematik = inp.nextInt();


        // Kontrol ve notların tutulduğu değişkenleri oluşturuyorum
        int control = 0,not = 0;
        if ((turkce != 0) && (turkce != 100)){
            control++;
            not +=turkce;
            System.out.println(turkce);
        }
        if ((kimya != 0) && (kimya != 100)){
            control++;
            not +=kimya;
        }
        if ((matematik != 0) && (matematik != 100)){
            control++;
            not +=matematik;
        }
        if ((fizik != 0) && (fizik != 100)){
            control++;
            not +=fizik;
        }
        if ((muzik != 0) && (muzik != 100)){
            control++;
            not +=muzik;
        }
        System.out.println("Not ortalamanız : " + (not / control));
    }
}
