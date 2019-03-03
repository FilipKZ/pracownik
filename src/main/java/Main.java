import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pracownik> pracownikList = new ArrayList<Pracownik>();
        List<Produkt> produktList = new ArrayList<Produkt>();
        Magazyn magazyn = new Magazyn(pracownikList, produktList);
        String komenda;
        do {
            komenda = scanner.nextLine();
            if (komenda.equalsIgnoreCase("dodajprodukt")) {
                // tutaj załaduj pozostałe parametry
                magazyn.dodajProdukt();
            } else if (komenda.equalsIgnoreCase("dodajpracownika")) {
                // tutaj załaduj pozostałe parametry
                magazyn.dodajPracownika();
            } else if (komenda.equalsIgnoreCase("usunprodukt")) {

            } else if (komenda.equalsIgnoreCase("usunpracownika")) {
            } //... kolejne
        } while (!komenda.equalsIgnoreCase("quit"));

    }
}
