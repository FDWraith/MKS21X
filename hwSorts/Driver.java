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
	//System.out.println(a1A);
	//System.out.println(a1B);
	Arrays.sort(a1A);
	Sorts.insertion(a1B);
	Sorts.selection(a1C);
	System.out.print(Arrays.equals(a1A, a1B));//confirmed true with different addresses between the two arrays.
	System.out.println(Arrays.equals(a1A,a1C));

	//testing a2
	int[]a2A = a2.clone();
	int[]a2B = a2.clone();
	int[]a2C = a2.clone();
	Arrays.sort(a2A);
	Sorts.insertion(a2B);
	Sorts.selection(a2C);
	//System.out.print(Arrays.toString(a2C));
	//System.out.print(Arrays.toString(a2A));
	System.out.print(Arrays.equals(a2A,a2B));
	System.out.println(Arrays.equals(a2A,a2C));
	
	//testing a3
	int[]a3A = a3.clone();
	int[]a3B = a3.clone();
	int[]a3C = a3.clone(); 
	Arrays.sort(a3A);
	Sorts.insertion(a3B);
	Sorts.selection(a3C);
	System.out.print(Arrays.equals(a3A,a3B));
	System.out.println(Arrays.equals(a3A,a3C));
    }
}
