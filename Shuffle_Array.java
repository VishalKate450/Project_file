import java.util.Arrays;
import java.util.Random;
public class ShuffleArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5,6,7};
		Random r = new Random();
		for(int i=0;i<arr.length;i++) {
			int randIndex = r.nextInt(arr.length);
			
			int temp = arr[randIndex];
			arr[randIndex]=arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));	//[1, 6, 5, 2, 7, 4, 3]
	}
}
