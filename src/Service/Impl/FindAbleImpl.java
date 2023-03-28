package Service.Impl;

import Classes.Movie;
import Service.FindAble;
import Exception.FilmException;

import java.util.List;
import java.util.Scanner;

import Classes.Cast;

public class FindAbleImpl implements FindAble {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter movie's name");
            String name = new Scanner(System.in).nextLine();
            for (Movie m : movies) {
                if (m.getName().equalsIgnoreCase(name)) {
                    System.out.println(m);
                } else {
                    isTrue = false;
                }
            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter actor's name");
            String name = new Scanner(System.in).nextLine();
            for (Movie m : movies) {
                for (Cast c : m.getCasts()) {
                    if (c.getActorFullName().equalsIgnoreCase(name)) {
                        System.out.println(m);
                    } else {
                        isTrue = false;
                    }
                }
            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter movie's year");
            int year = new Scanner(System.in).nextInt();
            for (Movie m : movies) {
                if (m.getYear() == year) {
                    System.out.println(m);
                } else {
                    isTrue = false;
                }

            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter movie's Director's last name");
            String name = new Scanner(System.in).nextLine();
            for (Movie m : movies) {
                if (m.getDirector().getLastName().equalsIgnoreCase(name)) {
                    System.out.println(m);
                } else {
                    isTrue = false;
                }

            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter movie's description");
            String description = new Scanner(System.in).nextLine();
            for (Movie m : movies) {
                if (m.getDirector().getLastName().equalsIgnoreCase(description)) {
                    System.out.println(m);
                } else {
                    isTrue = false;
                }

            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        boolean isTrue = true;
        try {
            System.out.println("Enter role's name");
            String role = new Scanner(System.in).nextLine();
            for (Movie m : movies) {
                for (Cast c : m.getCasts()) {
                    if (c.getRole().equalsIgnoreCase(role)) {
                        System.out.println(c);
                    } else {
                        isTrue = false;
                    }
                }
            }
            if (!isTrue) {
                throw new FilmException("Not found!");
            }

        } catch (FilmException f) {
            System.out.println(f.getMessage());
        }
    }
}
