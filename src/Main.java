import Classes.Cast;
import Classes.Director;
import Classes.Movie;
import Service.Impl.FindAbleImpl;
import Service.Impl.SortAbleImpl;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cast dicaprio = new Cast("Leonarda Dicaprio","Thief");
        Cast hardy = new Cast("Tom Hardy", "Helper thief");

        Movie inception = new Movie("Inception", 2010, "One of the most " +
                "papular Muvie of all time(my thought)", new Director("Christopher", "Nolan"),
                new LinkedList<>(List.of(hardy,dicaprio)));
        Movie shawshank = new Movie("Shawshank redemption", 1994,
                "Amazing film about escaping from prison", new Director("Frank", "Darabont"),
                new LinkedList<>(List.of(new Cast("Tim Robbins","Andy Dufrense"),
                        new Cast("Morgan Freeman", "Red"))));
        List<Movie> movies = new LinkedList<>(List.of(inception,shawshank));
        FindAbleImpl findAble = new FindAbleImpl();
        SortAbleImpl sortAble = new SortAbleImpl();
        while (true){
            try {
                System.out.println("Choose one command" +
                        "\n1  get all group" +
                        "\n" +
                        "3 find movie by name" +
                        "\n4 find movie by year" +
                        "\n5 find movie by description" +
                        "\n6 find movie by director last name" +
                        "\n7 find movie by actor name"+
                        "\n8 find movie by role" +
                        "\n9 sort by Movie name" +
                        "\n10 sort by Movie year" +
                        "\n11 sort by Movie director");
                int number = new Scanner(System.in).nextInt();
                switch (number){
                    case 1 -> System.out.println(findAble.getAllMovies(movies));
                    case 3 -> findAble.findMovieByName(movies);
                    case 4 -> findAble.findMovieByYear(movies);
                    case 5 -> findAble.findMovieByDescription(movies);
                    case 6 -> findAble.findMovieByDirector(movies);
                    case 7 -> findAble.findMovieByActorName(movies);
                    case 8 -> findAble.findMovieByRole(movies);
                    case 9 -> sortAble.sortByMovieName(movies);
                    case 10 -> sortAble.sortByYear(movies);
                    case 11 -> sortAble.sortByDirector(movies);
                }
            }catch (InputMismatchException inputMismatchException){
                System.out.println("only number");
            }
        }
    }
}