import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompetitionResults {
    static Scanner sc = new Scanner(System.in);
    private static int stop;

    public static void main(String[] args) {
        final String outFileName = "stats_out.csv";// nie wiem jak ma zapisywać wyniki od użytkownika w tym pliku

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Maria", "Zawadzka"));
        persons.add(new Person("Piotr", "Zabłocki"));

        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Podaj wynik kolejnego gracza (lub 0 - stop):");
           int stop = 0;
            int result = sc.nextInt();
            if (result > 0) {
                System.out.println( "?" + result); // nie wiem co wpisać przed "+" aby wyświetlał kolejne osoby
            } else {
                if ( result == 0) {
                    System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
                    break;
                }
            }

        }
    }
}



