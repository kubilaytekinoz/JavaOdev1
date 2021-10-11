import java.util.Scanner;
public class KdvTutariHesapla {
    public static void main(String[] args) {
        // Paranın Miktarını Öğrenelim
        Scanner dbl = new Scanner(System.in);
        System.out.print("Lütfen KDV'sini öğrenmek istediğiniz tutarı giriniz :");
        double para = dbl.nextDouble();
        // Girilen Tutarın KDV'si ile işlem yapalım

        String kdvli = (para >= 1000) ? ("KDV'li Toplam Tutar : "+ (para += para * 0.08)) : ("KDV'li Toplam Tutar : " + (para += para * 0.18));
        System.out.println(kdvli);


    }
}
