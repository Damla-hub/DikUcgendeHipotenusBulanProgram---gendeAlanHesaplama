import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double dikenar1,dikenar2,kare1,kare2,toplam,result;
        System.out.print("1. Dik kenar uzunluğunu giriniz: ");
        Scanner input=new Scanner(System.in);
        dikenar1=input.nextDouble();
        System.out.print("2. Dik kenar uzunluğunu giriniz: ");
        dikenar2=input.nextDouble();
        kare1=dikenar1*dikenar1;
        kare2=dikenar2*dikenar2;
        toplam=kare1+kare2;
        result=Math.sqrt(toplam);
        System.out.print("Üçgenin hipotenüs uzunluğu "+result+"'dir.");

    }
}
