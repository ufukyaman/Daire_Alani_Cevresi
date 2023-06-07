import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması ve değer atamalarının yapılması
        int r, a;
        double pi = 3.14;

        //Scanner sınıfı
        Scanner imp = new Scanner(System.in);

        //Kıllanıcıdan veri alınıp ilgili değişkene aktarılması
        System.out.print("Yarıçapı giriniz: ");
        r = imp.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = imp.nextInt();

        //İlgili hesaplamaların yapılıp ekrana basılması
        double cevre = pi * r * r;
        System.out.println("Dairenin çevresi: " + cevre);
        double alan = 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        double dilimAlan = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);

    }
}