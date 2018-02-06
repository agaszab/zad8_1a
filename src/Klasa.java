public class Klasa {

    private String nazwa;
    private int iloscUczniow;
    private int index=0;


    public Klasa(String nazwa, int iloscUczniow) {
        this.nazwa = nazwa;
        this.iloscUczniow = iloscUczniow;
    }

    public Klasa() {

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIloscUczniow() {
        return iloscUczniow;
    }

    public void setIloscUczniow(int iloscUczniow) {
        this.iloscUczniow = iloscUczniow;
    }

    void add (String nazwa, int ilosc){





        this.setNazwa(nazwa);
            this.setIloscUczniow(ilosc);
            index ++;

    }


    public boolean zawiera(String nazwa, int ile) {

    boolean zawiera=false;

        if (nazwa != null) {
            for (int i = 0; i < index; i++) {
                if (nazwa.equals(getNazwa()) && (ile == getIloscUczniow()))
                    return true;
            }
            zawiera=false;
        }
        return zawiera;
    }
}