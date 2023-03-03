import java.util.Comparator;

public class ReviewRatingComparator implements Comparator<Movie> {
	public int compare(Movie first, Movie second) {

		// 1) compare star rating values
		int compareValue = first.stars - second.stars;

		// if the star values aren't equal
		if (compareValue != 0) {
			return compareValue;
		}
		// 2) compare the movie names
		compareValue = first.movieName.compareTo(second.movieName);

		// if the movie names aren't equal
		if (compareValue != 0) {
			return compareValue;
		}

		// 3) compare the director names
		compareValue = second.director.compareTo(first.director);

		// if the movie director names aren't equal
		if (compareValue != 0) {
			return compareValue;
		}
		// 3) compare the reviews
		return second.review.compareTo(first.review);
	}
}
