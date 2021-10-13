import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        // Değişkenlerimi oluşturuyorum
        double num1, num2;
        int select;
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan işlem yapmasını istediğim sayıları isteyip işlemleri gösteriyorum

        System.out.print("Lütfen İlk Sayıyı Giriniz : ");
        num1 = inp.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        num2 = inp.nextDouble();

        // Menüyü Hazırlayalım
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nLütfen Seçiminizi Giriniz : ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : " + (num1+num2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (num1-num2));
                break;
            case 3:
                System.out.println("Çarpım : " + (num1*num2));
                break;
            case 4:
                if (num2 != 0){
                System.out.println("Bölme : " + (num1/num2));
                    }
                    else if (num2 == 0){
                    System.out.println("Bir Sayı sıfıra bölünemez");
                    }
                    break;
            default:
                System.out.println("Yanlış seçim yaptınız! Lütfen Tekrar Deneyiniz");
        }

    }

    }

