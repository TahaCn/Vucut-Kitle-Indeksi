import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m, kg;
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        m = input.nextDouble();
        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kg = input.nextDouble();

        double vücut_kitle_indeksi;
        vücut_kitle_indeksi = kg/(m*m);
        System.out.println("Vücut kitle indeksiniz : " + vücut_kitle_indeksi);

    }
}
