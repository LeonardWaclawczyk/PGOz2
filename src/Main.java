import java.util.Arrays;

public class Produkt {
    private int id;
    private String Nazwa;
    private String Kategoria;
    private double cena;
    private int iloscWMagazynie;

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public void setKategoria(String kategoria) {
        Kategoria = kategoria;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }
    public void wyswietlInformacje() {
        System.out.println("Id: " + id);
        System.out.println("Nazwa: " + Nazwa);
        System.out.println("Kategoria: " + Kategoria);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc w magazynie: " + iloscWMagazynie);
    }
}
public class Klient{
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }

    public void wyswietlInformacje() {
        System.out.println("Id: " + id);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("CzyStaly: " + czyStaly);
    }
}
public class Zamowienie{
    private int id;
    private Klient klient;
    private Produkt[] produkt;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt[] produkt) {
        this.produkt = produkt;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void wyswietlSczegoly(){
        System.out.println("Id: " + id);
        System.out.println("Klient: " + klient);
        System.out.println("Produkt: " + Arrays.toString(produkt));
        System.out.println("Ilosci: " + Arrays.toString(ilosci));
        System.out.println("DataZamowienia: " + dataZamowienia);
        System.out.println("Status: " + status);
    }
    public void zastosujZnizke()
}
public class SklepKomputerowy{
    private Produkt[] produkt;
    private Klient[] klient;
    private Zamowienie[] zamowienie;
    private int[] liczbaProduktow;
    private int[] liczbaKlientow;
    private int[] liczbaZamowien;
}
