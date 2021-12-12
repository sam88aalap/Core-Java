
public class Question10 {
	
	public static int remDup(int[] nums) {
        int index = 1;
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] != nums[index-1])
               nums[index++] = nums[i];
       }
	  return index;
   }
	
	public static void main(String[] args) {
        int nums[] = {1,1,2,3,5,4,4,6,7,8,8,9,3,2};  
		System.out.println("Original array length: "+nums.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
		System.out.println("\nThe length of the array after removing duplicates: "+remDup(nums));
			
    }
   
}
