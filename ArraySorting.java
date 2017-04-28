import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySorting srt = new ArraySorting();
		int[] toBeSorted = { 21, 3, 10, 2, 5, 23, 7 };
		int[] insertArray = { 44, 32, 11, 20, 1, 5 };
		srt.selectionSort(toBeSorted);
		for (int i : toBeSorted)
			System.out.println(i);
		//srt.insertionSortForOrderedArray(toBeSorted, 0);
		//srt.insertionSortForUnOrderedArray(insertArray, 0);

	}

	public void insertionSortForUnOrderedArray(int[] sorted, int newVal) {
		int tmp = 0;
		sorted = Arrays.copyOf(sorted, sorted.length + 1);
		System.out.println("unordered array sorting::");
		sorted[sorted.length - 1] = newVal;
		for (int j = sorted.length - 1; j > 0; j--)
			for (int i = sorted.length - 1; i > 0; i--) {
				if (sorted[i] < sorted[i - 1]) {
					tmp = sorted[i - 1];
					sorted[i - 1] = sorted[i];
					sorted[i] = tmp;
				}
			}
		for (int i : sorted)
			System.out.println(i);
	}

	public void insertionSortForOrderedArray(int[] sorted, int newVal) {
		int tmp = 0;
		sorted = Arrays.copyOf(sorted, sorted.length + 1);
		System.out.println("ordered array sorting");
		sorted[sorted.length - 1] = newVal;
		for (int i = sorted.length - 1; i > 0; i--) {
			if (sorted[i] < sorted[i - 1]) {
				tmp = sorted[i - 1];
				sorted[i - 1] = sorted[i];
				sorted[i] = tmp;
			}
		}
		for (int i : sorted)
			System.out.println(i);
	}

	public void selectionSortDummy(int[] unsorted) {
		int tmp = 0;
		for (int j = 0; j < unsorted.length - 2; j++)
			for (int i = 0; i < unsorted.length - 1; i++) {
				if (unsorted[i] > unsorted[i + 1]) {
					tmp = unsorted[i];
					unsorted[i] = unsorted[i + 1];
					unsorted[i + 1] = tmp;
				}
			}
	}

	public void insertionSort(int[] unsorted) {

	}

	// selection sort - find smallest value and replaces it with 1st index
	// position. repeat for 2nd smallest value and swap with 2nd position.
	public void selectionSort(int[] unSorted) {
		int tmp = 0;
		int minIndex = 0;
		for(int i = 0; i < unSorted.length-1;i++){
			minIndex = i;
			for(int j = i+1; j  <= unSorted.length-1;j++){
				if(unSorted[j] < unSorted[minIndex])
					minIndex = j;
			}
			tmp = unSorted[i];
			unSorted[i] = unSorted[minIndex];
			unSorted[minIndex] = tmp;
		}
	}
}
