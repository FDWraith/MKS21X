import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
	int[]a1 = { 1, 2, 3, 4, 2};
	int[]a2 = { 3, 4, 2, 1, 0};
	int[]a3 = { 0, 0, 0, 0, 0};

        //testing a1
	int[]a1A = a1.clone();
	int[]a1B = a1.clone();
	int[]a1C = a1.clone();
	int[]a1D = a1.clone();
	//System.out.println(a1A);
	//System.out.println(a1B);
	Arrays.sort(a1A);
	Sorts.insertionSort(a1B);
	Sorts.selectionSort(a1C);
	Sorts.bubbleSort(a1D);
	System.out.print(Arrays.equals(a1A, a1B));//confirmed true with different addresses between the two arrays.
	System.out.println(Arrays.equals(a1A,a1C));

	//testing a2
	int[]a2A = a2.clone();
	int[]a2B = a2.clone();
	int[]a2C = a2.clone();
	Arrays.sort(a2A);
	Sorts.insertionSort(a2B);
	Sorts.selectionSort(a2C);
	//System.out.print(Arrays.toString(a2C));
	//System.out.print(Arrays.toString(a2A));
	System.out.print(Arrays.equals(a2A,a2B));
	System.out.println(Arrays.equals(a2A,a2C));
	
	//testing a3
	int[]a3A = a3.clone();
	int[]a3B = a3.clone();
	int[]a3C = a3.clone(); 
	Arrays.sort(a3A);
	Sorts.insertionSort(a3B);
	Sorts.selectionSort(a3C);
	System.out.print(Arrays.equals(a3A,a3B));
	System.out.println(Arrays.equals(a3A,a3C));

	System.out.println("------------------------");

	int[]test = {1,2,9,5,0,3};
	Sorts.bubbleSort(test);
	
    }
}
