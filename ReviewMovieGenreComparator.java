import java.util.Comparator;

public class ReviewMovieGenreComparator implements Comparator<Movie> {
    public int compare(Movie first, Movie second) {

        // 1) compare movie genre
        int compareValue = first.movieGenre.getGenre().compareTo(second.movieGenre.getGenre());

        // if the movie genre aren't equal
        if (compareValue != 0) {
            return compareValue;
        }
        // 2) compare the total collection value
        compareValue = first.totalCollection - second.totalCollection;

        // if the total collection aren't equal
        if (compareValue != 0) {
            return compareValue;
        }
        // 3) compare the movie names
        compareValue = second.movieName.compareTo(first.movieName);

        // if the movie names aren't equal
        if (compareValue != 0) {
            return compareValue;
        }

        // 3) compare the movie names
        compareValue = second.director.compareTo(first.director);

        // if the director names aren't equal
        if (compareValue != 0) {
            return compareValue;
        }

        // 3) compare the reviews
        return second.review.compareTo(first.review);
    }
}
