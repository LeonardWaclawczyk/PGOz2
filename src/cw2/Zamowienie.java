package cw2;
import java.util.Arrays;

public class Zamowienie{
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Klient getKlient() {return klient;}
    public void setKlient(Klient klient) {this.klient = klient;}
    public Produkt[] getProdukty() {return produkty;}
    public void setProdukty(Produkt[] produkty) {this.produkty = produkty;}
    public int[] getIlosci() {return ilosci;}
    public void setIlosci(int[] ilosci) {this.ilosci = ilosci;}
    public String getDataZamowienia() {return dataZamowienia;}
    public void setDataZamowienia(String dataZamowienia) {this.dataZamowienia = dataZamowienia;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public void wyswietlSzczegoly() {
        System.out.println("Id: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("Produkt: " + produkty[i].getNazwa() + ", Kategoria: " + produkty[i].getKategoria() + ", Cena: " + produkty[i].getCena());
        }
        System.out.println("Ilosci: " + Arrays.toString(ilosci));
        System.out.println("Cena: "+ obliczWartoscZamowienia());
        System.out.println("Data Zamowienia: " + dataZamowienia);
        System.out.println("Status: " + status);
    }
    public double obliczWartoscZamowienia(){
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosci[i];
        }
        return suma;
    }
    public void zastosujZnizke() {
        if (klient.isCzyStaly()) {
            double wartosc = obliczWartoscZamowienia();
            wartosc *= 0.9;
            System.out.println("Nowa wartość zamówienia po rabacie: " + wartosc);
        }
        else System.out.println("Klient nie jest staly");
    }

}