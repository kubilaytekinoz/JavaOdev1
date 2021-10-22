import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month,day;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = inp.nextInt();
        System.out.print("Doğum gününüz : ");
        day = inp.nextInt();

        if (((month == 3) && (day >= 21)) || ((month == 4) && ( day <= 20))){
            System.out.println("Koç Burcu");
        }
        if (((month == 4) && (day >= 21)) || ((month == 5) && ( day <= 21))){
            System.out.println("Boğa Burcu");
        }
        if (((month == 5) && (day >= 22)) || ((month == 6) && ( day <= 22))){
            System.out.println("İkizler Burcu");
        }
        // Bu algoritmadan devam edilebilir mantığı çözdükten sonra devam etmek istemedim.
    }
}
