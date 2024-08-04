public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sfe = {0, 1};
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target){
                   sfe[0] = i;
                   sfe[1] = j;
                  // break;
                }
            }
        }
    return sfe;
    }
}