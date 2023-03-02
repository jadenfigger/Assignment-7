import java.util.*;

public class Sorts {
	public static void sort(ArrayList<Movie> reviewList, Comparator<Movie> xComparator) {
		quickSort(reviewList, xComparator, 0, reviewList.size() - 1);
	}

	private static void quickSort(ArrayList<Movie> reviewList, Comparator<Movie> xComparator, int start,
			int end) {
		if (start < end) {
			// System.out.println("Before: " + start + ":" + end + " | " +
					// reviewList.toString());
			int p = partition(reviewList, xComparator, start, end);
			// System.out.println("After p1: p=" + p + " | " + reviewList.toString());
			quickSort(reviewList, xComparator, start, p - 1);
			// System.out.println("After q1: " + reviewList.toString());
			quickSort(reviewList, xComparator, p + 1, end);
			// System.out.println("After q2: " + reviewList.toString());
		}
	}

	private static int partition(ArrayList<Movie> reviewList, Comparator<Movie> xComparator, int start, int end) {
		Movie pivot = reviewList.get(end);
		int i = start;
		int j = end;

		while (i < j) { // while i is less than j, or until they cross eachother increment i
			// System.out.println("bi: " + i);
			// System.out.println("bic: " + xComparator.compare(reviewList.get(i), pivot));
			while (xComparator.compare(reviewList.get(i), pivot) <= 0 && i < end) {
				// if the value at i is greater than the pivot
				i++;
			}
			// System.out.println("ai: " + i);
			// System.out.println("bj: " + j);
			// System.out.println("bjc: " + xComparator.compare(reviewList.get(j), pivot));
			while (xComparator.compare(reviewList.get(j), pivot) > 0 && j > start) {
				// if the value at i is greater than the pivot
				j--;
			}
			// System.out.println("aj: " + j);
			if (i < j && xComparator.compare(reviewList.get(j), reviewList.get(i)) != 0) {
				// swap the values at i and j
				Collections.swap(reviewList, i, j);
				// System.out.println("Swapped: i=" + i + ", j=" + j + " |" + reviewList);
			}
		}
		return j; // the next pivot point
	}
}
