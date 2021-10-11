import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        // Kullanıcıdan yarıçap bilgisini istiyoruz
        int r;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap bilgisini cm cinsinden giriniz : ");
        r = inp.nextInt();

        // Formüller sabit olsa bile değiştirme ihtimali olabilir diye ayrı değişkenlere atamak istiyorum
        double daireCevre,daireAlan,piSayisi;
        piSayisi = 3.14;
        daireCevre  = 2 * piSayisi * r;
        daireAlan = piSayisi * r *r;

        System.out.println(r + " cm Yarıçaplı dairenin çevresi : " + daireCevre);
        System.out.println(r + " cm Yarıçaplı dairenin alanı : " + daireAlan);

        // Merkez ölçüsü girilen daire dilimini bulmak için merkez ölçüsü istiyorum
        double a,dilimAlani;
        System.out.print("Daire dilim alanı bulmak için merkez ölçüsü giriniz : ");
        a = inp.nextDouble();
        dilimAlani = (piSayisi*(r*r)*a)/360;
        System.out.println("Daire dilim alanı : " + dilimAlani);

    }
}
