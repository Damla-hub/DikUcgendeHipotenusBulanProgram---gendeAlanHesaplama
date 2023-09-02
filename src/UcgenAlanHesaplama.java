import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,cevre,u,alankaresi,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenar uzunluğunu giriniz: ");
        kenar1=input.nextDouble();
        System.out.print("2. Kenar uzunluğunu giriniz: ");
        kenar2=input.nextDouble();
        System.out.print("3. Kenar uzunluğunu bulunuz: ");
        kenar3=input.nextDouble();
        cevre=kenar3+kenar2+kenar1;
        u=cevre/2;
        alankaresi=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        alan=Math.sqrt(alankaresi);
        System.out.print("üçgenin alanı: "+ alan);

    }

}
