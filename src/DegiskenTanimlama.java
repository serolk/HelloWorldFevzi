public class DegiskenTanimlama {
    /*
        Değişken tanımlama
         */

    int age;
    float boy;
    double kilo;
    String ad, soyad;
    long tckn;

    public DegiskenTanimlama()
    {
        age = 33;
        boy = 1.80f;
        kilo = 89.256;
        ad = "Fevzi";
        soyad = "Dulger";
        tckn = 56875127472L;
    }

    public void degiskenTanimlamaOrnek()
    {
        System.out.println(ad + " " + soyad);
        System.out.println(age + " yaşındayım");
        System.out.println("Boyum " + boy + " ve kilom " + kilo);
        System.out.println("TCKN " + tckn);
    }

    public static void helloGalata()
    {
        System.out.println("Hello Galata");
    }


}
