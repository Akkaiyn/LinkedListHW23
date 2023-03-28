package Service;

import Classes.Movie;
import java.util.List;
public interface SortAble {
    void sortByMovieName(List<Movie>movies);
//-from A to Z
//-from Z to A

    void sortByYear(List<Movie>movies);
//-Ascending
//-Descending

    void sortByDirector(List<Movie>movies);
}
