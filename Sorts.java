import java.util.*;

public class Sorts {
	public static void sort(ArrayList<Movie> reviewList, Comparator<Movie> xComparator) {
		quickSort(reviewList, xComparator, 0, reviewList.size() - 1);
	}

	private static void quickSort(ArrayList<Movie> reviewList, Comparator<Movie> xComparator, int start,
			int end) {
		if (start < end) {
			System.out.println("Before: p=" + start + ":" + end + " | " + reviewList.toString());
			int p = partition(reviewList, xComparator, start, end);
			System.out.println("After p1: p=" + p + " | " + reviewList.toString());
			quickSort(reviewList, xComparator, start, p - 1);
			System.out.println("After q1: " + reviewList.toString());
			quickSort(reviewList, xComparator, p + 1, end);
			System.out.println("After q2: " + reviewList.toString());
		}
	}

	private static int partition(ArrayList<Movie> reviewList, Comparator<Movie> xComparator, int start, int end) {
		Movie pivot = reviewList.get(end);
		int i = start - 1;
		int j = end + 1;

		while (i < j) { // while i is less than j, or until they cross eachother
			i++; // increment i
			while (xComparator.compare(reviewList.get(i), pivot) >= 0) {
				// if the value at i is greater than the pivot
				i++;
			}
			j--;
			while (xComparator.compare(reviewList.get(j), pivot) <= 0) {
				// if the value at i is greater than the pivot
				j--;
			}
			if (i < j) {
				// swap the values at i and j
				Collections.swap(reviewList, i, j);
			}
		}
		return j; // the next pivot point
	}
}
