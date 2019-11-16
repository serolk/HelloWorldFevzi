import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value;
        String girilenDeger;
        boolean kamilDogruGirmedi = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");

        //////////////////////////////////
        while(kamilDogruGirmedi) {
            System.out.print("Lütfen hesaplanacak sayi degerini giriniz: ");
            girilenDeger = input.nextLine();

            try {
                value = Integer.parseInt(girilenDeger);
                Matematik mat = new Matematik();
                System.out.println("Sonuc : " + mat.F(value));
                kamilDogruGirmedi = false;
            } catch (Exception ex) {
                System.out.println("Kamil işte");
            }
        }
        ////////////////////////////////////////

    }
}
