import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan giriş bilgilerini istiyelim
        System.out.print("Kullanıcı adını giriniz : ");
        username=inp.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password=inp.nextLine();
        // Kullanıcıdan gelen bilgileri kontrol edelim
        // username = patika password = java101 gibi düşünelim

        if (username.equals("patika") && password.equals("java101")){
            System.out.println("Hoşgeldin patika. Başarıyla giriş yaptın!");
        }
        // Şifrenin yanlış olma durumunu inceleyip yeni şifre ister mi diye soralım
        else if ((username.equals("patika"))){
            System.out.println("-- Şifreniz yanlış! --\nŞifrenizi Sıfırlamak için : 1\nÇıkış yapmak için 2 :");
            System.out.print("--Seçiminiz : ");
            int passwordChange = inp.nextInt();
            switch (passwordChange){
                case 1:
                    System.out.print("Lütfen Yeni Şifrenizi Giriniz :");
                    String newPassword = inp.next();
                    // şifre bi yerde tutulmadığı için ikinci eşitliği de denkleme soktum
                        if (newPassword.equals(password) || newPassword.equals("java101")){
                        System.out.println("Yeni Şifreniz eski şifrenizle aynı olamaz.");
                        }else {
                        System.out.println("Tebrikler. Yeni şifreniz başarıyla oluşturuldu");
                        }
                    break;
                case 2:
                    System.out.println("-- Çıkış Yapılıyor --");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız. Lütfen daha sonra tekrar deneyin");
                    break;
            }

        }
        else {
            System.out.println("Bilgileriniz Yanlış.");
        }

        }

    }

