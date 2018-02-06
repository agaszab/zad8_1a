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

            setNazwa(nazwa);
            setIloscUczniow(ilosc);
            index += index;

    }


    public boolean zawiera(String nazwa, int ile) {

    boolean zawiera=false;

        if ((nazwa != null) && (ile != 0)) {
            for (int i = 0; i < index; i++) {
                if (nazwa.equals(getNazwa()) && (ile == getIloscUczniow()))
                    zawiera=true;
            }
            zawiera=false;
        }
        return zawiera;
    }
}