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

         if (i==0) {
              klasa[i].add(nazwa,ilosc);
              System.out.print (nazwa+ilosc+"aa");
         } else if (!klasa[i].zawiera(nazwa, ilosc)) {

                klasa[i].add(nazwa,ilosc);
            } else {
                System.out.println("Taka klasa już istnieje ");
            }


        }

        for ( Klasa elem: klasa )
        {
            System.out.print ("Klasa: "+elem.getNazwa()+" Ilość uczniów: "+elem.getIloscUczniow());
        }

    }
}