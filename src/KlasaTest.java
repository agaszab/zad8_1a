import java.util.Scanner;

public class KlasaTest {
    public static void main(String[] args) {

        Klasa[] klasa = new Klasa[3];
        Scanner scan = new Scanner(System.in);

        String nazwa;
        int ilosc;


        for (int i = 0; i < klasa.length; i++) {

            System.out.println("Podaj nazwę klasy: ");
            nazwa = scan.nextLine();
            System.out.println("Podaj ilość uczniów: ");
            ilosc = scan.nextInt();
            scan.nextLine();
            Klasa temp = new Klasa(nazwa, ilosc);
            if (i == 0) {
                klasa[i] = temp;
            } else {
                boolean zawiera = false;

                for (Klasa elem : klasa) {
                    if (temp.equals(elem)) {
                        System.out.println("Taka klasa już istnieje");
                        zawiera = true;
                        i--;
                    }
                }
                if (!zawiera) {
                    klasa[i] = temp;
                }
            }

        }

        for (Klasa elem : klasa)
            System.out.println("Klasa: " + elem.getNazwa() + " Ilość uczniów: " + elem.getIloscUczniow());
    }

}




