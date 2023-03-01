// Assignment: 
// Name: 
// StudentID: 
// Lecture: 
// Description: 

import java.io.Serializable;
import java.util.ArrayList;

public class ReviewManager implements Serializable {
    // The serialVersionUID is used to verify compatibility of senders and
    // receivers. See the document for more details:
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html
    private static final long serialVersionUID = 205L;

    ArrayList<Movie> reviewList;

    public ReviewManager() {
        reviewList = new ArrayList<Movie>();
    }

    /**
     * Add a Movie object to the reviewList and return true if such an object
     * is added successfully. Otherwise, return false. Two Movies are
     * considered duplicated if they have exactly the same movie name and genre.
     * 
     * @param movieName         the name of the movie
     * @param stars             the number of stars the movie recieved
     * @param review            the movie review
     * @param totalCollection   the integer total collection earned by the movie
     * @param genre             the movie's genre
     * @param director          the movie's director
     * @param prodictionCompany production comapny of the movie
     * @return true if the operation is successful; false otherwise
     */

    // Adds a movie review to the reviewList
    public boolean addReview(String movieName, int stars, String review, String totalCollection, String genre,
            String director, String productionCompany) {
        if (movieExists(movieName, director) == -1) {
            int collection = totalCollection.length();
            MovieGenre newGenre = new MovieGenre(genre, productionCompany);
            Movie newMovie = new Movie(movieName, stars, review, collection, director, newGenre);
            reviewList.add(newMovie);
            return true;
        }
        return false;
    }

    // returns the movie index within reviewList if a movie exists, and -1 if not.
    public int movieExists(String movieName, String director) {
        int index = -1;
        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).movieName.equals(movieName) && reviewList.get(i).director.equals(director)) {
                index = i;
            }
        }
        return index;
    }

    public ArrayList<Integer> movieGenreExists(String genre) {
        ArrayList<Integer> indicies = new ArrayList<Integer>();

        for (int i = 0; i < reviewList.size(); i++) {
            if (reviewList.get(i).movieGenre.getGenre().equals(genre)) {
                indicies.add(i);
            }
        }

        return indicies;
    }

    public Movie getMovie(int index) {
        return reviewList.get(index);
    }

    public void removeReview(String movieName, String director) {
        int index = movieExists(movieName, director);
        if (index != -1) {
            reviewList.remove(index);
        } else {
            System.out.println("The movie " + movieName + " with " + director + " as the director does not exists");
        }
    }

    public void sortByRating() {
        Sorts.sort(reviewList, new ReviewRatingComparator());
    }

    // lists out all the reviews in review list
    public String listReviews() {
        String result = "";
        for (Movie review : reviewList) {
            result += review.toString();
        }
        return result;
    }

    // clears the reviewList of all movies
    public void closeReviewManager() {
        reviewList.clear();
    }
}
