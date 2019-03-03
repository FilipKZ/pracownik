public class Pracownik {
    private String imie;
    private String nazwisko;
    private String pesel;
    private int wiek;
    private double zarobki;

    public Pracownik(String imie, String nazwisko, String pesel, int wiek, double zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }
}
