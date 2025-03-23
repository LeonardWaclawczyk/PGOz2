package cw2;
public class SklepKomputerowy {
    private Produkt[] produkty;
    private Klient[] klienci;
    private Zamowienie[] zamowienia;
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;
    public SklepKomputerowy() {
        this(100,100,100);

    }

    public SklepKomputerowy(int maxProduktow, int maxKlientow, int maxZamowien) {
        this.produkty = new Produkt[maxProduktow];
        this.klienci = new Klient[maxKlientow];
        this.zamowienia = new Zamowienie[maxZamowien];
        this.liczbaProduktow = 0;
        this.liczbaKlientow = 0;
        this.liczbaZamowien = 0;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty[liczbaProduktow] = produkt;
        liczbaProduktow++;
    }

    public void dodajKlienta(Klient klient) {
        klienci[liczbaKlientow] = klient;
        liczbaKlientow++;
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(liczbaZamowien + 1);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produkty);
        zamowienie.setIlosci(ilosci);
        zamowienie.setDataZamowienia("2025-03-23");
        zamowienie.setStatus("Nowe");
        zamowienia[liczbaZamowien++] = zamowienie;
        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++) {
            zamowienie.getProdukty()[i].setIloscWMagazynie(
                    zamowienie.getProdukty()[i].getIloscWMagazynie() - zamowienie.getIlosci()[i]
            );
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                break;
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria)) {
                produkty[i].wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }
}