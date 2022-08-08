import java.util.Scanner;
public class M_Vucut_Kitle_Indeksi_Hesaplayan_Program {
    public static void main(String[] args) {
        double m;
        int kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz :");
        m = inp.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz :");
        kg = inp.nextInt();

        double indeks = kg / (m * m);
        System.out.print("Vucut Kitle Indeksiniz :" + indeks);


    }
}
