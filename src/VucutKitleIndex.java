import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        // Boy ve Kilo bilgilerini istiyorum
        double boy,kilo,indeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        indeks = ((kilo) / (boy * boy)) ;

        System.out.println("Vücut Kitle indexiniz : " + indeks );

    }
}
