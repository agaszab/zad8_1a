public class Klasa {

    private String nazwa;
    private int iloscUczniow;
    private int index = 0;


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


    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null) return false;

        if (!(obj instanceof Klasa)) return false;

        Klasa other = (Klasa) obj;

        if (nazwa == null) {
            if (other.nazwa != null) return false;
        } else if (!nazwa.equals(other.nazwa)) return false;


        if (iloscUczniow != other.iloscUczniow) return false;

        return true;


    }
}