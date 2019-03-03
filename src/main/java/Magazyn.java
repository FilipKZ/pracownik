import java.util.List;

public class Magazyn {
    private List<Pracownik> pracownicy;
    private List<Produkt> produkty;


    void dodajPracownika (Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    void usunPracownika (String pesel) {
        for (Pracownik p: pracownicy) {
            if (p.getPesel().equals(pesel)) {
                pracownicy.remove(p);
            }
        }
    }

    Pracownik wypiszPracownika (String pesel) {
        Pracownik zwracany = null;
        for (Pracownik p: pracownicy) {
            if (p.getPesel().equals(pesel)) {
                zwracany = p;
            }
        } return zwracany;
    }

    List<Pracownik> wypiszWszystkich(){
        return pracownicy;
    }

    public Magazyn(List<Pracownik> pracownicy, List<Produkt> produkty) {
        this.pracownicy = pracownicy;
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "pracownicy=" + pracownicy +
                ", produkty=" + produkty +
                '}';
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }
}
