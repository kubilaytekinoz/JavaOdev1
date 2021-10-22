import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int km,age,transfer;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1=> Tek yön , 2=> Gidiş Dönüş) :");
        transfer = inp.nextInt();

        switch (transfer) {
            case 1:
                if ( km <= 0 || age <= 0){
                    System.out.println("Hatalı Veri Girdiniz");
                }else if(age<12){
                    System.out.println("Bilet fiyatı " + (km *0.10)*0.5);
                }else if((age >= 12) && (age <= 24)){
                    System.out.println("Bilet fiyatı " + (km *0.10)*0.9);
                }else if (age >= 65){
                    System.out.println("Bilet fiyatı " + (km *0.10)*0.7);
                }else{
                    System.out.println("Bilet Fiyatı " + km*0.10);
                };
                break;
            case 2:
                if ( km <= 0 || age <= 0){
                    System.out.println("Hatalı Veri Girdiniz");
                }else if(age<12){
                    System.out.println("Bilet fiyatı " + (2*((km *0.10)*0.5)*0.8));
                }else if((age >= 12) && (age <= 24)){
                    System.out.println("Bilet fiyatı " + (2*((km *0.10)*0.9)*0.8));
                }else if (age >= 65){
                    System.out.println("Bilet fiyatı " + (2*((km *0.10)*0.7)*0.8));
                }else{
                    System.out.println("Bilet Fiyatı " + 2*(km*0.10));
                };
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz");
                break;
        }

    }
}
