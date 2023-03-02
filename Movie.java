// Assignment: 7
// Name: Jaden Figger
// StudentID: 1225024528
// Lecture: 1:30
// Description: The Movie class that will contain all the details for a 
// movie. Will impliment the Serializable interface. 

import java.io.Serializable;

public class Movie implements Serializable {
    public final long serialVersionUID = 210L;
    protected String movieName;
    protected int stars;
    protected String review;
    protected int totalCollection;
    protected String director;
    protected MovieGenre movieGenre;

    public Movie(String movieName, int stars, String review, int totalCollection, String director,
            MovieGenre movieGenre) {
        this.movieName = movieName;
        this.stars = stars;
        this.review = review;
        this.totalCollection = totalCollection;
        this.director = director;
        this.movieGenre = movieGenre;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public int getStars() {
        return this.stars;
    }

    public int getTotalCollection() {
        return this.totalCollection;
    }

    public String getDirector() {
        return this.director;
    }

    public String getReview() {
        return this.review;
    }

    public MovieGenre getMovieGenre() {
        return this.movieGenre;
    }

    @Override
    public String toString() {
        // add STARSTRING
        // add TOTALCOLLECTIONSTRING
        // String result = movieName + " movie\n" + [STARSTRING] + "\n" +
        // "Total Collection earned: " + [TOTALCOLLECTIONSTRING] + "\n" +
        // movieGenre.toString() + "Director: " + director + "\n" +
        // "Review:\t" + review + "\n\n";
        // return result;
        String result = movieName + ",";
        // result += ":" + movieName + "  ";

        return result;
    }
}
