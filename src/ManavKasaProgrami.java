import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {

        // kilogram bilgilerini istiyoruz
        int armut,elma,domates,muz,patlican;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo Armut istersiniz : ");
        armut = inp.nextInt();

        System.out.print("Kaç kilo Elma istersiniz : ");
        elma = inp.nextInt();

        System.out.print("Kaç kilo Domates istersiniz : ");
        domates = inp.nextInt();

        System.out.print("Kaç kilo Muz istersiniz : ");
        muz = inp.nextInt();

        System.out.print("Kaç kilo Patlıcan istersiniz : ");
        patlican = inp.nextInt();
        System.out.println("Toplam Fiyat Hesaplanıyor");
        System.out.println("-------------------------");
        // Başka değerde tutmak istemediğim için aynı satırda hesaplatıp yazıyorum
        System.out.println(armut + " Kilo Armut Fiyatı :" + (armut*2.14) );
        System.out.println(elma + " Kilo Elma : " + (elma*3.67));
        System.out.println(domates + " Kilo Domates : " + (domates*1.11));
        System.out.println(muz + " Kilo Muz : " + (muz*0.95));
        System.out.println(patlican + " Kilo Patlican : " + (patlican*5));
        System.out.println("Toplam Tutar : " + ((armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5)) + " TL");




    }
}
