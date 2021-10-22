import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int hava;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz : ");
        hava = inp.nextInt();

        if (hava < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if ( hava >= 5 && hava <= 15 ){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else if ( hava >= 15 && hava <= 25 ){
            System.out.println("Piknik Yapabilirsiniz");
        }
        else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
}
