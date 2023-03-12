import java.util.*;

public class QuickSort
{
  private static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
    
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the length of the array to be sorted: ");
    int length = scan.nextInt();
    int[] arr = new int[length];
    System.out.print("Enter the numbers separted by space: ");
    for(int i = 0; i < length; i++) {
        arr[i] = scan.nextInt();
    }

    quicksort(arr, 0, (arr.length - 1));

    System.out.print("Sorted array: ");
    for(int i = 0;  i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
  }
	
	private static void quicksort(int[] arr, int start, int end) {
    if(start < end) {
        int midPoint = partition(arr, start, end);
        quicksort(arr, start, (midPoint - 1));
        quicksort(arr, (midPoint + 1), end);
    }
	}
	
	private static int partition(int[] arr, int start, int end) {
    int i = 0;
    int pivot = end;

    while(i < pivot) {
      if(arr[i] <= arr[pivot]) {
          i++;
      } else {
          swap(arr, pivot, (pivot - 1));
          if((pivot - 1) != i) {
              swap(arr, pivot, i);   
          }
          pivot--;
      }
    }

    return pivot;
  }
}
