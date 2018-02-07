import java.util.Scanner;


public class Program {

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

            klasa[i] = new Klasa();

            if (i == 0) {
              klasa[i].add(nazwa, ilosc);

            } else if (klasa[i].zawiera(klasa)) {
                System.out.println("Taka klasa już istnieje ");
                i--;

            } else {

                klasa[i].add(nazwa, ilosc);
            }


        }

        for (Klasa elem : klasa) {
            System.out.println("Klasa: " + elem.getNazwa() + " Ilość uczniów: " + elem.getIloscUczniow());
        }

    }
}