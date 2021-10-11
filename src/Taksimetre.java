import  java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        // Taksimetre Açılış Tutarını bir yerde saklamak istiyorum

        int taksimetreAcilis = 10;

        // Kullanıcıdan km bilgisini isteyeceğim

        Scanner kmBilgisi = new Scanner(System.in);
        System.out.print("Lütfen gideceğiniz yeri km cinsinden yazınız : ");
        double mesafe = kmBilgisi.nextDouble();

        // 20 TL altında ki ücretlerde yine 20 TL olacağı için ödenen miktarı da ayrı yerde tutmak istiyorum ki karşılaştırabileyim.
        double hesaplananTutar = taksimetreAcilis + (mesafe * 2.20);

        String odencekTutar = (hesaplananTutar >= 20) ? ("Toplam ödencek tutar : " + hesaplananTutar + " TL") : ("Toplam ödencek Tutar : 20 Tl ");
        System.out.println(odencekTutar);


            }
}
