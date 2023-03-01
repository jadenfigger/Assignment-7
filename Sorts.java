import java.util.ArrayList;
import java.util.Comparator;

public class Sorts {
	public static void sort(ArrayList<Movie> reviewList, Comparator<Movie> xComparator) {
		swap(reviewList.get(0), reviewList.get(1));
	}

	private static void swap(Object first, Object second) {
		Object temp = second;
		second = first;
		first = temp;
	}

	private static ArrayList<Object>
}
