package Service.Impl;

import Classes.Movie;
import Service.SortAble;

import java.util.List;

public class SortAbleImpl implements SortAble {


    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.stream()
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .toList().forEach(System.out::println);
        movies.stream()
                .sorted((a,b) -> b.getName().compareTo(a.getName()))
                .toList().forEach(System.out::println);
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.stream()
                .sorted((a,b) -> a.getYear()-b.getYear())
                .toList().forEach(System.out::println);
        movies.stream()
                .sorted((a,b) -> b.getYear()-a.getYear())
                .toList().forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.stream()
                .sorted((a,b) -> a.getDirector().getName().compareTo(b.getDirector().getName()))
                .toList().forEach(System.out::println);
        movies.stream()
                .sorted((a,b) -> b.getDirector().getName().compareTo(a.getDirector().getName()))
                .toList().forEach(System.out::println);
    }
}
