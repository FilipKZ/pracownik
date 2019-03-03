public class Produkt {
    private String nazwa;
    private double cenaNetto;
    private double podatekVat;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public double getPodatekVat() {
        return podatekVat;
    }

    public void setPodatekVat(double podatekVat) {
        this.podatekVat = podatekVat;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", podatekVat=" + podatekVat +
                '}';
    }
}
