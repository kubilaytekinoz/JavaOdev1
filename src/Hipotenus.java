import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        //Kullanıcıdan Dik Kenarların Bilgisi İsteyelim
        Scanner olcu = new Scanner(System.in);
        System.out.print("Uzun dik kenarın ölçüsünü cm cinsinden giriniz : ");
        double  uzunkenar = olcu.nextInt();
        System.out.print("Kısa dik kenarın ölçüsünü cm cinsinden giriniz : ");
        double kısakenar = olcu.nextInt();

        // If ve Else kullanmadığımız için kısa kenar ve uzun kenarları kontrol etmiyoruz iki türlü de hipotenus aynı sonucu verecektir!!

        double hipotenuskare = ((uzunkenar * uzunkenar) + (kısakenar * kısakenar));
        double ucgenCevre,ucgenAlan;
        ucgenCevre =  uzunkenar + kısakenar + Math.sqrt(hipotenuskare);
        ucgenAlan = ((uzunkenar+kısakenar)/2);
        System.out.println("Hipotenüs Ölçüsü : "+ Math.sqrt(hipotenuskare) + " cm");
        System.out.println("Üçgenin Çevresi : " + ucgenCevre + " cm");
        System.out.println("Üçgenin Alanı : " +ucgenAlan  + " cm^2");





    }
}
