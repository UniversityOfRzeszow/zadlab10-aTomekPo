package pl.edu.ur.oopl10;

/**
 *
 * @author aTomekPo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tab[] = {1, 2, 3, 4, 5};
        Scanner odczyt = new Scanner(System.in);

        int index = 1;
        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
        index = odczyt.nextInt();

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: " + tab.length);
        }

        System.out.println("Zadanie 3");

        int dzielna, dzielnik, wynik;
        System.out.println("Wprowadz dzielna");
        dzielna = odczyt.nextInt();
        System.out.println("Wprowadz dzielnik");
        dzielnik = odczyt.nextInt();
        try {

            wynik = dzielna / dzielnik;
            System.out.println("wynik to" + wynik);
        } catch (ArithmeticException e) // Okreslamy wyjatki, ktore chcemy wylapac
        {
            System.out.println("Nie dzielimy przez zero!!");

        }

    }

}
