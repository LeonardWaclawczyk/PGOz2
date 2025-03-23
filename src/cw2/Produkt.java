package cw2;
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
